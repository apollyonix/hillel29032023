package ua.hillel.lesson09;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodLocalClassEx {
  public void method1() {
    class MethodLocalClass {
      String f1, f2, f3;

    }

    MethodLocalClass methodLocalClass = new MethodLocalClass();

  }

  public void method2() {
  }
}
