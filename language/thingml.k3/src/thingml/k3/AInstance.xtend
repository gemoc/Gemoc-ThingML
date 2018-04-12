package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Connector
import org.thingml.xtext.thingML.Expression
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Port
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.PropertyAssign
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.Thing
import thingML.ArrayProxyEntry
import thingML.ArrayProxyValue
import thingML.ArrayValue
import thingML.DynamicInstance
import thingML.DynamicMessage
import thingML.DynamicPort
import thingML.DynamicVariable
import thingML.IntegerValue
import thingML.ProxyValue
import thingML.ThingMLFactory
import thingML.Value
import thingml.utils.Log

import static extension thingml.k3.ADynamicInstance.*
import static extension thingml.k3.AExpression.value
import static extension thingml.k3.AState.*
import static extension thingml.k3.AValue._str

@Aspect(className=Instance)
class AInstance {
	public DynamicInstance dynamicInstance
	public boolean running

	def public void initProperties(Thing thing) {
		for (Thing fragment : thing.includes) {
			_self.initProperties(fragment)
		}
		for (Property property : thing.properties) {
			val entry = ThingMLFactory.eINSTANCE.createDynamicVariable()
			entry.variable = property
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
		val entry = _self.dynamicInstance.getDynamicVariable(property)
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

	def public void initPorts(Thing thing) {
		for (Thing fragment : thing.includes) {
			_self.initPorts(fragment)
		}
		for (Port port : thing.ports) {
			val dynamicPort = ThingMLFactory.eINSTANCE.createDynamicPort()
			dynamicPort.port = port
			_self.dynamicInstance.dynamicPorts.add(dynamicPort)
		}
	}

	def public void init() {
		_self.running = true
		_self.dynamicInstance = ThingMLFactory.eINSTANCE.createDynamicInstance()
		_self.dynamicInstance.init(_self)
		_self.initProperties(_self.type)
		_self.initPropertyAssigns(_self.type)
		_self.initStateContainers(_self.getBehaviour())
		_self.initPorts(_self.type)
	}

	def public void assign(ConfigPropertyAssign assign) {
		_self._assignProperties(assign.property, assign.index, assign.init)
	}

	def public void resolve() {
		Log.log(_self.name + ": Start resolution", 2)

		var proxy_counter = 0
		var proxy_resolved = 0

		for (DynamicVariable dynamicProperty : _self.dynamicInstance.dynamicProperties) {

			if (dynamicProperty.value instanceof ArrayProxyValue) {
				val array_proxy = (dynamicProperty.value as ArrayProxyValue)

				Log.log("Entering ArrayProxyValue of property '" + dynamicProperty.variable.name + "'", 2)
				proxy_counter++

				val cardinality = array_proxy.expression.value(_self.dynamicInstance, false)

				var continue = !(cardinality instanceof ProxyValue)

				if (continue) {
					Log.log("Cardinality is not a Proxy anymore!", 2)

					for (ArrayProxyEntry array_entry : array_proxy.arrayProxyEntries) {
						val index = array_entry.indexExpression.value(_self.dynamicInstance, false)
						continue = continue && !(index instanceof ProxyValue)
					}
				}

				if (continue) {
					Log.log("All indexes have been resolved!", 2)
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
									Log.log("Discovering a new ProxyValue!", 2)
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
				Log.log("Analysing ProxyValue of property '" + dynamicProperty.variable.name + "'", 2)
				proxy_counter++
				val proxyValue = dynamicProperty.value as ProxyValue
				dynamicProperty.value = proxyValue.expression.value(_self.dynamicInstance, false)
				if (!(dynamicProperty instanceof ProxyValue)) {
					Log.log("It has been resolved", 2)
					proxy_resolved++
				}
			} else if (dynamicProperty.value instanceof ArrayValue) {
				Log.log("Analysing ArrayValue of property '" + dynamicProperty.variable.name + "'", 2)
				var i = 0
				for (Value value : (dynamicProperty.value as ArrayValue).values) {
					if (value instanceof ProxyValue) {
						Log.log("Entering ProxyValue of property '" + dynamicProperty.variable.name + "[" + i + "]'", 2)
						proxy_counter++
						// TODO
						throw new Exception("This is to be done")
					}
					i++
				}
			}
		}

		Log.log("Counters:", 2)
		Log.log(" - proxies:  " + proxy_counter, 2)
		Log.log(" - resolved: " + proxy_resolved, 2)

		if (proxy_counter > 0) {
			if (proxy_resolved == 0) {
				throw new Exception("Cycle detected... See the variable view to understand. Good luck ;)")
			} else if (proxy_resolved < proxy_counter) {
				_self.resolve()
			}
		}

		Log.log(_self.name + ": End resolution", 2)
	}

	def public void connect(Connector connector) {
		val dynamicRequired = _self.dynamicInstance.getDynamicPort(connector.required)
		val dynamicProvided = connector.srv.dynamicInstance.getDynamicPort(connector.provided)
		dynamicRequired.connectedPorts.add(dynamicProvided)
		dynamicProvided.connectedPorts.add(dynamicRequired)
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

	def public boolean _hasMessage() {
		for (DynamicPort dynamicPort : _self.dynamicInstance.dynamicPorts) {
			if (!dynamicPort.receivedMessages.empty) {
				return true
			}
		}
		return false
	}

	def public DynamicMessage _nextMessage() {
		for (DynamicPort dynamicPort : _self.dynamicInstance.dynamicPorts) {
			if (!dynamicPort.receivedMessages.empty) {
				return dynamicPort.receivedMessages.remove(0)
			}
		}
		throw new Exception("Not possible")
	}

	@Step
	def public boolean run() {
		val behaviour = _self.getBehaviour()
		var hasMoved = false
		var reRun = true
		while (reRun && _self.running) {
			var hasSpontaneouslyMoved = true
			while (hasSpontaneouslyMoved && _self.running) {
				Log.log(_self.name + ": Run a spontaneous transition")
				Log.tab
				hasSpontaneouslyMoved = behaviour.runASpontaneousTransition(_self.dynamicInstance)
				Log.detab
				hasMoved = hasMoved || hasSpontaneouslyMoved
			}
			reRun = false
			while (!reRun && _self._hasMessage && _self.running) {
				val dynamicMessage = _self._nextMessage

				for (var i = 0; i < dynamicMessage.message.parameters.length; i++) {
					val parameter = dynamicMessage.message.parameters.get(i)
					val value = dynamicMessage.parameters.get(i)
					_self.dynamicInstance.addVariable(parameter, value)
				}

				var params = dynamicMessage.parameters.fold("", [s, v|s + v._str + ", "])
				if (params.length > 2) {
					params = params.substring(0, params.length - 2)
				}
				Log.log(_self.name + ": Manage message '" + dynamicMessage.message.name + params + "'")
				Log.tab
				reRun = behaviour.runAEventDrivenTransition(_self.dynamicInstance, dynamicMessage)
				Log.detab

				_self.dynamicInstance.clearContext

				hasMoved = hasMoved || reRun
			}
		}
		return hasMoved
	}
}
