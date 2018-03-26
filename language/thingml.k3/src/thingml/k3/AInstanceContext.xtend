package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.StateContainer
import thingML.InstanceContext
import thingML.PropertyEntry
import thingML.StateContainerEntry

@Aspect(className=InstanceContext)
class AInstanceContext {
	def public PropertyEntry get_property_entry(Property property) {
		val candidate_entries = _self.propertyEntries.filter[e|e.property == property]
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a property?")
		}
	}

	def public StateContainerEntry get_state_container_entry(StateContainer stateContainer) {
		val candidate_entries = _self.stateContainerEntries.filter[e|e.stateContainer == stateContainer]
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a stateContainer?")
		}
	}
}
