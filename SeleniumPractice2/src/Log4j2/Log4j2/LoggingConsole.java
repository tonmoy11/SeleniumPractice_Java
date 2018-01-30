package Log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingConsole {

	
	private static final Logger log = LogManager.getLogger(LoggingConsole.class.getName());
	
	
	public static void main(String[] args){
		log.debug("Debug message load");
		log.error("Error message load");
		log.fatal("Fatal message load");
	}
	
	
	
}
