package ua.hillel.lesson07;

import ua.hillel.lesson06.Cat;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodEx {
  public static void main(String[] args) {
    MethodLib myMethLib = new MethodLib();
//    myMethLib.methodWithParams("s", 2, false);
//
//    new MethodLib().methodWithParams("string",  2, true);


    int input = 10;

    int output = myMethLib.convertInt(input);
//    System.out.println(input + " " + output);

//    Cat cat = new Cat();
//    cat.setAge(10);
//
//    Cat cat1 = myMethLib.updateCat(cat);

//    System.out.println(cat);
//    System.out.println(cat1);


    myMethLib.createProducts();
    myMethLib.createProducts("p1");
    myMethLib.createProducts("p1", "p2");
    myMethLib.createProducts("p1", "p3", "p4");




    myMethLib.methodWithVarArg(0);
    myMethLib.methodWithVarArg(0, 1, 2, 3);


//    myMethLib.giveDiscount(1);
//    myMethLib.giveDiscount(1.2);



    Cat cat2 = new Cat();
    cat2.setName("name")
        .setAge(1)
        .setColor("black");


    Cat cat = new Cat("name");


  }
}
