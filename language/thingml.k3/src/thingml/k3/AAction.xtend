package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.common.util.BasicEList
import org.thingml.xtext.thingML.Action
import org.thingml.xtext.thingML.ActionBlock
import org.thingml.xtext.thingML.ConditionalAction
import org.thingml.xtext.thingML.Decrement
import org.thingml.xtext.thingML.FunctionCallStatement
import org.thingml.xtext.thingML.Increment
import org.thingml.xtext.thingML.LocalVariable
import org.thingml.xtext.thingML.LoopAction
import org.thingml.xtext.thingML.PrintAction
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.ReturnAction
import org.thingml.xtext.thingML.SendAction
import org.thingml.xtext.thingML.VariableAssignment
import thingML.ArrayValue
import thingML.BooleanValue
import thingML.DynamicInstance
import thingML.DynamicPort
import thingML.DynamicVariable
import thingML.IntegerValue
import thingML.ThingMLFactory
import thingML.Value
import thingml.utils.Log

import static extension thingml.k3.ADynamicInstance.*
import static extension thingml.k3.AExpression.*
import static extension thingml.k3.AValue.*

@Aspect(className=Action)
class AAction {
	def public void execute(DynamicInstance dynamicInstance) {
		throw new Exception("Action type " + _self.class.simpleName + " is not supported in semantics yet")
	}

	def public String _str() {
		throw new Exception("Action type " + _self.class.simpleName + " is not supported in semantics yet")
	}
}

@Aspect(className=FunctionCallStatement)
class AFunctionCallStatement extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		var params = _self.parameters.fold("", [s, p|s + p._str + ", "])
		if (params.length > 2) {
			params = params.substring(0, params.length - 2)
		}
		Log.log("Preparing procedure call: " + _self.function.name + "(" + params + ")")
		Log.tab
		val parameterValues = new BasicEList<Value>()
		_self.parameters.forEach[p|parameterValues.add(p.value(dynamicInstance, false))]
		dynamicInstance.enterExecutionFrame(_self.function.parameters, parameterValues)
		Log.detab
		Log.log("Execute procedure '" + _self.function.name + "'")
		Log.tab
		_self.function.body.execute(dynamicInstance)
		dynamicInstance.leaveExecutionFrame()
		Log.detab
	}

	@OverrideAspectMethod
	def public String _str() {
		var params = _self.parameters.fold("", [str, e|str + e._str() + ", "])
		if (params.length > 1) {
			params = params.substring(0, params.length - 2)
		}
		return _self.function.name + "(" + params + ")"
	}
}

@Aspect(className=ReturnAction)
class AReturnAction extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val value = _self.exp.value(dynamicInstance, false)
		Log.log("Return value (" + _self.exp._str + ":" + value._str + ")")
		dynamicInstance.activeFrame.returnValue = value
	}

	@OverrideAspectMethod
	def public String _str() {
		return "return " + _self.exp._str
	}
}

@Aspect(className=ActionBlock)
class AActionBlock extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		dynamicInstance.stackExecutionContext()
		_self.actions.forEach[a|a.execute(dynamicInstance)]
		dynamicInstance.unstackExecutionContext()
	}

	@OverrideAspectMethod
	def public String _str() {
		var str = _self.actions.fold("", [s, a|s + a._str + " >>> "])
		if (str.length >= 5) {
			str = str.substring(0, str.length - 5)
		}
		return "{ " + str + " }"
	}
}

@Aspect(className=ConditionalAction)
class AConditionalAction extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		Log.log("Evaluate condition '" + _self.condition._str + "'")
		Log.tab
		val condition = _self.condition.value(dynamicInstance, false)
		Log.detab
		if (condition instanceof BooleanValue) {
			if (condition.value) {
				Log.log("Condition valid")
				Log.tab
				_self.action.execute(dynamicInstance)
				Log.detab
			} else {
				Log.log("Condition invalid")
				if (_self.elseAction !== null) {
					Log.tab
					_self.elseAction.execute(dynamicInstance)
					Log.detab
				}
			}
		} else {
			throw new Exception("Condition has to be a BooleanValue")
		}
	}

	@OverrideAspectMethod
	def public String _str() {
		var str = "if (" + _self.condition._str + ") " + _self.action._str
		if (_self.elseAction !== null) {
			str += " else " + _self.action._str
		}
		return str
	}
}

@Aspect(className=LoopAction)
class ALoopAction extends AAction {
	def public boolean _evaluateLoopCondition(DynamicInstance dynamicInstance) {
		Log.log("Evaluate condition '" + _self.condition._str + "'")
		Log.tab
		val condition = _self.condition.value(dynamicInstance, false)
		Log.detab
		if (condition instanceof BooleanValue) {
			return condition.value
		} else {
			throw new Exception("Condition has to be a BooleanValue")
		}
	}

	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		while (_self._evaluateLoopCondition(dynamicInstance)) {
			Log.log("Condition still valid")
			Log.tab
			_self.action.execute(dynamicInstance)
			Log.detab
		}
		Log.log("Condition not valid anymore")
	}

	@OverrideAspectMethod
	def public String _str() {
		return "while (" + _self.condition._str + ") " + _self.action._str
	}
}

@Aspect(className=PrintAction)
class APrintAction extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val messValue = _self.msg.get(0).value(dynamicInstance, false)
		Log.log("Print '" + messValue._str + "'")
		print(messValue.print)
	}

	@OverrideAspectMethod
	def public String _str() {
		return "print " + _self.msg.get(0)._str
	}
}

@Aspect(className=LocalVariable)
class ALocalVariable extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val value = _self.init.value(dynamicInstance, false)
		Log.log("Add (" + _self.name + "," + value._str + ")")
		dynamicInstance.addVariable(_self, value)
	}

	@OverrideAspectMethod
	def public String _str() {
		return "var " + _self.name + " : " + _self.typeRef.type.name + " = " + _self.init._str
	}
}

@Aspect(className=Increment)
class AIncrement extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val dynamicVariable = dynamicInstance.getDynamicVariable(_self.^var)
		dynamicVariable.value = dynamicVariable.value.increment()
		Log.log("Assign (" + _self.^var.name + "," + dynamicVariable.value._str + ")")
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.^var.name + "++"
	}
}

@Aspect(className=Decrement)
class ADecrement extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val dynamicVariable = dynamicInstance.getDynamicVariable(_self.^var)
		dynamicVariable.value = dynamicVariable.value.decrement()
		Log.log("Assign (" + _self.^var.name + "," + dynamicVariable.value._str + ")")
	}

	@OverrideAspectMethod
	def public String _str() {
		return _self.^var.name + "--"
	}
}

@Aspect(className=VariableAssignment)
class AVariableAssignment extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val value = _self.expression.value(dynamicInstance, false)
		val dynamicVariable = dynamicInstance.getDynamicVariable(_self.property)
		if (_self.index.empty) {
			Log.log("Assign (" + _self.property.name + "," + value._str + ")")
			dynamicVariable.value = value
		} else if (_self.index.length == 1) {
			val index = _self.index.get(0).value(dynamicInstance, false)
			if (index instanceof IntegerValue) {
				if (dynamicVariable.value instanceof ArrayValue) {
					Log.log("Assign (" + _self.property.name + "[" + index._str + "]," + value._str + ")")
					val arrayValue = dynamicVariable.value as ArrayValue
					arrayValue.values.set(index.value as int, value)
				} else {
					throw new Exception("Trying to access cell of a non array variable")
				}
			} else {
				throw new Exception("Index has to be an IntegerValue")
			}
		} else {
			throw new Exception("How can?!")
		}
	}

	@OverrideAspectMethod
	def public String _str() {
		var str = _self.property.name
		if (!_self.index.empty) {
			str += "[" + _self.index.get(0)._str + "]"
		}
		return str + " = " + _self.expression._str
	}
}

@Aspect(className=SendAction)
class ASendAction extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val paramValues = _self.parameters.map[e|e.value(dynamicInstance, false)].immutableCopy
		var paramsString = paramValues.fold("", [str, v|str + v._str() + ", "])
		if (paramsString.length >= 2) {
			paramsString = paramsString.substring(0, paramsString.length - 2)
		}
		var recipients = ""
		for (DynamicPort recipient : dynamicInstance.getDynamicPort(_self.port).connectedPorts) {
			val dynamicMessage = ThingMLFactory.eINSTANCE.createDynamicMessage()
			dynamicMessage.message = _self.message
			for (Value value : paramValues) {
				dynamicMessage.parameters.add(value.deepCopy())
			}
			if (recipient.port.receives.contains(_self.message)) {
				recipients += (recipient.eContainer as DynamicInstance).instance.name + "." + recipient.port.name + ", "
				recipient.receivedMessages.add(dynamicMessage)
			}
		}
		if (recipients.length > 2) {
			recipients = recipients.substring(0, recipients.length - 2)
		}
		Log.log(dynamicInstance.instance.name + "." + _self._str + " -> [" + recipients + "]")
	}

	@OverrideAspectMethod
	def public String _str() {
		var params = _self.parameters.fold("", [s, p|s + p._str + ", "])
		if (params.length > 2) {
			params = params.substring(0, params.length - 2)
		}
		return _self.port.name + "!" + _self.message.name + "(" + params + ")"
	}
}
