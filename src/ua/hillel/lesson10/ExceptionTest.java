package ua.hillel.lesson10;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ExceptionTest {
  public void exceptionTest() throws Exception {
    new ExceptionPage().getValueFromConfig();
  }
}
