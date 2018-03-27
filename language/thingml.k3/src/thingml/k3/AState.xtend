package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.State
import thingML.InstanceContext

import static extension thingml.k3.AAction.execute

@Aspect(className=State)
class AState {
	@Step
	def public boolean run(InstanceContext context) {
		return false
	}

	def public void onEntry(InstanceContext context) {
		if (_self.entry !== null) {
			_self.entry.execute(context)
		}
	}
}

@Aspect(className=CompositeState)
class ACompositeState extends AState {
}
