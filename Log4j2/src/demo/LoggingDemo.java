package demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {

	
	private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());
	
	
	public static void main(String[] args){
		log.debug("Debug message load");
		log.error("Error message load");
		log.fatal("Fatal message load");
	}
	
	
	
}
