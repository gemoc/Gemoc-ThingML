package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyAssign
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.Thing
import thingML.ArrayProxyEntry
import thingML.ArrayProxyValue
import thingML.ArrayValue
import thingML.DynamicInstance
import thingML.DynamicProperty
import thingML.IntegerValue
import thingML.ProxyValue
import thingML.ThingMLFactory
import thingML.Value

import static extension thingml.k3.ADynamicInstance.*
import static extension thingml.k3.AExpression.value
import static extension thingml.k3.AState.*

@Aspect(className=Instance)
class AInstance {
	public DynamicInstance dynamicInstance

	def public void initProperties(Thing thing) {
		for (Thing fragment : thing.includes) {
			_self.initProperties(fragment)
		}
		for (Property property : thing.properties) {
			val entry = ThingMLFactory.eINSTANCE.createDynamicProperty()
			entry.property = property
			if (property.typeRef.isArray) {
				val length_value = property.typeRef.cardinality.value(_self.dynamicInstance, true)
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
				entry.value = property.init.value(_self.dynamicInstance, true)
			}
			_self.dynamicInstance.dynamicProperties.add(entry)
		}
	}

	def public void _assignProperties(Property property, EList<Expression> index_list, Expression init) {
		val entry = _self.dynamicInstance.getDynamicProperty(property)
		if (index_list.length == 0) {
			entry.value = init.value(_self.dynamicInstance, true)
		} else if (index_list.length == 1) {
			val index_exp = index_list.get(0)
			if (entry.value instanceof ArrayProxyValue) {
				val array_proxy = entry.value as ArrayProxyValue
				val candidate_entries = array_proxy.arrayProxyEntries.filter[e|e.indexExpression == index_exp].toList
				if (candidate_entries.length == 1) {
					candidate_entries.get(0).value = init.value(_self.dynamicInstance, true)
				} else if (candidate_entries.length == 0) {
					val proxy_entry = ThingMLFactory.eINSTANCE.createArrayProxyEntry()
					proxy_entry.indexExpression = index_exp
					proxy_entry.value = init.value(_self.dynamicInstance, true)
					array_proxy.arrayProxyEntries.add(proxy_entry)
				} else {
					throw new Exception("Wut?")
				}
			} else {
				val array_property = entry.value as ArrayValue
				val index_value = index_exp.value(_self.dynamicInstance, true)
				if (index_value instanceof ProxyValue) {
					// TODO
					throw new Exception("I don't know what to do")
				} else if (index_value instanceof IntegerValue) {
					val index = index_value.value as int
					val value = init.value(_self.dynamicInstance, true)
					array_property.values.set(index, value)
				} else {
					throw new Exception("Cardinality has to be an IntegerValue")
				}
			}
		} else {
			throw new Exception("I don't understand this language…")
		}
	}

	def public void initPropertyAssigns(Thing thing) {
		for (Thing fragment : thing.includes) {
			_self.initPropertyAssigns(fragment)
		}
		for (PropertyAssign assign : thing.assign) {
			_self._assignProperties(assign.property, assign.index, assign.init)
		}
	}

	def public CompositeState getBehaviour() {
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

	def public void initStateContainers(CompositeState compositeState) {
		val entry = ThingMLFactory.eINSTANCE.createDynamicCompositeState()
		entry.compositeState = compositeState
		entry.currentState = null
		_self.dynamicInstance.dynamicCompositeStates.add(entry)
		for (State sub_state : compositeState.substate) {
			if (sub_state instanceof CompositeState) {
				_self.initStateContainers(sub_state)
			}
		}
	}

	def public void init() {
		_self.dynamicInstance = ThingMLFactory.eINSTANCE.createDynamicInstance()
		_self.dynamicInstance.init(_self)
		_self.initProperties(_self.type)
		_self.initPropertyAssigns(_self.type)
		_self.initStateContainers(_self.getBehaviour())
	}

	def public void assign(ConfigPropertyAssign assign) {
		_self._assignProperties(assign.property, assign.index, assign.init)
	}

	def public void resolve() {
		var proxy_counter = 0
		var proxy_resolved = 0

		for (DynamicProperty dynamicProperty : _self.dynamicInstance.dynamicProperties) {

			if (dynamicProperty.value instanceof ArrayProxyValue) {
				val array_proxy = (dynamicProperty.value as ArrayProxyValue)

				println("Entering ArrayProxyValue of property '" + dynamicProperty.property.name + "'")
				proxy_counter++

				val cardinality = array_proxy.expression.value(_self.dynamicInstance, false)

				var continue = !(cardinality instanceof ProxyValue)

				if (continue) {
					println("Cardinality is not a Proxy anymore!")

					for (ArrayProxyEntry array_entry : array_proxy.arrayProxyEntries) {
						val index = array_entry.indexExpression.value(_self.dynamicInstance, false)
						continue = continue && !(index instanceof ProxyValue)
					}
				}

				if (continue) {
					println("All indexes have been resolved!")
					proxy_resolved++

					if (cardinality instanceof IntegerValue) {
						val new_value = ThingMLFactory.eINSTANCE.createArrayValue()
						val length = cardinality.value
						for (var i = 0; i < length; i++) {
							new_value.values.add(ThingMLFactory.eINSTANCE.createNullValue())
						}
						for (ArrayProxyEntry array_entry : array_proxy.arrayProxyEntries) {
							val index = array_entry.indexExpression.value(_self.dynamicInstance, false)
							if (index instanceof IntegerValue) {
								new_value.values.set(index.value as int, array_entry.value)
								if (array_entry.value instanceof ProxyValue) {
									println("Discovering a new ProxyValue!")
									proxy_counter++
								}
							} else {
								throw new Exception("Index must be an integer")
							}
						}

						dynamicProperty.value = new_value
					} else {
						throw new Exception("Cardinality has to be an IntegerValue")
					}
				}
			} else if (dynamicProperty.value instanceof ProxyValue) {
				println("Entering ProxyValue of property '" + dynamicProperty.property.name + "'")
				proxy_counter++
				// TODO
				throw new Exception("This is to be done")
			} else if (dynamicProperty.value instanceof ArrayValue) {
				println("Analysing ArrayValue of property '" + dynamicProperty.property.name + "'")
				var i = 0
				for (Value value : (dynamicProperty.value as ArrayValue).values) {
					if (value instanceof ProxyValue) {
						println("Entering ProxyValue of property '" + dynamicProperty.property.name + "[" + i + "]'")
						proxy_counter++
						// TODO
						throw new Exception("This is to be done")
					}
					i++
				}
			}
		}

		println("Counters:")
		println(" - proxies:  " + proxy_counter)
		println(" - resolved: " + proxy_resolved)

		if (proxy_counter > 0) {
			if (proxy_resolved == 0) {
				throw new Exception("Cycle detected... See the variable view to understand. Good luck ;)")
			} else if (proxy_resolved < proxy_counter) {
				_self.resolve()
			}
		}
	}

	@Step
	def public void enterInitialState() {
		var compositeState = _self.getBehaviour()
		compositeState.onEntry(_self.dynamicInstance)
		while (compositeState !== null) {
			var entry = _self.dynamicInstance.getDynamicCompositeState(compositeState)
			entry.currentState = compositeState.initial
			compositeState.initial.onEntry(_self.dynamicInstance)
			if (compositeState.initial instanceof CompositeState) {
				compositeState = compositeState.initial as CompositeState
			} else {
				compositeState = null
			}
		}
	}

	@Step
	def public boolean run() {
		val behaviour = _self.getBehaviour()
		var hasMoved = false
		var hasSpontaneouslyMoved = true
		while (hasSpontaneouslyMoved) {
			hasSpontaneouslyMoved = behaviour.runSpontaneousTransitions(_self.dynamicInstance)
			hasMoved = hasMoved || hasSpontaneouslyMoved
		}
		return hasMoved
	}
}
