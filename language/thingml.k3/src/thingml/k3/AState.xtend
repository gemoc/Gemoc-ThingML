package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.FinalState
import org.thingml.xtext.thingML.Handler
import org.thingml.xtext.thingML.ReceiveMessage
import org.thingml.xtext.thingML.State
import thingML.DynamicInstance
import thingML.DynamicMessage
import thingml.utils.Log

import static extension thingml.k3.AAction.execute
import static extension thingml.k3.ADynamicInstance.getDynamicCompositeState
import static extension thingml.k3.AHandler.*
import static extension thingml.k3.AInstance.running

@Aspect(className=State)
class AState {
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
		Log.log("Common ancestor is : " + ancestorToNewState.head.name, 2)
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
	def public boolean runASpontaneousTransition(DynamicInstance dynamicInstance) {
		Log.log(dynamicInstance.instance.name + ": Trying to move from State '" + _self.name + "'")
		Log.tab
		val transitions = _self.internal.filter[i|i.event === null] + _self.outgoing.filter[t|t.event === null]
		for (Handler transition : transitions) {
			if (transition.isValid(dynamicInstance)) {
				val newState = transition.fire(_self, dynamicInstance)
				if (_self !== newState) {
					Log.log(dynamicInstance.instance.name + ": Switching state -> " + newState.name)
					Log.tab
					_self._switchState(dynamicInstance, newState)
					Log.detab
					if (newState instanceof FinalState) {
						Log.log(dynamicInstance.instance.name + ": Entered final state")
						dynamicInstance.instance.running = false
					}
				} else {
					Log.log("Staying in state '" + _self.name + "'")
				}
				Log.detab
				return true
			}
		}
		Log.detab
		return false
	}

	@Step
	def public boolean runAEventDrivenTransition(DynamicInstance dynamicInstance, DynamicMessage dynamicMessage) {
		Log.log(dynamicInstance.instance.name + ": Trying to move from State '" + _self.name + "'")
		Log.tab
		val internals = _self.internal.filter [i|
			i.event instanceof ReceiveMessage && (i.event as ReceiveMessage).message === dynamicMessage.message
		]
		val outgoings = _self.outgoing.filter [o|
			o.event instanceof ReceiveMessage && (o.event as ReceiveMessage).message === dynamicMessage.message
		]
		val transitions = internals + outgoings
		for (Handler transition : transitions) {
			if (transition.isValid(dynamicInstance)) {
				val newState = transition.fire(_self, dynamicInstance)
				if (_self !== newState) {
					Log.log(dynamicInstance.instance.name + ": Switching state -> " + newState.name)
					Log.tab
					_self._switchState(dynamicInstance, newState)
					Log.detab
					if (newState instanceof FinalState) {
						Log.log(dynamicInstance.instance.name + ": Entered final state")
						dynamicInstance.instance.running = false
					}
				} else {
					Log.log("Staying in state '" + _self.name + "'")
				}
				Log.detab
				return true
			}
		}
		Log.detab
		return false
	}

	def public void onEntry(DynamicInstance dynamicInstance) {
		if (_self.entry !== null) {
			Log.log(dynamicInstance.instance.name + ": " + _self.name + ".entry")
			Log.tab
			_self.entry.execute(dynamicInstance)
			Log.detab
		}
	}

	def public void onExit(DynamicInstance dynamicInstance) {
		if (_self.exit !== null) {
			Log.log(dynamicInstance.instance.name + ": " + _self.name + ".exit")
			Log.tab
			_self.exit.execute(dynamicInstance)
			Log.detab
		}
	}
}

@Aspect(className=CompositeState)
class ACompositeState extends AState {
	@Step
	@OverrideAspectMethod
	def public boolean runASpontaneousTransition(DynamicInstance dynamicInstance) {
		val currentState = dynamicInstance.getDynamicCompositeState(_self).currentState
		return _self.super_runASpontaneousTransition(dynamicInstance) ||
			currentState.runASpontaneousTransition(dynamicInstance)
	}

	@Step
	@OverrideAspectMethod
	def public boolean runAEventDrivenTransition(DynamicInstance dynamicInstance, DynamicMessage dynamicMessage) {
		val currentState = dynamicInstance.getDynamicCompositeState(_self).currentState
		return currentState.runAEventDrivenTransition(dynamicInstance, dynamicMessage) ||
			_self.super_runAEventDrivenTransition(dynamicInstance, dynamicMessage)
	}
}
