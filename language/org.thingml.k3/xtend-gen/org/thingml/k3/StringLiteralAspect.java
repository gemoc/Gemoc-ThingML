package org.thingml.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.thingml.k3.ExpressionAspect;
import org.thingml.k3.StringLiteralAspectStringLiteralAspectProperties;
import org.thingml.xtext.thingML.StringLiteral;

@Aspect(className = StringLiteral.class)
@SuppressWarnings("all")
public class StringLiteralAspect extends ExpressionAspect {
  public static String evaluate(final StringLiteral _self) {
    final org.thingml.k3.StringLiteralAspectStringLiteralAspectProperties _self_ = org.thingml.k3.StringLiteralAspectStringLiteralAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.thingml.xtext.thingML.StringLiteral){
    					result = org.thingml.k3.StringLiteralAspect._privk3_evaluate(_self_, (org.thingml.xtext.thingML.StringLiteral)_self);
    } else  if (_self instanceof org.thingml.xtext.thingML.Expression){
    					result = org.thingml.k3.ExpressionAspect.evaluate((org.thingml.xtext.thingML.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_evaluate(final StringLiteralAspectStringLiteralAspectProperties _self_, final StringLiteral _self) {
    return _self.getStringValue().replace("\\n", "\n");
  }
}
