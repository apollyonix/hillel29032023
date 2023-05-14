package ua.hillel.logger;

import java.time.Year;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PropLogger {
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";

  public static void info(String message) {
    System.out.println(ANSI_BLUE + "[INFO]: " + ANSI_RESET + message);
  }

  public static void debug(String message) {

  }

  public static void warn(String message) {
    printMessage(ANSI_RED, "WARN", message);
  }

  public static void error(String message) {

  }

  private static void printMessage(String color, String type, String message) {
    System.out.println(color + "["+ type +"]: " + ANSI_RESET + message);
  }
}
