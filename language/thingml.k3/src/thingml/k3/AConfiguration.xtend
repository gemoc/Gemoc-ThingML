package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.eclipse.emf.common.util.EList
import org.thingml.xtext.thingML.AbstractConnector
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Configuration
import org.thingml.xtext.thingML.Connector
import org.thingml.xtext.thingML.Instance

import static extension thingml.k3.AInstance.*

@Aspect(className=Configuration)
class AConfiguration extends AEObject {
	@InitializeModel
	def public void init(EList<String> p) {
		_self.log("Config: Start initialization")
		for (Instance instance : _self.instances) {
			instance.init()
		}
		for (ConfigPropertyAssign assign : _self.propassigns) {
			assign.instance.assign(assign)
		}
		for (Instance instance : _self.instances) {
			instance.resolve()
		}
		for (AbstractConnector connector : _self.connectors) {
			if (connector instanceof Connector) {
				connector.cli.connect(connector)
			}
		}
		_self.log("Config: End initialization")
	}

	@Main
	def public void main() {
		_self.log("Config: Start main")
		var running = false

		// first run
		for (Instance instance : _self.instances) {
			instance.enterInitialState()
			running = instance.run() || running
		}

		_self.log("Config: End of the first runs")

		// other runs
		while (running) {
			running = false
			for (Instance instance : _self.instances) {
				running = instance.run() || running
			}
		}

		_self.end()
	}

	@Step
	def public void end() {
		// Do nothing
		_self.log("Config: End")
	}
}
