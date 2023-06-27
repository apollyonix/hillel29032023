package ua.hillel.lesson08;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BasePage {
  protected String param;
  public BasePage(String baseParam) {
    this.param = baseParam;
    System.out.println("Base page created");
  }
}
