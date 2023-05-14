package ua.hillel.logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class EnumLogger {
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";

  public enum LogLevel {
    INFO,
    DEBUG,
    WARN,
    ERROR
  }

  public static void log(LogLevel level, String message) {
    switch (level) {
      case INFO -> System.out.println(ANSI_BLUE + "[INFO]: " + ANSI_RESET + message);
      case DEBUG -> System.out.println(ANSI_GREEN + "[DEBUG]: " + ANSI_RESET + message);
      case WARN -> System.out.println(ANSI_YELLOW + "[WARN]: " + ANSI_RESET + message);
      case ERROR ->  System.out.println(ANSI_RED + "[ERROR]: " + ANSI_RESET + message);
    }
  }
}
