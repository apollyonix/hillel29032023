package ua.hillel.lesson03;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IfElseExample {
  public static void main(String[] args) {
    boolean flag = false;
    boolean flag2 = false;
    boolean flag3 = false;

    System.out.println("BEFORE IF-ELSE");

//    if (flag) {
//      System.out.println("INSIDE IF");
//    } else {
//      System.out.println("INSIDE ELSE");
//    }



//    if (true) {
//      System.out.println("INSIDE IF-1");
//    } else if (false) {
//      System.out.println("INSIDE IF-2");
//    } else if (false) {
//      System.out.println("INSIDE IF-3");
//    } else {
//      System.out.println("INSIDE ELSE");
//    }


    if (getFlag1() && getFlag2()) {
      System.out.println("INSIDE IF-1");
      if (false) {
        System.out.println("INSIDE IF-2");
      } else {
        System.out.println("INSIDE ELSE-2");
      }
    } else {
      System.out.println("INSIDE ELSE-1");
    }

    System.out.println("AFTER IF-ELSE");
  }


  private static boolean getFlag1() {
    return true;
  }

  private static boolean getFlag2() {
    return true;
  }
}
