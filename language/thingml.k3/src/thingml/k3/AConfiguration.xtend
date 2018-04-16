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
import thingml.utils.Log

import static extension thingml.k3.AInstance.*

@Aspect(className=Configuration)
class AConfiguration {
	@InitializeModel
	def public void init(EList<String> p) {
		Log.log("Config: Start initialization")
		Log.tab
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
		Log.detab
		Log.log("Config: End initialization")
	}

	@Main
	def public void main() {
		Log.log("Config: Start main")
		Log.tab
		var running = false

		// first run
		for (Instance instance : _self.instances) {
			instance.enterInitialState()
			running = instance.run(true) || running
		}

		Log.detab
		Log.log("Config: End of the first runs")
		Log.tab

		// other runs
		while (running) {
			running = false
			for (Instance instance : _self.instances) {
				running = instance.run(false) || running
			}
		}

		Log.detab
		_self.end()
	}

	@Step
	def public void end() {
		// Do nothing
		Log.log("Config: End")
	}
}
