package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.FinalState
import org.thingml.xtext.thingML.Handler
import org.thingml.xtext.thingML.State
import thingML.DynamicInstance

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.ADynamicInstance.getDynamicCompositeState
import static extension thingml.k3.AHandler.*
import static extension thingml.k3.AInstance.running

@Aspect(className=State)
class AState extends AEObject {
	def public EList<CompositeState> _getRootPath(State state) {
		val path = new BasicEList<CompositeState>()
		var parent = state.eContainer
		while (parent instanceof CompositeState) {
			path.add(0, state.eContainer as CompositeState)
			parent = parent.eContainer
		}
		return path
	}

	def public EList<CompositeState> _getPathToState(DynamicInstance dynamicInstance, State state1, State state2) {
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
		_self.log("Common ancestor is : " + ancestorToNewState.head.name, 2)
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
		// TODO remove the events from ports that cannot be used in this state
		println("/!\\ WARNING /!\\ BAD EVENTS ARE KEPT WHEN SWITCHING STATE !!")
	}

	@Step
	def public boolean runATransition(DynamicInstance dynamicInstance, boolean spontaneous) {
		_self.log(dynamicInstance.instance.name + ": Trying to move from State '" + _self.name + "'")
		_self.tab
		var Iterable<Handler> transitions
		if (spontaneous) {
			transitions = _self.internal.filter[i|i.event === null] + _self.outgoing.filter[t|t.event === null]
		} else {
			transitions = _self.internal.filter[i|i.event !== null] + _self.outgoing.filter[t|t.event !== null]
		}
		for (Handler transition : transitions) {
			if (transition.isValid(dynamicInstance)) {
				val newState = transition.fire(_self, dynamicInstance)
				if (_self !== newState) {
					_self.log(dynamicInstance.instance.name + ": Switching state -> " + newState.name)
					_self.tab
					_self._switchState(dynamicInstance, newState)
					_self.detab
					if (newState instanceof FinalState) {
						_self.log(dynamicInstance.instance.name + ": Entered final state")
						dynamicInstance.instance.running = false
					}
				} else {
					_self.log("Staying in state '" + _self.name + "'")
				}
				_self.detab
				return true
			}
		}
		_self.detab
		return false
	}

	def public void onEntry(DynamicInstance dynamicInstance) {
		if (_self.entry !== null) {
			_self.log(dynamicInstance.instance.name + ": " + _self.name + ".entry")
			_self.tab
			_self.entry.execute(dynamicInstance)
			_self.detab
		}
	}

	def public void onExit(DynamicInstance dynamicInstance) {
		if (_self.exit !== null) {
			_self.log(dynamicInstance.instance.name + ": " + _self.name + ".exit")
			_self.tab
			_self.exit.execute(dynamicInstance)
			_self.detab
		}
	}
}

@Aspect(className=CompositeState)
class ACompositeState extends AState {
	@Step
	@OverrideAspectMethod
	def public boolean runATransition(DynamicInstance dynamicInstance, boolean spontaneous) {
		var boolean hasMoved

		val currentState = dynamicInstance.getDynamicCompositeState(_self).currentState
		if (spontaneous) {
			hasMoved = _self.super_runATransition(dynamicInstance, spontaneous) || currentState.runATransition(dynamicInstance, spontaneous)
		} else {
			hasMoved = currentState.runATransition(dynamicInstance, spontaneous) || _self.super_runATransition(dynamicInstance, spontaneous)
		}

		return hasMoved
	}
}
