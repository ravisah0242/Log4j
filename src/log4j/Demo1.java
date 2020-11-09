package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1()
	{
		//What is log ?:Capturing info/Activity at the time of program execution
		//type of logs:
		//1.info
		//2.worn
		//3.error
		//4.fatal

		//How to generate the logs? :using Apache log4j API
		//How to Works? : it reads log 4j configuration from log4j.properties file
		//Where to create: create inside resource folder
		
		//1- Configure the log4j;
		BasicConfigurator.configure();
		
		//2- get the object of log4j or logger class;
		Logger log = Logger.getLogger(this.getClass().getName());
		//log.setLevel(Level.ALL);
		//log.setLevel(Level.OFF);
		
		//3- Print the massages;
		log.info("information");
		log.warn("warning massage");
		log.error("Error Massage");
		
	}

}
