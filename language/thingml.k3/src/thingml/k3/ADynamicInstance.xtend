package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.Property
import thingML.DynamicCompositeState
import thingML.DynamicInstance
import thingML.DynamicProperty
import thingML.ThingMLFactory

@Aspect(className=DynamicInstance)
class ADynamicInstance {
	def public void init() {
		_self.executionFrame = ThingMLFactory.eINSTANCE.createFrame()
		_self.executionFrame.dynamicInstance = _self
		_self.executionFrame.rootContext = ThingMLFactory.eINSTANCE.createContext()
	}

	def public DynamicProperty getDynamicProperty(Property property) {
		val candidate_entries = _self.dynamicProperties.filter[e|e.property == property]
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a property?")
		}
	}

	def public DynamicCompositeState getDynamicCompositeState(CompositeState compositeState) {
		val candidate_entries = _self.dynamicCompositeStates.filter[e|e.compositeState == compositeState]
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a stateContainer?")
		}
	}
}
