package ua.hillel.lesson04;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DoWhileExample {
  public static void main(String[] args) {
    boolean cond = true;
    int attempt = 0;

    do {
      if (attempt > 6) {
        cond = false;
      }
      System.out.println("Attempt " + attempt++);
    } while (cond);


    String user1 = getRandomUserFromConfig();
    String user2;
    do {
      user2 = getRandomUserFromConfig();
    } while (user1.equals(user2));
  }


  private static String getRandomUserFromConfig() {
    return "";
  }
}
