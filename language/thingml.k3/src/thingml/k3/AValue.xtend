package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import thingML.ArrayProxyValue
import thingML.ArrayValue
import thingML.BooleanValue
import thingML.IntegerValue
import thingML.ProxyValue
import thingML.StringValue
import thingML.ThingMLFactory
import thingML.Value

import static extension thingml.k3.AExpression._str

@Aspect(className=Value)
class AValue {
	def public String print() {
		throw new Exception("Operation 'print' is not defined for class " + _self.class.simpleName)
	}

	def public Value increment() {
		throw new Exception("Operation 'increment' is not defined for class " + _self.class.simpleName)
	}

	def public Value decrement() {
		throw new Exception("Operation 'decrement' is not defined for class " + _self.class.simpleName)
	}

	def public Value plus(Value other) {
		throw new Exception("Operation 'plus' is not defined for class " + _self.class.simpleName)
	}

	def public Value minus(Value other) {
		throw new Exception("Operation 'minus' is not defined for class " + _self.class.simpleName)
	}

	def public Value times(Value other) {
		throw new Exception("Operation 'times' is not defined for class " + _self.class.simpleName)
	}

	def public Value modulo(Value other) {
		throw new Exception("Operation 'modulo' is not defined for class " + _self.class.simpleName)
	}

	def public Value lower(Value other) {
		throw new Exception("Operation 'lower' is not defined for class " + _self.class.simpleName)
	}

	def public Value greater(Value other) {
		throw new Exception("Operation 'greater' is not defined for class " + _self.class.simpleName)
	}

	def public Value lowerOrEqual(Value other) {
		throw new Exception("Operation 'lowerOrEqual' is not defined for class " + _self.class.simpleName)
	}

	def public Value greaterOrEqual(Value other) {
		throw new Exception("Operation 'greaterOrEqual' is not defined for class " + _self.class.simpleName)
	}

	def public Value equal(Value other) {
		throw new Exception("Operation 'equal' is not defined for class " + _self.class.simpleName)
	}

	def public Value notEqual(Value other) {
		throw new Exception("Operation 'notEqual' is not defined for class " + _self.class.simpleName)
	}

	def public Value and(Value other) {
		throw new Exception("Operation 'and' is not defined for class " + _self.class.simpleName)
	}

	def public String _str() {
		throw new Exception("Method '_str' is not defined for class " + _self.class.simpleName)
	}

	def public Value deepCopy() {
		throw new Exception("Method 'deepCopy' is not defined for class " + _self.class.simpleName)
	}

	def public Value copy() {
		throw new Exception("Method 'copy' is not defined for class " + _self.class.simpleName)
	}
}

@Aspect(className=ProxyValue)
class AProxyValue extends AValue {
	@OverrideAspectMethod
	def public Value increment() {
		return _self
	}

	@OverrideAspectMethod
	def public Value decrement() {
		return _self
	}

	@OverrideAspectMethod
	def public Value plus(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value minus(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value times(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value modulo(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value lower(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value lowerOrEqual(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value greaterOrEqual(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value greater(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value equal(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value notEqual(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value and(Value other) {
		return _self.copy
	}

	@OverrideAspectMethod
	def public String _str() {
		return "<" + _self.expression._str() + ">"
	}

	@OverrideAspectMethod
	def public Value copy() {
		val value = ThingMLFactory.eINSTANCE.createProxyValue()
		value.expression = _self.expression
		return value
	}
}

@Aspect(className=ArrayProxyValue)
class AArrayProxyValue extends AValue {
	@OverrideAspectMethod
	def public Value copy() {
		val value = ThingMLFactory.eINSTANCE.createArrayProxyValue()
		value.expression = _self.expression
		value.arrayProxyEntries.addAll(_self.arrayProxyEntries)
		return value
	}
}

@Aspect(className=ArrayValue)
class AArrayValue extends AValue {
	@OverrideAspectMethod
	def public Value copy() {
		val value = ThingMLFactory.eINSTANCE.createArrayValue()
		value.values.addAll(_self.values)
		return value
	}
}

@Aspect(className=StringValue)
class AStringValue extends AValue {
	@OverrideAspectMethod
	def public String print() {
		// since there is no 'unescaping' tool in native Java...
		return _self.value.replace("\\n", "\n").replace("\\\"", "\"")
	}

	@OverrideAspectMethod
	def public Value plus(Value other) {
		if (other instanceof StringValue) {
			val result = ThingMLFactory.eINSTANCE.createStringValue()
			result.value = _self.value + other.value
			return result
		} else if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createStringValue()
			result.value = _self.value + other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'plus' it not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value equal(Value other) {
		if (other instanceof StringValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value == other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'equal' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public String _str() {
		return "\"" + _self.value + "\""
	}

	@OverrideAspectMethod
	def public Value deepCopy() {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value copy() {
		val newValue = ThingMLFactory.eINSTANCE.createStringValue()
		newValue.value = _self.value
		return newValue
	}
}

@Aspect(className=IntegerValue)
class AIntegerValue extends AValue {
	@OverrideAspectMethod
	def public String print() {
		return _self._str()
	}

	@OverrideAspectMethod
	def public Value increment() {
		val result = ThingMLFactory.eINSTANCE.createIntegerValue()
		result.value = _self.value + 1
		return result
	}

	@OverrideAspectMethod
	def public Value decrement() {
		val result = ThingMLFactory.eINSTANCE.createIntegerValue()
		result.value = _self.value - 1
		return result
	}

	@OverrideAspectMethod
	def public Value plus(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createIntegerValue()
			result.value = _self.value + other.value
			return result
		} else if (other instanceof StringValue) {
			val result = ThingMLFactory.eINSTANCE.createStringValue()
			result.value = _self.value + other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'plus' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value minus(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createIntegerValue()
			result.value = _self.value - other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'minus' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value times(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createIntegerValue()
			result.value = _self.value * other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'times' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value modulo(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createIntegerValue()
			result.value = _self.value % other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'modulo' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value lower(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value < other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'lower' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value greater(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value > other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'greater' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value lowerOrEqual(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value <= other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'lowerOrEqual' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value greaterOrEqual(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value >= other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'greaterOrEqual' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value equal(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value == other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'equal' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public Value notEqual(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value != other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'notEqual' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.value.toString()
	}

	@OverrideAspectMethod
	def public Value deepCopy() {
		return _self.copy
	}

	@OverrideAspectMethod
	def public Value copy() {
		val newValue = ThingMLFactory.eINSTANCE.createIntegerValue()
		newValue.value = _self.value
		return newValue
	}
}

@Aspect(className=BooleanValue)
class ABooleanValue extends AValue {
	@OverrideAspectMethod
	def public Value and(Value other) {
		if (other instanceof BooleanValue) {
			val result = ThingMLFactory.eINSTANCE.createBooleanValue()
			result.value = _self.value && other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Operation 'and' is not defined for class " + other.class.simpleName)
		}
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.value.toString()
	}
}
