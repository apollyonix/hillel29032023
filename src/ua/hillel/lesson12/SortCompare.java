package ua.hillel.lesson12;

import java.util.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SortCompare {
  public static void main(String[] args) {
    List<Integer> inputList = new ArrayList<>();
    Random random = new Random();
    for (int i=0; i<10000; i++) {
      inputList.add(random.nextInt(2000));
    }

    //3
    // 2nd place
    List<Integer> arrayList = new ArrayList<>(inputList);
    long start = System.currentTimeMillis();
    sortCollection(arrayList);
    long end = System.currentTimeMillis();

    System.out.println("Sort ArrayList takes: " + (end-start));

    //2
    //3rd place
    List<Integer> linkedList = new LinkedList<>(inputList);
    start = System.currentTimeMillis();
    sortCollection(linkedList);
    end = System.currentTimeMillis();

    System.out.println("Sort LinkedList takes: " + (end-start));

    //1 | 1
    //winner
    start = System.currentTimeMillis();
    Collections.sort(inputList);
    end = System.currentTimeMillis();
    System.out.println("Native sort takes: " + (end-start));
  }

  private static void sortCollection(List<Integer> list) {
    boolean needSorting = true;
    while (needSorting) {
      needSorting = false;
      for (int i=0; i<list.size()-1; i++) {
        if (list.get(i) > list.get(i+1)) {
          int in = list.get(i);
          int out = list.get(i+1);

          list.set(i, out);
          list.set(i+1, in);
          needSorting = true;
        }
      }
    }
  }
}
