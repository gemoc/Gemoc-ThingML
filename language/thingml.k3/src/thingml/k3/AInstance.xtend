package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyAssign
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.StateContainer
import org.thingml.xtext.thingML.Thing
import thingML.ArrayProxyEntry
import thingML.ArrayProxyValue
import thingML.ArrayValue
import thingML.InstanceContext
import thingML.IntegerValue
import thingML.PropertyEntry
import thingML.ProxyValue
import thingML.ThingMLFactory
import thingML.Value

import static thingml.k3.Printer.log

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

	def public StateContainer get_behaviour() {
		var behaviour = _self.type.behaviour
		var i = _self.type.includes.iterator
		while (behaviour === null && i.hasNext()) {
			behaviour = i.next().behaviour
		}
		if (behaviour === null) {
			throw new Exception("Instance " + _self.name + " doesn't have any behaviour!")
		}
		return behaviour
	}

	def public void init_state_containers(StateContainer stateContainer, boolean initial) {
		val entry = ThingMLFactory.eINSTANCE.createStateContainerEntry()
		entry.stateContainer = stateContainer
		if (stateContainer.history || initial) {
			entry.currentState = stateContainer.initial
		} else {
			entry.currentState = null
		}
		_self.context.stateContainerEntries.add(entry)
		for (State sub_state : stateContainer.substate) {
			if (sub_state instanceof StateContainer) {
				_self.init_state_containers(sub_state, sub_state == stateContainer.initial)
			}
		}
	}

	def public void init() {
		_self.context = ThingMLFactory.eINSTANCE.createInstanceContext()
		_self.init_properties(_self.type)
		_self.init_property_assigns(_self.type)
		_self.init_state_containers(_self.get_behaviour(), true)
	}

	def public void assign(ConfigPropertyAssign assign) {
		_self._assign(assign.property, assign.index, assign.init)
	}

	def public void resolve() {
		var proxy_counter = 0
		var proxy_resolved = 0

		for (PropertyEntry entry : _self.context.propertyEntries) {

			if (entry.value instanceof ArrayProxyValue) {
				val array_proxy = (entry.value as ArrayProxyValue)

				log(null, "Entering ArrayProxyValue of property '" + entry.property.name + "'")
				proxy_counter++

				val cardinality = array_proxy.expression.value(_self.context, false)

				var continue = !(cardinality instanceof ProxyValue)

				if (continue) {
					log(null, "Cardinality is not a Proxy anymore!")

					for (ArrayProxyEntry array_entry : array_proxy.arrayProxyEntries) {
						val index = array_entry.index.value(_self.context, false)
						continue = continue && !(index instanceof ProxyValue)
					}
				}

				if (continue) {
					log(null, "All indexes have been resolved!")
					proxy_resolved++

					if (cardinality instanceof IntegerValue) {
						val new_value = ThingMLFactory.eINSTANCE.createArrayValue()
						val length = cardinality.value
						for (var i = 0; i < length; i++) {
							new_value.values.add(ThingMLFactory.eINSTANCE.createNullValue())
						}
						for (ArrayProxyEntry array_entry : array_proxy.arrayProxyEntries) {
							val index = array_entry.index.value(_self.context, false)
							if (index instanceof IntegerValue) {
								new_value.values.set(index.value as int, array_entry.value)
								if (array_entry.value instanceof ProxyValue) {
									log(null, "Discovering a new ProxyValue!")
									proxy_counter++
								}
							} else {
								throw new Exception("Index must be an integer")
							}
						}

						entry.value = new_value
					} else {
						throw new Exception("Cardinality has to be an IntegerValue")
					}
				}
			} else if (entry.value instanceof ProxyValue) {
				log(null, "Entering ProxyValue of property '" + entry.property.name + "'")
				proxy_counter++
				// TODO
				throw new Exception("This is to be done")
			} else if (entry.value instanceof ArrayValue) {
				log(null, "Analysing ArrayValue of property '" + entry.property.name + "'")
				var i = 0
				for (Value value : (entry.value as ArrayValue).values) {
					if (value instanceof ProxyValue) {
						log(null, "Entering ProxyValue of property '" + entry.property.name + "[" + i + "]'")
						proxy_counter++
						// TODO
						throw new Exception("This is to be done")
					}
					i++
				}
			}
		}

		log(null, "Counters:")
		log(null, " - proxies:  " + proxy_counter)
		log(null, " - resolved: " + proxy_resolved)

		if (proxy_counter > 0) {
			if (proxy_resolved == 0) {
				throw new Exception("Cycle detected... See the variable view to understand. Good luck ;)")
			} else if (proxy_resolved < proxy_counter) {
				_self.resolve()
			}
		}
	}
}
