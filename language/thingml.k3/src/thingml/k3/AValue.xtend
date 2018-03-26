package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import thingML.IntegerValue
import thingML.ProxyValue
import thingML.ThingMLFactory
import thingML.Value

@Aspect(className=Value)
class AValue {
	def public Value times(Value other) {
		throw new Exception("Can only multiply numbers")
	}

	def public Value minus(Value other) {
		throw new Exception("Can only subtract numbers")
	}
}

@Aspect(className=ProxyValue)
class AProxyValue extends AValue {
	@OverrideAspectMethod
	def public Value times(Value other) {
		return _self
	}

	@OverrideAspectMethod
	def public Value minus(Value other) {
		return _self
	}
}

@Aspect(className=IntegerValue)
class AIntegerValue extends AValue {
	@OverrideAspectMethod
	def public Value times(Value other) {
		if (other instanceof IntegerValue) {
			val result = ThingMLFactory.eINSTANCE.createIntegerValue()
			result.value = _self.value * other.value
			return result
		} else if (other instanceof ProxyValue) {
			return other
		} else {
			throw new Exception("Cannot multiply " + other.class)
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
			throw new Exception("Cannot subtract " + other.class)
		}
	}
}
