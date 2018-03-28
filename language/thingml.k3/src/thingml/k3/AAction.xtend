package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.thingml.xtext.thingML.Action
import org.thingml.xtext.thingML.ActionBlock
import org.thingml.xtext.thingML.FunctionCallStatement
import org.thingml.xtext.thingML.PrintAction
import thingML.DynamicInstance

import static extension thingml.k3.ADynamicInstance.*
import static extension thingml.k3.AExpression.value
import static extension thingml.k3.AValue.print

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
		dynamicInstance.enterExecutionFrame(_self.function.parameters, _self.parameters)
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
