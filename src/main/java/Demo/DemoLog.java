package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DemoLog {
	

	

		static Logger logger=LogManager.getLogger(DemoLog.class.getName());
		public static void Sample(int l) {
			if(l==1) {
				logger.trace("Tracking");
			}
			else if(l==2) {
				logger.info("Started the test");
			}
			else if(l==3) {
				logger.error("Error Occured");
			}
			else if(l==4) {
				logger.fatal("Fatal error occured");
			}
			else if(l==5) {
				logger.info("Ending the test");	
			}
		}
	}

