package org.thingml.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.thingml.k3.ActionAspect;
import org.thingml.k3.ExpressionAspect;
import org.thingml.k3.PrintActionAspectPrintActionAspectProperties;
import org.thingml.xtext.thingML.PrintAction;

@Aspect(className = PrintAction.class)
@SuppressWarnings("all")
public class PrintActionAspect extends ActionAspect {
  public static void execute(final PrintAction _self) {
    final org.thingml.k3.PrintActionAspectPrintActionAspectProperties _self_ = org.thingml.k3.PrintActionAspectPrintActionAspectContext.getSelf(_self);
     if (_self instanceof org.thingml.xtext.thingML.PrintAction){
    					org.thingml.k3.PrintActionAspect._privk3_execute(_self_, (org.thingml.xtext.thingML.PrintAction)_self);
    } else  if (_self instanceof org.thingml.xtext.thingML.Action){
    					org.thingml.k3.ActionAspect.execute((org.thingml.xtext.thingML.Action)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final PrintActionAspectPrintActionAspectProperties _self_, final PrintAction _self) {
    InputOutput.<Object>print(ExpressionAspect.evaluate(_self.getMsg().get(0)));
  }
}
