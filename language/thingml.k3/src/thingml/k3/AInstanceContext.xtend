package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.Property
import thingML.CompositeStateEntry
import thingML.InstanceContext
import thingML.PropertyEntry

@Aspect(className=InstanceContext)
class AInstanceContext {
	def public PropertyEntry getPropertyEntry(Property property) {
		val candidate_entries = _self.propertyEntries.filter[e|e.property == property]
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a property?")
		}
	}

	def public CompositeStateEntry getStateContainerEntry(CompositeState compositeState) {
		val candidate_entries = _self.stateContainerEntries.filter[e|e.compositeState == compositeState]
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a stateContainer?")
		}
	}
}
