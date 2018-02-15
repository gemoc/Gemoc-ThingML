package org.thingml.k3;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.thingml.k3.ExpressionAspectExpressionAspectProperties;
import org.thingml.xtext.thingML.Expression;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object evaluate(final Expression _self) {
    final org.thingml.k3.ExpressionAspectExpressionAspectProperties _self_ = org.thingml.k3.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.thingml.xtext.thingML.StringLiteral){
    					result = org.thingml.k3.StringLiteralAspect.evaluate((org.thingml.xtext.thingML.StringLiteral)_self);
    } else  if (_self instanceof org.thingml.xtext.thingML.Expression){
    					result = org.thingml.k3.ExpressionAspect._privk3_evaluate(_self_, (org.thingml.xtext.thingML.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
    return null;
  }
}
