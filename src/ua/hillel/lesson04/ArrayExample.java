package ua.hillel.lesson04;

import java.util.Arrays;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ArrayExample {
  public static void main(String[] args) {
    int[][] intArray22 = new int[5][5];
    String[] stringArray = new String[10];


    String[] categories = {"cat1", "cat2", "cat3"};
//    System.out.println(Arrays.toString(categories));


    int[] intArray = new int[5];
//    System.out.println(Arrays.toString(intArray));

    intArray[1] = 10;
    intArray[3] = 20;

//    System.out.println(Arrays.toString(intArray));

    int i = intArray[1] + 5;
//    System.out.println(i);


    for (int j=0; j<intArray.length; j++) {
//      System.out.println(j + "-element in array:" + intArray[j]);
      int value = intArray[j];
    }

//    for (int value : intArray) {
//      System.out.println("Old value: " + value);
//      value += 10;
//      System.out.println("New value: " + value);
//    }
//
//    System.out.println(Arrays.toString(intArray));


//    String categories = "phone,notebook,tablet,smart watch";
//    String[] cats = categories.split(",");
//    for (String category : cats) {
//      System.out.println("Navigate to category: " + category);
//    }
  }
}
