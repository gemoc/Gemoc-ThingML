package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.State
import thingML.DynamicInstance

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.ADynamicInstance.getDynamicCompositeState
import static extension thingml.k3.AHandler.*

@Aspect(className=State)
class AState {
	@Step
	def public boolean runSpontaneousTransitions(DynamicInstance dynamicInstance) {
		println(dynamicInstance.instance.name + ": Trying to move from State '" + _self.name + "'")
		val spontaneousOutgoings = _self.outgoing.filter[t|t.event === null]
		val spontaneousInternals = _self.internal.filter[i|i.event === null]
		val spontaneousTransitions = spontaneousOutgoings + spontaneousInternals
		val validSpontaneousTransitions = spontaneousTransitions.filter[h|h.isValid(dynamicInstance)].toList()
		if (!validSpontaneousTransitions.empty) {
			val transition = validSpontaneousTransitions.get(0)
			val newState = transition.fire(_self, dynamicInstance)
			// TODO change state (while _self.parentState !== newState.parentState)
			// dynamicInstance.getDynamicCompositeState(_self.eContainer as CompositeState).currentState = newState
			println("/!\\ WARNING /!\\ STATE SWITCH IS NOT IMPLEMENTED YET !!")
			return true
		}
		println("It didn't move...")
		return false
	}

	@Step
	def public boolean run(DynamicInstance dynamicInstance) {
		var hasChanged = false
		hasChanged = hasChanged || _self.runSpontaneousTransitions(dynamicInstance)
		return hasChanged
	}

	def public void onEntry(DynamicInstance dynamicInstance) {
		if (_self.entry !== null) {
			println("Executing '" + _self.name + ".entry' for instance '" + dynamicInstance.instance.name + "'")
			_self.entry.execute(dynamicInstance)
		}
	}

	def public void onExit(DynamicInstance dynamicInstance) {
		if (_self.exit !== null) {
			println("Executing '" + _self.name + ".exit' for instance '" + dynamicInstance.instance.name + "'")
			_self.exit.execute(dynamicInstance)
		}
	}
}

@Aspect(className=CompositeState)
class ACompositeState extends AState {
	@OverrideAspectMethod
	def public boolean runSpontaneousTransitions(DynamicInstance dynamicInstance) {
		var hasMoved = _self.super_runSpontaneousTransitions(dynamicInstance)
		if (!hasMoved) {
			println("But was a CompositeState! Then, trying with child")
			hasMoved = dynamicInstance.getDynamicCompositeState(_self).currentState.
				runSpontaneousTransitions(dynamicInstance)
		}
		return hasMoved
	}
}
