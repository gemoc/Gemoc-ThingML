package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.thingml.xtext.thingML.Handler
import org.thingml.xtext.thingML.ReceiveMessage
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.Transition
import thingML.BooleanValue
import thingML.DynamicInstance

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.ADynamicInstance.getDynamicPort
import static extension thingml.k3.AExpression.value
import static extension thingml.k3.AState.*

@Aspect(className=Handler)
class AHandler {
	def public boolean isValid(DynamicInstance dynamicInstance) {
		var eventOK = _self.event === null
		if (!eventOK) {
			if (_self.event instanceof ReceiveMessage) {
				val messageEvent = _self.event as ReceiveMessage
				val dynamicPort = dynamicInstance.getDynamicPort(messageEvent.port)
				for (var i = 0; !eventOK && i < dynamicPort.receivedMessages.length; i++) {
					val dynamicMessage = dynamicPort.receivedMessages.get(i)
					if (dynamicMessage.message == messageEvent.message) {
						eventOK = true
					}
				}
			} else {
				throw new Exception("What can it be?")
			}
		}
		var guardOK = _self.guard === null
		if (!guardOK) {
			val guardValue = _self.guard.value(dynamicInstance, false)
			guardOK = (guardValue as BooleanValue).value
		}
		return eventOK && guardOK
	}

	@Step
	def public State fire(State state, DynamicInstance dynamicInstance) {
		println("Firing Internal transition '" + _self.name + "'")
		_self.action.execute(dynamicInstance)
		return state
	}
}

@Aspect(className=Transition)
class ATransition extends AHandler {
	@OverrideAspectMethod
	@Step
	def public State fire(State state, DynamicInstance dynamicInstance) {
		println("Firing Transition '" + _self.name + "' (-> '" + _self.target.name + "')")
		state.onExit(dynamicInstance)
		if (_self.action !== null) {
			_self.action.execute(dynamicInstance)
		}
		_self.target.onEntry(dynamicInstance)
		return _self.target
	}
}
