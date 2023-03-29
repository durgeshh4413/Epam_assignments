package Logs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {
	
	public static Logger getLogger() {
		System.setProperty("log4j.configurationFile", "C:\\Users\\Durgesh_Honrao\\Desktop\\Assignments\\Epam.Onboarding\\src\\main\\resources\\log4j2.xml");
		Logger logger = LogManager.getRootLogger();
		return logger;
		
	}
	

}
