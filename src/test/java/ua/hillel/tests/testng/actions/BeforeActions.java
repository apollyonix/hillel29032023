package ua.hillel.tests.testng.actions;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BeforeActions {
  @BeforeSuite
  public void beforeSuite() {
    System.out.println("==== Before Suite ====");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("==== Before Test ====");
  }
}
