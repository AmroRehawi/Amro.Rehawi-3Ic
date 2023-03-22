import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogFile {
    static Logger logger = LogManager.getLogger(LogFile.class);

    public LogFile(){

    }
    public static synchronized void WriteLine(String logMessage) {
        logger.info(logMessage);

    }
}
