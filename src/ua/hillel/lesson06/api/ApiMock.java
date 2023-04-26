package ua.hillel.lesson06.api;

import ua.hillel.lesson06.Cat;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ApiMock {
  public Cat createCat(Cat cat) {
    System.out.println("Sending POST message to API");
    return cat;
  }
}
