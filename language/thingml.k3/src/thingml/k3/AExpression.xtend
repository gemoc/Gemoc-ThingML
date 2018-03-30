package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.thingml.xtext.thingML.ArrayIndex
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.GreaterOrEqualExpression
import org.thingml.xtext.thingML.IntegerLiteral
import org.thingml.xtext.thingML.LowerExpression
import org.thingml.xtext.thingML.MinusExpression
import org.thingml.xtext.thingML.PlusExpression
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyReference
import org.thingml.xtext.thingML.StringLiteral
import org.thingml.xtext.thingML.TimesExpression
import thingML.ArrayValue
import thingML.DynamicInstance
import thingML.IntegerValue
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

	def public String _str() {
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

	@OverrideAspectMethod
	def public String _str() {
		return _self.lhs._str() + " + " + _self.rhs._str()
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

	@OverrideAspectMethod
	def public String _str() {
		return _self.lhs._str() + " - " + _self.rhs._str()
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

	@OverrideAspectMethod
	def public String _str() {
		return _self.lhs._str() + " x " + _self.rhs._str()
	}
}

@Aspect(className=LowerExpression)
class ALowerExpression extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val value = _self.lhs.value(dynamicInstance, createProxies).lower(
			_self.rhs.value(dynamicInstance, createProxies))
		if (value instanceof ProxyValue) {
			value.expression = _self
		}
		return value
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.lhs._str() + " < " + _self.rhs._str()
	}
}

@Aspect(className=GreaterOrEqualExpression)
class AGreaterOrEqualExpression extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val value = _self.lhs.value(dynamicInstance, createProxies).greaterOrEqual(
			_self.rhs.value(dynamicInstance, createProxies))
		if (value instanceof ProxyValue) {
			value.expression = _self
		}
		return value
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.lhs._str() + " >= " + _self.rhs._str()
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

	@OverrideAspectMethod
	def public String _str() {
		return _self.intValue.toString()
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

	@OverrideAspectMethod
	def public String _str() {
		return _self.stringValue
	}
}

@Aspect(className=ArrayIndex)
class AArrayIndex extends AExpression {
	@OverrideAspectMethod
	def public Value value(DynamicInstance dynamicInstance, boolean createProxies) {
		val arrayValue = _self.array.value(dynamicInstance, createProxies)
		val indexValue = _self.index.value(dynamicInstance, createProxies)
		if (arrayValue instanceof ProxyValue || indexValue instanceof ProxyValue) {
			val proxy = ThingMLFactory.eINSTANCE.createProxyValue()
			proxy.expression = _self
			return proxy
		} else if (!(arrayValue instanceof ArrayValue)) {
			throw new Exception("Expression '" + _self.array._str() + "' has to correspond to an Array")
		} else if (!(indexValue instanceof IntegerValue)) {
			throw new Exception("Expression '" + _self.index._str() + "' has to correspond to an Integer")
		} else {
			val array = arrayValue as ArrayValue
			val index = (indexValue as IntegerValue).value as int
			return array.values.get(index)
		}
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.array._str() + "[" + _self.index._str() + "]"
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
					throw new Exception("Variable '" + _self._str() + "' is undefined")
				}
			}
		}
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.property.name
	}
}
