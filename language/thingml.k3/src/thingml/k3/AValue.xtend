package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
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

	def public void increment() {
		throw new Exception("Operation 'increment' is not defined for class " + _self.class.simpleName)
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

	def public Value lower(Value other) {
		throw new Exception("Operation 'lower' is not defined for class " + _self.class.simpleName)
	}

	def public Value greater(Value other) {
		throw new Exception("Operation 'greater' is not defined for class " + _self.class.simpleName)
	}

	def public Value greaterOrEqual(Value other) {
		throw new Exception("Operation 'greaterOrEqual' is not defined for class " + _self.class.simpleName)
	}

	def public Value equal(Value other) {
		throw new Exception("Operation 'equal' is not defined for class " + _self.class.simpleName)
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
}

@Aspect(className=ProxyValue)
class AProxyValue extends AValue {
	@OverrideAspectMethod
	def public Value plus(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value minus(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value times(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value lower(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value greaterOrEqual(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value greater(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value equal(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value and(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public String _str() {
		return "<" + _self.expression._str() + ">"
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
	def public String _str() {
		return "\"" + _self.value + "\""
	}

	@OverrideAspectMethod
	def public Value deepCopy() {
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
	def public void increment() {
		_self.value = _self.value + 1
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
	def public String _str() {
		return _self.value.toString()
	}

	@OverrideAspectMethod
	def public Value deepCopy() {
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
}
