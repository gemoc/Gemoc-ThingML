package org.thingml.xthingml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.thingml.xthingml.aspects.ActionAspectActionAspectProperties;
import org.thingml.xthingml.thingML.Action;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public class ActionAspect {
  public static void execute(final Action _self) {
	final org.thingml.xthingml.aspects.ActionAspectActionAspectProperties _self_ = org.thingml.xthingml.aspects.ActionAspectActionAspectContext
			.getSelf(_self);
	if (_self instanceof org.thingml.xthingml.thingML.LoopAction) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.LoopAction) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.VariableAssignment) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.VariableAssignment) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ErrorAction) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.ErrorAction) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.FunctionCallStatement) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.FunctionCallStatement) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.Decrement) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.Decrement) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ExternStatement) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.ExternStatement) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.SendAction) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.SendAction) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.LocalVariable) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.LocalVariable) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ConditionalAction) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.ConditionalAction) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.Increment) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.Increment) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.PrintAction) {
		org.thingml.xthingml.aspects.PrintActionAspect.execute((org.thingml.xthingml.thingML.PrintAction) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.StartSession) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.StartSession) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ActionBlock) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.ActionBlock) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ReturnAction) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_,
				(org.thingml.xthingml.thingML.ReturnAction) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.Action) {
		org.thingml.xthingml.aspects.ActionAspect._privk3_execute(_self_, (org.thingml.xthingml.thingML.Action) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  protected static void _privk3_execute(final ActionAspectActionAspectProperties _self_, final Action _self) {
  }
}
