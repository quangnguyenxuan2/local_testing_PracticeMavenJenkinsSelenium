package Commons;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {

	// Initialize Log4j logs
	private static Logger Log = LogManager.getLogger(Log.class.getName());
	
	public static void startTestCase(String sTestCaseName) {
		Log.info("******* " + sTestCaseName + " ********");

	}
	public static void endTestCase(String sTestCaseName) {
		Log.info("***END***");
	}

	// Need to create these methods, so that they can be called
	public static void info(String message) {
		Log.info(message);
	}
	public static void warn(String message) {
		Log.warn(message);
	}
	public static void error(String message) {
		Log.error(message);
	}
	public static void fatal(String message) {
		Log.fatal(message);
	}
	public static void debug(String message) {
		Log.debug(message);
	}
	
	public static void trace(String message) {
		Log.trace(message);
	}
	public static void setLevel(Level level){
		Log.setLevel(level);
	}
}
