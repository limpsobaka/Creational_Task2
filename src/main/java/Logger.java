import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
  protected int num = 1;
  private static Logger logger;

  private Logger() {
  }

  public static Logger getInstance() {
    if (logger == null) {
      return logger = new Logger();
    } else {
      return logger;
    }
  }

  public void log(String msg) {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    String dt = dtf.format(LocalDateTime.now());
    System.out.println("[" + dt + " " + num++ + "] " + msg);
  }
}
