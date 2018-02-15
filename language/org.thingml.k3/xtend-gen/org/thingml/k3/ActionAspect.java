package org.thingml.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.thingml.k3.ActionAspectActionAspectProperties;
import org.thingml.xtext.thingML.Action;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public class ActionAspect {
  public static void execute(final Action _self) {
    final org.thingml.k3.ActionAspectActionAspectProperties _self_ = org.thingml.k3.ActionAspectActionAspectContext.getSelf(_self);
     if (_self instanceof org.thingml.xtext.thingML.PrintAction){
    					org.thingml.k3.PrintActionAspect.execute((org.thingml.xtext.thingML.PrintAction)_self);
    } else  if (_self instanceof org.thingml.xtext.thingML.Action){
    					org.thingml.k3.ActionAspect._privk3_execute(_self_, (org.thingml.xtext.thingML.Action)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ActionAspectActionAspectProperties _self_, final Action _self) {
  }
}
