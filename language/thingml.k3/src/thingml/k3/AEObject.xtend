package thingml.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.eclipse.emf.ecore.EObject

@Aspect(className=EObject)
class AEObject {
	public static int LOG_LEVEL = 0 // 0 = Nothing ; 1 = Normal ; 2 = Precise
	public static int LOG_TAB = 1

	def public void setLogLevel(int logLevel) {
		LOG_LEVEL = logLevel
	}

	def public void tab() {
		LOG_TAB++
	}

	def public void detab() {
		LOG_TAB--
	}

	def public void log(String message) {
		_self.log(message, 1)
	}

	def public void log(String message, int logLevel) {
		_self.log(message, true, false, logLevel)
	}

	def public void log(String message, boolean end, boolean following) {
		_self.log(message, end, following, 1)
	}

	def public void log(String message, boolean end, boolean following, int logLevel) {
		if (logLevel <= LOG_LEVEL) {
			var msg = message
			if (!following) {
				for (var i = 0; i < LOG_TAB; i++) {
					msg = "   " + msg
				}
			}
			if (end) {
				msg += "\n"
			}
			print(msg)
		}
	}
}
