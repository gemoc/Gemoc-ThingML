package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.Thing
import thingML.PropertyEntry
import thingML.ThingMLFactory

import static extension thingml.k3.AExpression.value

@Aspect(className=Instance)
class AInstance {
	public EList<PropertyEntry> properties

	def public void init_properties(Thing thing) {
		for (Property property : thing.properties) {
			val entry = ThingMLFactory.eINSTANCE.createPropertyEntry()
			entry.property = property
			if (property.typeRef.isIsArray) {
				entry.value = ThingMLFactory.eINSTANCE.createArrayValue()
			} else if (property.init === null) {
				entry.value = null
			} else {
				entry.value = property.init.value()
			}
			_self.properties.add(entry)
		}
		for (Thing fragment : thing.includes) {
			_self.init_properties(fragment)
		}
	}

	@Step
	def public void init() {
		_self.init_properties(_self.type)
	}
}
