package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager
import org.thingml.xtext.thingML.ThingMLModel

@Aspect(className=ThingMLModel)
class Printer {
	static val MessagingSystem messagingSystem = new MessagingSystemManager().
		createBestPlatformMessagingSystem("Model Execution Console", "Model Execution Console")

	def static void log(String msg) {
		messagingSystem.info(msg, null)
	}

	def static void log(Object obj) {
		log(null, obj.toString())
	}
}
