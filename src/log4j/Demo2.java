package log4j;

import java.io.IOException;
import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void test2() throws IOException
	{
		//1- Configure the log4j;
		// d-date , c- full path , m-massages , n-next line;		
		Layout layout=new PatternLayout("%d %c %m   %n");
		Appender appender = new FileAppender(layout, "./reports/r.log");
		BasicConfigurator.configure(appender);
		
		//2- get the object of log4j or logger class;
		Logger log = Logger.getLogger(this.getClass().getName());
		
		//3- Print the massages;
		
		
		log.setLevel(Level.ALL); 	// Print All Massages;
		//log.setLevel(Level.OFF); 	// DOn't Print any massages;
		
		log.info("information");
		log.warn("warning massage");
		log.error("Error Massage");
		
	}

}
