package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Property
import thingML.PropertyEntry
import thingML.ThingMLFactory

import static extension thingml.k3.AExpression.value

@Aspect(className=Instance)
class AInstance {
	public EList<PropertyEntry> properties

	@Step
	def public void init() {
		for (Property property : _self.type.properties) {
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
	}
}
