package ua.hillel.lesson06;

import ua.hillel.lesson06.phone.*;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class OopExample {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.setName("Lucifer");
    cat1.setAge(1);
//    cat1.setColor("black");


    String name = cat1.getName();
    System.out.println(cat1);


//
    Cat cat2 = new Cat();
//    Cat cat2 = cat1;
    cat2.setName("Lucifer");
    cat2.setAge(3);

    System.out.println(cat1.equals(cat2));


//    cat2.age = 3;
//    cat2.color = "white";
//
//    cat1.sayMeow();
//    cat2.sayMeow();

//    Phone phone = new IPhone();
//
//    phone.makeCall("1111");
//    phone.receiveSms("12222", "text");
//
//    Filming filming = new Camera();
//
//    Filming filming1 = new AndroidPhone();
  }
}
