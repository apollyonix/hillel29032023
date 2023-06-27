package ua.hillel.lesson13;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LambdaEx {
  public static void main(String[] args) {
    MyIface iface2 = new MyIface() {
      @Override public int method1() {
        return
            0;
      }
    };


    MyIface iface = () -> {
      Random random = new Random();
      return random.nextInt();
    };

    iface.method1();

    Predicate<String> predicate = s -> s.contains("Java");

//    System.out.println(predicate.test("Java Automation"));
//    System.out.println(predicate.test("JavaScript Automation"));

    Supplier<Integer> supplier = iface2::method1;
//    System.out.println(supplier.get());
//    System.out.println(supplier.get());
//    System.out.println(supplier.get());

    Consumer<Integer> consumer = i -> System.out.println(i);

//    consumer.accept(10);
//    consumer.accept(20);
//    consumer.accept(30);

    Function<String, Integer> function = Integer::valueOf;

    System.out.println(function.apply("5") + function.apply("10"));

    funcMethod(() -> 10);
  }


  public static void funcMethod(MyIface iface) {
    iface.method1();
  }
}
