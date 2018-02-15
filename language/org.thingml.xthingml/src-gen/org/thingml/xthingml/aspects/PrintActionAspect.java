package org.thingml.xthingml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.thingml.xthingml.aspects.ActionAspect;
import org.thingml.xthingml.aspects.ExpressionAspect;
import org.thingml.xthingml.aspects.PrintActionAspectPrintActionAspectProperties;
import org.thingml.xthingml.thingML.PrintAction;

@Aspect(className = PrintAction.class)
@SuppressWarnings("all")
public class PrintActionAspect extends ActionAspect {
  public static void execute(final PrintAction _self) {
	final org.thingml.xthingml.aspects.PrintActionAspectPrintActionAspectProperties _self_ = org.thingml.xthingml.aspects.PrintActionAspectPrintActionAspectContext
			.getSelf(_self);
	_privk3_execute(_self_, _self);
	;
}
  
  protected static void _privk3_execute(final PrintActionAspectPrintActionAspectProperties _self_, final PrintAction _self) {
    InputOutput.<Object>print(ExpressionAspect.evaluate(_self.getMsg().get(0)));
  }
}
