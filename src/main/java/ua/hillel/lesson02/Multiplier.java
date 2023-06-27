package ua.hillel.lesson02;

import java.util.List;
import java.util.Random;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Multiplier {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
    Random random = new Random();
    for (int i=0; i<10; i++) {
      System.out.printf("%d * %d = %n", nums.get(random.nextInt(nums.size())),
                        nums.get(random.nextInt(nums.size())));
    }
  }
}
