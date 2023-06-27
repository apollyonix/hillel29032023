package ua.hillel.lesson08;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StaticEx {
  public static void main(String[] args) {
    Statics statics1 = new Statics();
    statics1.nonStaticVar = "111";
    statics1.staticMethod();

    Statics.staticVar = "static var";
    System.out.println(Statics.staticVar);

    Statics statics2 = new Statics();
    statics2.nonStaticVar = "222";

    System.out.println(statics1.nonStaticVar);
    System.out.println(statics2.nonStaticVar);

//    Statics.staticVar = "new static var";
    System.out.println(Statics.staticVar);
    Statics.staticMethod();

    reUseMe();
  }


  private static void reUseMe() {

  }

  private void reUseMeAgain() {

  }
}
