package ua.hillel.lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StreamEx {
  public static void main(String[] args) {
    List<String> stringList = new LinkedList<>();
    stringList.add("10");
    stringList.add("");
    stringList.add("15");
    stringList.add("");
    stringList.add("30");

    List<Integer> integerList = new ArrayList<>();
    for (String s : stringList) {
      if (!s.isBlank()) {
        integerList.add(Integer.valueOf(s));
      }
    }

    for (int i=0; i<integerList.size(); i++) {
      integerList.set(i, integerList.get(i)*100);
    }

    System.out.println(stringList);


    List<Integer> streamList = stringList.stream().filter(s -> !s.isBlank())
        .map(Integer::valueOf).filter(i -> i>20).map(i -> i*100).collect(Collectors.toList());
//    System.out.println(streamList);
//
//    System.out.println(stringList);



    int value = stringList.stream().filter(s -> !s.isBlank())
        .map(Integer::valueOf).filter(i -> i>50).map(i -> i*100).findFirst().orElseThrow(() -> new RuntimeException("No value"));
    System.out.println(value);




    stringList.forEach(s -> {
      System.out.println("Element " + s);
    });
  }
}
