package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Parameter
import org.thingml.xtext.thingML.Port
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.Variable
import thingML.Context
import thingML.DynamicCompositeState
import thingML.DynamicInstance
import thingML.DynamicPort
import thingML.DynamicProperty
import thingML.DynamicVariable
import thingML.ThingMLFactory
import thingML.Value

import static extension thingml.k3.AValue.print

@Aspect(className=DynamicInstance)
class ADynamicInstance {
	def public void init(Instance instance) {
		_self.instance = instance
		_self.executionFrame = ThingMLFactory.eINSTANCE.createFrame()
		_self.activeFrame = _self.executionFrame
		_self.activeFrame.rootContext = ThingMLFactory.eINSTANCE.createContext()
		_self.activeFrame.topContext = _self.activeFrame.rootContext
	}

	def public DynamicProperty getDynamicProperty(Property property) {
		val candidate_entries = _self.dynamicProperties.filter[e|e.property == property].toList
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a property?")
		}
	}

	def public DynamicCompositeState getDynamicCompositeState(CompositeState compositeState) {
		val candidate_entries = _self.dynamicCompositeStates.filter[e|e.compositeState == compositeState].toList
		if (candidate_entries.length == 1) {
			return candidate_entries.get(0)
		} else {
			throw new Exception("Wut? More than one entry for a stateContainer?")
		}
	}

	def public DynamicPort getDynamicPort(Port port) {
		val dynamicPortCandidates = _self.dynamicPorts.filter[dp|dp.port == port].toList
		if (dynamicPortCandidates.length == 1) {
			return dynamicPortCandidates.get(0)
		} else {
			throw new Exception("More than one DynamicPort for Port '" + port.name + "'")
		}
	}

	def public DynamicVariable _searchContext(Context context, Variable variable) {
		var contextVariablesString = context.dynamicVariables.fold("", [l, dv|l + dv.variable.name + ", "])
		if (contextVariablesString.length >= 2) {
			contextVariablesString = contextVariablesString.substring(0, contextVariablesString.length - 2)
		}
		println("   Searching '" + variable.name + "' in context [" + contextVariablesString + "]")
		val dynamicVariableCandidates = context.dynamicVariables.filter[dv|dv.variable == variable].toList
		if (dynamicVariableCandidates.length == 0) {
			return null
		} else if (dynamicVariableCandidates.length == 1) {
			return dynamicVariableCandidates.get(0)
		} else {
			throw new Exception("More than one DynamicVariable for Variable '" + variable.name + "'")
		}
	}

	def public DynamicVariable getDynamicVariable(Variable variable) {
		var context = _self.activeFrame.topContext
		var DynamicVariable dynamicVariable = null
		while (dynamicVariable === null && context !== null) {
			dynamicVariable = _self._searchContext(context, variable)
			context = context.parentContext
		}
		if (dynamicVariable === null) {
			throw new Exception("Undefined variable '" + variable.name + "'")
		}
		return dynamicVariable
	}

	def public void enterExecutionFrame(EList<Parameter> parameters, EList<Value> parameterValues) {
		println("   Entering new execution frame")
		_self.activeFrame.childFrame = ThingMLFactory.eINSTANCE.createFrame()
		_self.activeFrame = _self.activeFrame.childFrame
		_self.activeFrame.rootContext = ThingMLFactory.eINSTANCE.createContext()
		_self.activeFrame.topContext = _self.activeFrame.rootContext
		for (var i = 0; i < parameters.length; i++) {
			_self.addVariable(parameters.get(i), parameterValues.get(i))
		}
	}

	def public Value leaveExecutionFrame() {
		println("   Leaving last execution frame")
		val returnValue = _self.activeFrame.returnValue
		_self.activeFrame = _self.activeFrame.parentFrame
		_self.activeFrame.childFrame = null
		return returnValue
	}

	def public void stackExecutionContext() {
		println("   Stacking new execution context")
		_self.activeFrame.topContext.childContext = ThingMLFactory.eINSTANCE.createContext()
		_self.activeFrame.topContext = _self.activeFrame.topContext.childContext
	}

	def public void unstackExecutionContext() {
		println("   Unstacking last execution context")
		_self.activeFrame.topContext = _self.activeFrame.topContext.parentContext
		_self.activeFrame.topContext.childContext = null
	}

	def public void addVariable(Variable variable, Value value) {
		println("   Adding variable '" + variable.name + "' with value '" + value.print() +
			"' to the active execution context")
		val dynamicVariable = ThingMLFactory.eINSTANCE.createDynamicVariable()
		dynamicVariable.variable = variable
		dynamicVariable.value = value
		_self.activeFrame.topContext.dynamicVariables.add(dynamicVariable)
	}

	def public void clearContext() {
		_self.activeFrame.topContext.dynamicVariables.clear()
	}
}
