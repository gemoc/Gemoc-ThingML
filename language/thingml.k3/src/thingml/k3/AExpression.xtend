package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.IntegerLiteral
import org.thingml.xtext.thingML.MinusExpression
import org.thingml.xtext.thingML.PlusExpression
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyReference
import org.thingml.xtext.thingML.StringLiteral
import org.thingml.xtext.thingML.TimesExpression
import thingML.DynamicInstance
import thingML.ProxyValue
import thingML.ThingMLFactory
import thingML.Value

import static extension thingml.k3.ADynamicInstance.*
import static extension thingml.k3.AValue.*

@Aspect(className=Expression)
class AExpression {
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		throw new Exception("Expression type " + _self.class.simpleName + " is not supported in semantics yet")
	}
}

@Aspect(className=PlusExpression)
class APlusExpression extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val value = _self.lhs.value(dynamicInstance, createProxies).plus(
			_self.rhs.value(dynamicInstance, createProxies))
		if (value instanceof ProxyValue) {
			value.expression = _self
		}
		return value
	}
}

@Aspect(className=MinusExpression)
class AMinusExpression extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val value = _self.lhs.value(dynamicInstance, createProxies).minus(
			_self.rhs.value(dynamicInstance, createProxies))
		if (value instanceof ProxyValue) {
			value.expression = _self
		}
		return value
	}
}

@Aspect(className=TimesExpression)
class ATimesExpression extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val value = _self.lhs.value(dynamicInstance, createProxies).times(
			_self.rhs.value(dynamicInstance, createProxies))
		if (value instanceof ProxyValue) {
			value.expression = _self
		}
		return value
	}
}

@Aspect(className=IntegerLiteral)
class AIntegerLiteral extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val integerValue = ThingMLFactory.eINSTANCE.createIntegerValue()
		integerValue.value = _self.intValue
		return integerValue
	}
}

@Aspect(className=StringLiteral)
class AStringLiteral extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val stringValue = ThingMLFactory.eINSTANCE.createStringValue()
		stringValue.value = _self.stringValue
		return stringValue
	}
}

@Aspect(className=PropertyReference)
class APropertyReference extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		if (createProxies) {
			val proxy = ThingMLFactory.eINSTANCE.createProxyValue()
			proxy.expression = _self
			return proxy
		} else {
			if (_self.property instanceof Property) {
				val dynamicProperty = dynamicInstance.getDynamicProperty(_self.property as Property)
				return dynamicProperty.value
			} else {
				val dynamicVariable = dynamicInstance.getDynamicVariable(_self.property)
				if (dynamicVariable !== null) {
					return dynamicVariable.value
				} else {
					throw new Exception("Variable '" + _self.property.name + "' is undefined")
				}
			}
		}
	}
}
