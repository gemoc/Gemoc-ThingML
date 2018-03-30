package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.LinkedList
import java.util.List
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.State
import thingML.DynamicInstance

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.ADynamicInstance.getDynamicCompositeState
import static extension thingml.k3.AHandler.*

@Aspect(className=State)
class AState {
	def public List<CompositeState> _getRootPath(State state) {
		val path = new LinkedList<CompositeState>()
		var parent = state.eContainer
		while (parent instanceof CompositeState) {
			path.addFirst(state.eContainer as CompositeState)
			parent = parent.eContainer
		}
		return path
	}

	def public List<CompositeState> _getPathToState(DynamicInstance dynamicInstance, State state1, State state2) {
		var CompositeState ancestor
		val path1 = _self._getRootPath(state1)
		val path2 = _self._getRootPath(state2)
		while (!path1.empty && !path2.empty && (path1.head == path2.head)) {
			path1.remove(0)
			ancestor = path2.remove(0)
		}
		path2.add(0, ancestor)
		return path2
	}

	def public void _switchState(DynamicInstance dynamicInstance, State newState) {
		val ancestorToNewState = _self._getPathToState(dynamicInstance, _self, newState)
		println("Common ancestor is : " + ancestorToNewState.head.name)
		var compositeState = _self.eContainer as CompositeState
		while (compositeState !== ancestorToNewState.head) {
			dynamicInstance.getDynamicCompositeState(compositeState as CompositeState).currentState = null
			compositeState = compositeState.eContainer as CompositeState
		}
		compositeState = ancestorToNewState.remove(0)
		while (!ancestorToNewState.empty) {
			dynamicInstance.getDynamicCompositeState(compositeState).currentState = ancestorToNewState.head
			compositeState = ancestorToNewState.remove(0)
		}
		dynamicInstance.getDynamicCompositeState(compositeState).currentState = newState
	}

	@Step
	def public boolean runSpontaneousTransitions(DynamicInstance dynamicInstance) {
		println(dynamicInstance.instance.name + ": Trying to move from State '" + _self.name + "'")
		val spontaneousOutgoings = _self.outgoing.filter[t|t.event === null]
		val spontaneousInternals = _self.internal.filter[i|i.event === null]
		val spontaneousTransitions = spontaneousOutgoings + spontaneousInternals
		val validSpontaneousTransitions = spontaneousTransitions.filter[h|h.isValid(dynamicInstance)].toList
		if (!validSpontaneousTransitions.empty) {
			val transition = validSpontaneousTransitions.get(0)
			val newState = transition.fire(_self, dynamicInstance)
			_self._switchState(dynamicInstance, newState)
			return true
		}
		println("It didn't move...")
		return false
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
