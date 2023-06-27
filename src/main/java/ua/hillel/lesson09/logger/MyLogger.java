package ua.hillel.lesson09.logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MyLogger {
  private final static String RED = "\u001B[31m";
  private final static String GREEN = "\u001B[32m";
  private static final String RESET = "\u001B[0m";

  public static void log(LogLevel level, String message) {
    switch (level) {
    case INFO:
      //setting color to GREEN
      System.out.println(message);
      break;
    case WARN:
      //setting color to YELLOW
      break;
    case ERROR:
      //setting color to RED
    }
  }

  public static void info(String message) {
    logMessage(LogLevel.INFO, message, "console");
  }

  public static void debug(String message) {
    logMessage(LogLevel.DEBUG, message);
  }

  public static void error(String message) {
    logMessage(LogLevel.ERROR, message, "console", "db");
  }

  private static void logMessage(LogLevel level, String message, String... logSource) {
    switch (level) {
    case INFO:
      //setting color to GREEN
      System.out.println(GREEN + "[INFO]: " + RESET + message);
      break;
    case ERROR:
      System.out.println(RED + "[ERROR]: " + RESET + message);
    }
  }

  public enum LogLevel {
    ERROR,
    WARN,
    INFO,
    DEBUG;
  }
}
