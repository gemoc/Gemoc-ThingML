package org.thingml.xthingml.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.thingml.xthingml.aspects.ExpressionAspect;
import org.thingml.xthingml.aspects.StringLiteralAspectStringLiteralAspectProperties;
import org.thingml.xthingml.thingML.StringLiteral;

@Aspect(className = StringLiteral.class)
@SuppressWarnings("all")
public class StringLiteralAspect extends ExpressionAspect {
  public static String evaluate(final StringLiteral _self) {
	final org.thingml.xthingml.aspects.StringLiteralAspectStringLiteralAspectProperties _self_ = org.thingml.xthingml.aspects.StringLiteralAspectStringLiteralAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  protected static String _privk3_evaluate(final StringLiteralAspectStringLiteralAspectProperties _self_, final StringLiteral _self) {
    return _self.getStringValue().replace("\\n", "\n");
  }
}
