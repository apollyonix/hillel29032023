package ua.hillel.lesson02;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class PrimitiveOperations {
  public static void main(String[] args) {
    int a = 1;
    a = a + 2;

    a += 2;
    a=0;

//    System.out.println(7/3);
//    System.out.println(7%3);

    a++;
    ++a;
    System.out.println(a++);
    System.out.println(++a);

    int b = 10;

    System.out.println(a == b);

    Integer I = 10;
    int iii = I;
    System.out.println(I+1);


    byte b1 = 1;
    short s1 = 2;
    int i1 = 3;
    long l1 = 400;

    long sum = b1 + s1 + i1 + l1;
    byte shortSum = (byte) (b1 + s1 + i1 + l1);
    System.out.println(shortSum);



    int d = 1;

    int dayOfWeek = 1;


  }
}
