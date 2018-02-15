package org.thingml.xthingml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.thingml.xthingml.aspects.StateAspectStateAspectProperties;
import org.thingml.xthingml.thingML.State;
import org.thingml.xthingml.thingML.Transition;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static Transition getTransition(final State _self) {
	final org.thingml.xthingml.aspects.StateAspectStateAspectProperties _self_ = org.thingml.xthingml.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_getTransition(_self_, _self);
	;
	return (org.thingml.xthingml.thingML.Transition) result;
}
  
  protected static Transition _privk3_getTransition(final StateAspectStateAspectProperties _self_, final State _self) {
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      return Boolean.valueOf(((t.getGuard() == null) && (t.getEvent() == null)));
    };
    final Iterable<Transition> validTransitions = IterableExtensions.<Transition>filter(_self.getOutgoing(), _function);
    boolean _isEmpty = IterableExtensions.isEmpty(validTransitions);
    if (_isEmpty) {
      return null;
    } else {
      return ((Transition[])Conversions.unwrapArray(validTransitions, Transition.class))[0];
    }
  }
}
