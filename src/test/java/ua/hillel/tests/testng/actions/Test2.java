package ua.hillel.tests.testng.actions;

import org.testng.annotations.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Test2 {
  @BeforeClass
  public void beforeClass() {
    System.out.println("==== Before Class Test2 ====");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("==== After Class Test2 ====");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("==== Before Method ====");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("==== After Method ====");
  }

  @Test
  public void test1() {
    System.out.println("==== Test 3 ====");
  }

  @Test
  public void test2() {
    System.out.println("==== Test 4 ====");
  }
}
