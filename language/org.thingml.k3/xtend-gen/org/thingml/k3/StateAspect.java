package org.thingml.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.thingml.k3.StateAspectStateAspectProperties;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.Transition;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  public static Transition getTransition(final State _self) {
    final org.thingml.k3.StateAspectStateAspectProperties _self_ = org.thingml.k3.StateAspectStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getTransition(_self_, _self);;
    return (org.thingml.xtext.thingML.Transition)result;
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
