package ua.hillel.tests.wd.utils;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PropTest {
  @Test
  public void propTest() throws IOException {
    System.out.println(TestProperties.getProperty("url"));
  }
}
