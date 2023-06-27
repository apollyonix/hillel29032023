package ua.hillel.lesson10;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ExceptionEx {
  public static void main(String[] args) throws Exception {
//    new ExceptionTest().exceptionTest();


    int index = 10;
    int[] array = {1,2,3};

    try {
      System.out.println("START TRY");
      System.out.println(array[index]);
      System.out.println("END TRY");
    }
//    catch (Exception e) {
//      System.out.println("INSIDE CATCH");
//    }
    finally {
      System.out.println("INSIDE FINALLY");
    }


    System.out.println("AFTER TRY-CATCH");
  }
}
