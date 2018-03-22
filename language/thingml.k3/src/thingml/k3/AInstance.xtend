package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyAssign
import org.thingml.xtext.thingML.Thing
import thingML.ArrayProxyValue
import thingML.ArrayValue
import thingML.InstanceContext
import thingML.IntegerValue
import thingML.ProxyValue
import thingML.ThingMLFactory

import static extension thingml.k3.AExpression.value
import static extension thingml.k3.AInstanceContext.get_property_entry

@Aspect(className=Instance)
class AInstance {
	public InstanceContext context

	def public void init_properties(Thing thing) {
		for (Thing fragment : thing.includes) {
			_self.init_properties(fragment)
		}
		for (Property property : thing.properties) {
			val entry = ThingMLFactory.eINSTANCE.createPropertyEntry()
			entry.property = property
			if (property.typeRef.isArray) {
				val length_value = property.typeRef.cardinality.value(_self.context, true)
				if (length_value instanceof ProxyValue) {
					entry.value = ThingMLFactory.eINSTANCE.createArrayProxyValue()
					val proxy = (entry.value as ProxyValue)
					proxy.expression = property.typeRef.cardinality
				} else if (length_value instanceof IntegerValue) {
					entry.value = ThingMLFactory.eINSTANCE.createArrayValue()
					val array = (entry.value as ArrayValue).values
					val length = length_value.value
					for (var i = 0; i < length; i++) {
						array.add(ThingMLFactory.eINSTANCE.createNullValue())
					}
				} else {
					throw new Exception("Cardinality has to be an IntegerValue")
				}
			} else if (property.init === null) {
				entry.value = ThingMLFactory.eINSTANCE.createNullValue()
			} else {
				entry.value = property.init.value(_self.context, true)
			}
			_self.context.propertyEntries.add(entry)
		}
	}

	def public void _assign(Property property, EList<Expression> index_list, Expression init) {
		val entry = _self.context.get_property_entry(property)
		if (index_list.length == 0) {
			entry.value = init.value(_self.context, true)
		} else if (index_list.length == 1) {
			val index_exp = index_list.get(0)
			if (entry.value instanceof ArrayProxyValue) {
				val array_proxy = entry.value as ArrayProxyValue
				val candidate_entries = array_proxy.arrayProxyEntries.filter[e|e.index == index_exp]
				if (candidate_entries.length == 1) {
					candidate_entries.get(0).value = init.value(_self.context, true)
				} else if (candidate_entries.length == 0) {
					val proxy_entry = ThingMLFactory.eINSTANCE.createArrayProxyEntry()
					proxy_entry.index = index_exp
					proxy_entry.value = init.value(_self.context, true)
					array_proxy.arrayProxyEntries.add(proxy_entry)
				} else {
					throw new Exception("Wut?")
				}
			} else {
				val array_property = entry.value as ArrayValue
				val index_value = index_exp.value(_self.context, true)
				if (index_value instanceof ProxyValue) {
					// TODO
					throw new Exception("I don't know what to do")
				} else if (index_value instanceof IntegerValue) {
					val index = index_value.value as int
					val value = init.value(_self.context, true)
					array_property.values.set(index, value)
				} else {
					throw new Exception("Cardinality has to be an IntegerValue")
				}
			}
		} else {
			throw new Exception("I don't understand this language…")
		}
	}

	def public void init_property_assigns(Thing thing) {
		for (Thing fragment : thing.includes) {
			_self.init_property_assigns(fragment)
		}
		for (PropertyAssign assign : thing.assign) {
			_self._assign(assign.property, assign.index, assign.init)
		}
	}

	def public void init() {
		_self.context = ThingMLFactory.eINSTANCE.createInstanceContext()
		_self.init_properties(_self.type)
		_self.init_property_assigns(_self.type)
	}

	def public void assign(ConfigPropertyAssign assign) {
		_self._assign(assign.property, assign.index, assign.init)
	}
}
