package ua.hillel.lesson04;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class WhileExample {
  public static void main(String[] args) {
    int attempt = 0;
    boolean cont = true;

    while (cont) {
      if (attempt > 6) {
        cont = false;
      }
      System.out.println("BEFORE FOR-LOOP");
    }

    System.out.println("AFTER WHILE-LOOP");
  }
}
