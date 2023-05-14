package ua.hillel.lesson10;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ButtonNotFoundException extends RuntimeException {
  public ButtonNotFoundException(String name, String locator) {
    super("Button " + name + " was not found; locator: " + locator);
  }
}
