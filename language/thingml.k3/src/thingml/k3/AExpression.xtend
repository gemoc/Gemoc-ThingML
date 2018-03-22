package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.IntegerLiteral
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyReference
import org.thingml.xtext.thingML.StringLiteral
import org.thingml.xtext.thingML.TimesExpression
import thingML.InstanceContext
import thingML.ProxyValue
import thingML.ThingMLFactory
import thingML.Value

import static extension thingml.k3.AInstanceContext.get_property_entry
import static extension thingml.k3.AValue.times

@Aspect(className=Expression)
class AExpression {
	def public Value value(InstanceContext context, boolean createProxies) {
		throw new Exception("Expression type " + _self.class + " is not supported in semantics yet")
	}
}

@Aspect(className=TimesExpression)
class ATimesExpression extends AExpression {
	@OverrideAspectMethod
	def public Value value(InstanceContext context, boolean createProxies) {
		val value = _self.lhs.value(context, createProxies).times(_self.rhs.value(context, createProxies))
		if (value instanceof ProxyValue) {
			value.expression = _self
		}
		return value
	}
}

@Aspect(className=IntegerLiteral)
class AIntegerLiteral extends AExpression {
	@OverrideAspectMethod
	def public Value value(InstanceContext context, boolean createProxies) {
		val integerValue = ThingMLFactory.eINSTANCE.createIntegerValue()
		integerValue.value = _self.intValue
		return integerValue
	}
}

@Aspect(className=StringLiteral)
class AStringLiteral extends AExpression {
	@OverrideAspectMethod
	def public Value value(InstanceContext context, boolean createProxies) {
		val stringValue = ThingMLFactory.eINSTANCE.createStringValue()
		stringValue.value = _self.stringValue
		return stringValue
	}
}

@Aspect(className=PropertyReference)
class APropertyReference extends AExpression {
	@OverrideAspectMethod
	def public Value value(InstanceContext context, boolean createProxies) {
		if (createProxies) {
			val proxy = ThingMLFactory.eINSTANCE.createProxyValue()
			proxy.expression = _self
			return proxy
		} else {
			val entry = context.get_property_entry(_self.property as Property)
			return entry.value
		}
	}
}
