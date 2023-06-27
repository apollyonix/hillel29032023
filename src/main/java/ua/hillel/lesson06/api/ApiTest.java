package ua.hillel.lesson06.api;

import ua.hillel.lesson06.Cat;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ApiTest {
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.setName("ApiCat");

    Cat response = new ApiMock().createCat(cat);

    System.out.println(cat.equals(response));
  }
}
