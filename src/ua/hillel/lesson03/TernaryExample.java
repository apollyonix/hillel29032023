package ua.hillel.lesson03;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class TernaryExample {
  public static void main(String[] args) {
    int value;
    boolean flag = true;
    boolean flag2 = true;
    boolean flag3 = true;

    value = flag ? 1 : -10;
    System.out.println(value);

    if (flag) {
      value = 1;
    } else {
      value = 2;
    }
  }
}
