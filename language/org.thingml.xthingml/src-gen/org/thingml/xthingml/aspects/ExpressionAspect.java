package org.thingml.xthingml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.thingml.xthingml.aspects.ExpressionAspectExpressionAspectProperties;
import org.thingml.xthingml.thingML.Expression;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static Object evaluate(final Expression _self) {
	final org.thingml.xthingml.aspects.ExpressionAspectExpressionAspectProperties _self_ = org.thingml.xthingml.aspects.ExpressionAspectExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.thingml.xthingml.thingML.LowerOrEqualExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.LowerOrEqualExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ExternExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.ExternExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.FunctionCallExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.FunctionCallExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ModExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.ModExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.NotExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.NotExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.PropertyReference) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.PropertyReference) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ArrayIndex) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.ArrayIndex) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.CastExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.CastExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.AndExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.AndExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.EnumLiteralRef) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.EnumLiteralRef) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.GreaterOrEqualExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.GreaterOrEqualExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ByteLiteral) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.ByteLiteral) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.GreaterExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.GreaterExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.EqualsExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.EqualsExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.LowerExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.LowerExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.OrExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.OrExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.MinusExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.MinusExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.BooleanLiteral) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.BooleanLiteral) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.UnaryMinus) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.UnaryMinus) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.PlusExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.PlusExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.EventReference) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.EventReference) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.TimesExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.TimesExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.IntegerLiteral) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.IntegerLiteral) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.StringLiteral) {
		result = org.thingml.xthingml.aspects.StringLiteralAspect
				.evaluate((org.thingml.xthingml.thingML.StringLiteral) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.CharLiteral) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.CharLiteral) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.DoubleLiteral) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.DoubleLiteral) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.ExpressionGroup) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.ExpressionGroup) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.NotEqualsExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.NotEqualsExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.DivExpression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.DivExpression) _self);
	} else if (_self instanceof org.thingml.xthingml.thingML.Expression) {
		result = org.thingml.xthingml.aspects.ExpressionAspect._privk3_evaluate(_self_,
				(org.thingml.xthingml.thingML.Expression) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.Object) result;
}
  
  protected static Object _privk3_evaluate(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
    return null;
  }
}
