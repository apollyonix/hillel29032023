package ua.hillel.tests.testng.parallelTests;

import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PClass2 {
  @Test
  public void test() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {}

    System.out.println("Test passed");
  }
}
