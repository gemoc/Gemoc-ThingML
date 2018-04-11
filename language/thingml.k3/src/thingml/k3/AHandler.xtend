package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.thingml.xtext.thingML.Handler
import org.thingml.xtext.thingML.InternalTransition
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.Transition
import thingML.BooleanValue
import thingML.DynamicInstance

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.AExpression.*
import static extension thingml.k3.AState.*

@Aspect(className=Handler)
class AHandler extends AEObject {
	def public boolean isValid(DynamicInstance dynamicInstance) {
		_self.tab

		var guardOK = _self.guard === null
		if (!guardOK) {
			_self.log("Evaluate guard '" + _self.guard._str + "'")
			_self.tab
			val guardValue = _self.guard.value(dynamicInstance, false)
			_self.detab
			guardOK = (guardValue as BooleanValue).value
		}

		_self.detab
		return guardOK
	}

	@Step
	def public State fire(State state, DynamicInstance dynamicInstance) {
		_self.log("Firing Internal transition '" + _self.name + "'")
		_self.tab
		_self.action.execute(dynamicInstance)
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
		state.onExit(dynamicInstance)
		if (_self.action !== null) {
			_self.log("Execute transition body")
			_self.tab
			_self.action.execute(dynamicInstance)
			_self.detab
		}
		_self.target.onEntry(dynamicInstance)
		_self.detab
		return _self.target
	}
}
