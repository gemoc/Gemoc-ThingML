package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import org.thingml.xtext.thingML.Action
import org.thingml.xtext.thingML.ActionBlock
import org.thingml.xtext.thingML.FunctionCallStatement
import org.thingml.xtext.thingML.PrintAction
import thingML.InstanceContext
import thingML.StringValue

import static extension thingml.k3.AExpression.value
import static extension thingml.k3.AValue.print

@Aspect(className=Action)
class AAction {
	def public void execute(InstanceContext context) {
		throw new Exception("Action type " + _self.class.simpleName + " is not supported in semantics yet")
	}
}

@Aspect(className=FunctionCallStatement)
class AFunctionCallStatement extends AAction {
	@OverrideAspectMethod
	def public void execute(InstanceContext context) {
		_self.function.body.execute(context)
	}
}

@Aspect(className=ActionBlock)
class AActionBlock extends AAction {
	@OverrideAspectMethod
	def public void execute(InstanceContext context) {
		_self.actions.forEach[a|a.execute(context)]
	}
}

@Aspect(className=PrintAction)
class APrintAction extends AAction {
	@OverrideAspectMethod
	def public void execute(InstanceContext context) {
		print(_self.msg.get(0).value(context, false).print())
	}
}
