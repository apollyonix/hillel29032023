package ua.hillel.tests.testng.actions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AfterActions {
  @AfterSuite
  public void afterSuite() {
    System.out.println("==== After Suite ====");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("==== After Test ====");
  }
}
