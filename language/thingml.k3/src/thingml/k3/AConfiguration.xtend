package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.AbstractConnector
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Configuration
import org.thingml.xtext.thingML.Instance

import static thingml.k3.Printer.log

import static extension thingml.k3.AInstance.init

@Aspect(className=Configuration)
class AConfiguration {
	@InitializeModel
	def public void init(EList<String> p) {
		for (Instance instance : _self.instances) {
			instance.init()
		}
		for (ConfigPropertyAssign assign : _self.propassigns) {
			log(null, "Hello World!")
		}
		for (AbstractConnector connector : _self.connectors) {
			log(null, "Hello World!")
		}
	}

	@Main
	def public void main() {
		log(null, "Hello World!")
		_self.end()
	}

	@Step
	def private void end() {
		// Do nothing
	}
}
