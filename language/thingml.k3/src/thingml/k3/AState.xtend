package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.State
import thingML.DynamicInstance

import static extension thingml.k3.AAction.execute

@Aspect(className=State)
class AState {
	@Step
	def public boolean run(DynamicInstance dynamicInstance) {
		return false
	}

	def public void onEntry(DynamicInstance dynamicInstance) {
		if (_self.entry !== null) {
			println("Executing 'on entry' for instance '" + dynamicInstance.instance.name + "'")
			_self.entry.execute(dynamicInstance)
		}
	}
}

@Aspect(className=CompositeState)
class ACompositeState extends AState {
}
