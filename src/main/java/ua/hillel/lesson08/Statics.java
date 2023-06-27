package ua.hillel.lesson08;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Statics {
  public static String staticVar = "static default value";
  public String nonStaticVar = "non static default value";

  private static final Logger LOGGER = Logger.getLogger(Statics.class.getName());


  public Statics() {
    System.out.println("stop");
  }

  public static void staticMethod() {
    System.out.println(staticVar);
    System.out.println("i'm static");
  }

  public void nonStaticMethod() {
    LOGGER.log(Level.INFO, "non-static method");
    System.out.println(staticVar);
    System.out.println(nonStaticVar);
    System.out.println("i'm non-static");
  }
}
