package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import thingML.IntegerValue
import thingML.ThingMLFactory
import thingML.Value

@Aspect(className=Value)
class AValue {
	def public Value times(Value other) {
		throw new Exception("Can only multiply numbers")
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
		} else {
			throw new Exception("Cannot multiply " + other.class)
		}
	}
}
