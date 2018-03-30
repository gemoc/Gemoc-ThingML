package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.eclipse.emf.common.util.BasicEList
import org.thingml.xtext.thingML.Action
import org.thingml.xtext.thingML.ActionBlock
import org.thingml.xtext.thingML.FunctionCallStatement
import org.thingml.xtext.thingML.Increment
import org.thingml.xtext.thingML.LocalVariable
import org.thingml.xtext.thingML.PrintAction
import org.thingml.xtext.thingML.Property
import org.thingml.xtext.thingML.SendAction
import org.thingml.xtext.thingML.VariableAssignment
import thingML.DynamicInstance
import thingML.DynamicPort
import thingML.ThingMLFactory
import thingML.Value

import static extension thingml.k3.ADynamicInstance.*
import static extension thingml.k3.AExpression.*
import static extension thingml.k3.AValue.*

@Aspect(className=Action)
class AAction {
	def public void execute(DynamicInstance dynamicInstance) {
		throw new Exception("Action type " + _self.class.simpleName + " is not supported in semantics yet")
	}
}

@Aspect(className=FunctionCallStatement)
class AFunctionCallStatement extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		println("Calling function '" + _self.function.name + "'")
		val parameterValues = new BasicEList<Value>()
		_self.parameters.forEach[p|parameterValues.add(p.value(dynamicInstance, false))]
		dynamicInstance.enterExecutionFrame(_self.function.parameters, parameterValues)
		_self.function.body.execute(dynamicInstance)
		dynamicInstance.leaveExecutionFrame()
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
}

@Aspect(className=PrintAction)
class APrintAction extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		println("This is a print action")
		print(_self.msg.get(0).value(dynamicInstance, false).print())
	}
}

@Aspect(className=LocalVariable)
class ALocalVariable extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		dynamicInstance.addVariable(_self, _self.init.value(dynamicInstance, false))
	}
}

@Aspect(className=Increment)
class AIncrement extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		if (_self.^var instanceof Property) {
			dynamicInstance.getDynamicProperty(_self.^var as Property).value.increment()
		} else {
			dynamicInstance.getDynamicVariable(_self.^var).value.increment()
		}
	}
}

@Aspect(className=VariableAssignment)
class AVariableAssignment extends AAction {
	@OverrideAspectMethod
	def public void execute(DynamicInstance dynamicInstance) {
		val value = _self.expression.value(dynamicInstance, false)
		if (_self.property instanceof Property) {
			dynamicInstance.getDynamicProperty(_self.property as Property).value = value
		} else {
			dynamicInstance.getDynamicVariable(_self.property).value = value
		}
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
		println(
			"Sending message '" + _self.message.name + "' with parameters [" + paramsString + "] through port '" +
				_self.port.name + "'")
		for (DynamicPort recipient : dynamicInstance.getDynamicPort(_self.port).connectedPorts) {
			val dynamicMessage = ThingMLFactory.eINSTANCE.createDynamicMessage()
			dynamicMessage.message = _self.message
			for (Value value : paramValues) {
				dynamicMessage.parameters.add(value.deepCopy())
			}
			if (recipient.port.receives.contains(_self.message)) {
				println(
					"Message sent to port '" + recipient.port.name + "' of '" +
						(recipient.eContainer as DynamicInstance).instance.name + "'")
				recipient.receivedMessages.add(dynamicMessage)
			}
		}
	}
}
