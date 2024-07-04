import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerLogs {

    Logger logger = LoggerFactory.getLogger(LoggerLogs.class);
    public static void main(String[] args) {
        LoggerLogs ll = new LoggerLogs();
        String valuString = "Debug";
    
        ll.processList(valuString);
    }

    public String processList(String str) {
        logger.info("client requested process of ", str);

        try {
            logger.debug("Starting process");
            // ...processing list here...
            Thread.sleep(5000);
        } catch (RuntimeException | InterruptedException e) {
            logger.error("There was an issue processing the list.", e);
        } finally {
            logger.info("Finished processing");
        }
        return "done";
    }
}