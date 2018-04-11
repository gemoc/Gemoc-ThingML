package thingml.utils

class Log {
	public static int LOG_LEVEL = 0 // 0 = Nothing ; 1 = Normal ; 2 = Precise
	public static int LOG_TAB = 1

	def public static void setLogLevel(int logLevel) {
		LOG_LEVEL = logLevel
	}

	def public static void tab() {
		LOG_TAB++
	}

	def public static void detab() {
		LOG_TAB--
	}

	def public static void log(String message) {
		log(message, 1)
	}

	def public static void log(String message, int logLevel) {
		log(message, true, false, logLevel)
	}

	def public static void log(String message, boolean end, boolean following) {
		log(message, end, following, 1)
	}

	def public static void log(String message, boolean end, boolean following, int logLevel) {
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