package ua.hillel.lesson11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ListEx {
  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(2, 5);
    list.add(3);
    list.set(2, 0);

    list.get(1);

    Integer[] iArr = { 1, 2, 3 };

    List<Integer> listFromArray = Arrays.asList(iArr);

    String categoriess = "note,phone,tablet";
    String[] catArray = categoriess.split(",");
    List<String> categoryList = Arrays.asList(catArray);

  }
}
