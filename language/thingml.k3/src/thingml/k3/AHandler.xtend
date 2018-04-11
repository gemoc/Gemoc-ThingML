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
import thingml.utils.Log

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.AExpression.*
import static extension thingml.k3.AState.*

@Aspect(className=Handler)
class AHandler {
	def public boolean isValid(DynamicInstance dynamicInstance) {
		Log.tab

		var guardOK = _self.guard === null
		if (!guardOK) {
			Log.log("Evaluate guard '" + _self.guard._str + "'")
			Log.tab
			val guardValue = _self.guard.value(dynamicInstance, false)
			Log.detab
			guardOK = (guardValue as BooleanValue).value
		}

		Log.detab
		return guardOK
	}

	@Step
	def public State fire(State state, DynamicInstance dynamicInstance) {
		Log.log("Firing Internal transition '" + _self.name + "'")
		Log.tab
		_self.action.execute(dynamicInstance)
		Log.detab
		return state
	}
}

@Aspect(className=InternalTransition)
class AInternalTransition extends AHandler {
	@OverrideAspectMethod
	def public boolean isValid(DynamicInstance dynamicInstance) {
		Log.log("Test Internal Transition '" + _self.name + "'")
		return _self.super_isValid(dynamicInstance)
	}
}

@Aspect(className=Transition)
class ATransition extends AHandler {
	@OverrideAspectMethod
	def public boolean isValid(DynamicInstance dynamicInstance) {
		Log.log("Test Transition '" + _self.name + "' (-> '" + _self.target.name + "')")
		return _self.super_isValid(dynamicInstance)
	}

	@OverrideAspectMethod
	@Step
	def public State fire(State state, DynamicInstance dynamicInstance) {
		Log.log("Firing Transition '" + _self.name + "' (-> '" + _self.target.name + "')")
		Log.tab
		state.onExit(dynamicInstance)
		if (_self.action !== null) {
			Log.log("Execute transition body")
			Log.tab
			_self.action.execute(dynamicInstance)
			Log.detab
		}
		_self.target.onEntry(dynamicInstance)
		Log.detab
		return _self.target
	}
}
