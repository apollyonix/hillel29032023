package ua.hillel.lesson04;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ForExample {
  public static void main(String[] args) {
    System.out.println("BEFORE FOR-LOOP");


    boolean b = true;
    int numOfRowsOnPage = 10;//get from page dynamically
//    for (int i = 0; i<numOfRowsOnPage; i++) {
//      System.out.println("Iteration " + i);
//
//    }


    for (int i=2; i>-3; i--) {
      System.out.println("Current value of i:" + i);
      if (i==0) {
        continue;
      }
      System.out.println(5/i);
    }

    System.out.println("AFTER FOR-LOOP");
  }
}