package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyAssign
import org.thingml.xtext.thingML.Thing
import thingML.ArrayValue
import thingML.InstanceContext
import thingML.IntegerValue
import thingML.ThingMLFactory

import static extension thingml.k3.AExpression.value
import static extension thingml.k3.AInstanceContext.get_property_entry

@Aspect(className=Instance)
class AInstance {
	public InstanceContext context

	def public void init_properties(Thing thing) {
		for (Property property : thing.properties) {
			val entry = ThingMLFactory.eINSTANCE.createPropertyEntry()
			entry.property = property
			if (property.typeRef.isArray) {
				entry.value = ThingMLFactory.eINSTANCE.createArrayValue()
				val array = (entry.value as ArrayValue).values
				val length = (property.typeRef.cardinality.value(_self.context) as IntegerValue).value
				for (var i = 0; i < length; i++) {
					array.add(ThingMLFactory.eINSTANCE.createNullValue())
				}
			} else if (property.init === null) {
				entry.value = ThingMLFactory.eINSTANCE.createNullValue()
			} else {
				entry.value = property.init.value(_self.context)
			}
			_self.context.propertyEntries.add(entry)
		}
		for (Thing fragment : thing.includes) {
			_self.init_properties(fragment)
		}
	}

	def public void init_property_assigns(Thing thing) {
		for (Thing fragment : thing.includes) {
			_self.init_property_assigns(fragment)
		}
		for (PropertyAssign assign : thing.assign) {
			val entry = _self.context.get_property_entry(assign.property)
			if (assign.index.length == 0) {
				entry.value = assign.init.value(_self.context)
			} else if (assign.index.length == 1) {
				val array_property = entry.value as ArrayValue
				val index = (assign.index.get(0).value(_self.context) as IntegerValue).value as int
				val value = assign.init.value(_self.context)
				array_property.values.set(index, value)
			} else {
				throw new Exception("I don't understand this language…")
			}
		}
	}

	def public void init() {
		_self.context = ThingMLFactory.eINSTANCE.createInstanceContext()
		_self.init_properties(_self.type)
		_self.init_property_assigns(_self.type)
	}

	def public void assign(ConfigPropertyAssign assign) {
		val entry = _self.context.get_property_entry(assign.property)
		if (assign.index.length == 0) {
			entry.value = assign.init.value(_self.context)
		} else if (assign.index.length == 1) {
			val array_property = entry.value as ArrayValue
			val index = (assign.index.get(0).value(_self.context) as IntegerValue).value as int
			val value = assign.init.value(_self.context)
			array_property.values.set(index, value)
		} else {
			throw new Exception("I don't understand this language…")
		}
	}
}
