import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger implements ILogger {
    private static Logger logger = null;
    private Date date;
    private SimpleDateFormat simpleDateFormat;

    private int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    @Override
    public void log(String msg) {
        date = new Date();
        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        System.out.println("[" + simpleDateFormat.format(date) + " " + num++ + "] " + msg);
    }
}
