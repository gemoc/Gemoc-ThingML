package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.thingml.xtext.thingML.Handler
import org.thingml.xtext.thingML.InternalTransition
import org.thingml.xtext.thingML.ReceiveMessage
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.Transition
import thingML.BooleanValue
import thingML.DynamicInstance
import thingML.DynamicMessage

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.ADynamicInstance.*
import static extension thingml.k3.AExpression.*
import static extension thingml.k3.AState.*
import static extension thingml.k3.AValue.*

@Aspect(className=Handler)
class AHandler extends AEObject {
	def public boolean isValid(DynamicInstance dynamicInstance) {
		_self.tab
		
		var eventOK = _self.event === null

		var guardOK = _self.guard === null
		if ((!guardOK) && eventOK) {
			_self.log("Evaluate guard '" + _self.guard._str + "'")
			_self.tab
			val guardValue = _self.guard.value(dynamicInstance, false)
			_self.detab
			guardOK = (guardValue as BooleanValue).value
		}

		if (!eventOK) {
			if (_self.event instanceof ReceiveMessage) {
				val messageEvent = _self.event as ReceiveMessage
				val dynamicPort = dynamicInstance.getDynamicPort(messageEvent.port)

				var events = ""
				for (DynamicMessage rm : dynamicPort.receivedMessages) {
					var params = rm.parameters.fold("", [s,p|s + p._str + ", "])
					if (params.length > 2) {
						params = params.substring(0, params.length - 2)
					}
					events += rm.message.name + "(" + params + "), "
				}
				if (events.length > 2) {
					events = events.substring(0, events.length - 2)
				}
				_self.log("Search message '" + messageEvent.message.name + "' in [" + events + "]")

				var messageIndex = 0
				for (; !(eventOK && guardOK) && messageIndex < dynamicPort.receivedMessages.length; messageIndex++) {
					val dynamicMessage = dynamicPort.receivedMessages.get(messageIndex)
					if (dynamicMessage.message == messageEvent.message) {
						eventOK = true
						for (var j = 0; j < messageEvent.message.parameters.length; j++) {
							val parameter = messageEvent.message.parameters.get(j)
							val value = dynamicMessage.parameters.get(j)
							dynamicInstance.addVariable(parameter, value)
						}
						if (!guardOK) {
							_self.log("Evaluate guard '" + _self.guard._str + "'")
							_self.tab
							val guardValue = _self.guard.value(dynamicInstance, false)
							_self.detab
							guardOK = (guardValue as BooleanValue).value
						}
						dynamicInstance.clearContext()
					}
				}
			} else {
				throw new Exception("What can it be?")
			}
		}
		
		_self.detab
		return eventOK && guardOK
	}

	def public void _consumeEvent(DynamicInstance dynamicInstance) {
		if (_self.event !== null) {
			if (_self.event instanceof ReceiveMessage) {
				val messageEvent = _self.event as ReceiveMessage
				val dynamicPort = dynamicInstance.getDynamicPort(messageEvent.port)
				
				var guardOK = _self.guard === null
				if (guardOK) {
					val dynamicMessage = dynamicPort.receivedMessages.findFirst[dm|dm.message === messageEvent.message]
					dynamicPort.receivedMessages.remove(dynamicMessage)
					for (var i = 0; i < messageEvent.message.parameters.length; i++) {
						val parameter = messageEvent.message.parameters.get(i)
						val value = dynamicMessage.parameters.get(i)
						dynamicInstance.addVariable(parameter, value)
					}
				} else {
					for (var messageIndex = 0; !guardOK && messageIndex < dynamicPort.receivedMessages.length; messageIndex++) {
						val dynamicMessage = dynamicPort.receivedMessages.get(messageIndex)
						if (dynamicMessage.message == messageEvent.message) {
							for (var j = 0; j < messageEvent.message.parameters.length; j++) {
								val parameter = messageEvent.message.parameters.get(j)
								val value = dynamicMessage.parameters.get(j)
								dynamicInstance.addVariable(parameter, value)
							}
							_self.log("Evaluate guard '" + _self.guard._str + "'", 2)
							_self.tab
							val guardValue = _self.guard.value(dynamicInstance, false)
							_self.detab
							guardOK = (guardValue as BooleanValue).value
							if (guardOK) {
								dynamicPort.receivedMessages.remove(dynamicMessage)
							} else {
								dynamicInstance.clearContext()
							}
						}
					}
				}
			} else {
				throw new Exception("What can it be?")
			}
		}
	}

	@Step
	def public State fire(State state, DynamicInstance dynamicInstance) {
		_self.log("Firing Internal transition '" + _self.name + "'")
		_self.tab
		_self.log("Consume event", 2)
		_self.tab
		_self._consumeEvent(dynamicInstance)
		_self.detab
		_self.action.execute(dynamicInstance)
		dynamicInstance.clearContext()
		_self.detab
		return state
	}
}

@Aspect(className=InternalTransition)
class AInternalTransition extends AHandler {
	@OverrideAspectMethod
	def public boolean isValid(DynamicInstance dynamicInstance) {
		_self.log("Test Internal Transition '" + _self.name + "'")
		return _self.super_isValid(dynamicInstance)
	}
}

@Aspect(className=Transition)
class ATransition extends AHandler {
	@OverrideAspectMethod
	def public boolean isValid(DynamicInstance dynamicInstance) {
		_self.log("Test Transition '" + _self.name + "' (-> '" + _self.target.name + "')")
		return _self.super_isValid(dynamicInstance)
	}

	@OverrideAspectMethod
	@Step
	def public State fire(State state, DynamicInstance dynamicInstance) {
		_self.log("Firing Transition '" + _self.name + "' (-> '" + _self.target.name + "')")
		_self.tab
		_self._consumeEvent(dynamicInstance)
		state.onExit(dynamicInstance)
		if (_self.action !== null) {
			_self.log("Execute transition body")
			_self.tab
			_self.action.execute(dynamicInstance)
			_self.detab
			dynamicInstance.clearContext()
		}
		_self.target.onEntry(dynamicInstance)
		_self.detab
		return _self.target
	}
}
