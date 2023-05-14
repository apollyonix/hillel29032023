package ua.hillel.lesson07;

import ua.hillel.lesson06.Cat;
import ua.hillel.lesson06.phone.Camera;
import ua.hillel.lesson06.phone.Filming;
import ua.hillel.lesson06.phone.IPhone;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MethodLib {
  // access_mod return_type name(params) {

  // }

  // isStatusActive


  public void methodWithoutReturn() {

  }

  public Filming methodWithIntReturn() {

    new IPhone().makeCall("s");
    return new IPhone();
  }


  public void methodWithParams(String s, Integer i, boolean b) {

  }

  public int convertInt(int i) {
    i = i+10;
    return i;
  }

  public Cat updateCat(Cat localCat) {
    Cat innerCat = new Cat();
    innerCat.setName(localCat.getName());
    innerCat.setColor(localCat.getColor());
    innerCat.setAge(localCat.getAge() + 2);


    localCat.setAge(localCat.getAge()+4);
    return localCat;
//    return innerCat;
  }


  public void createProducts(String... products) {
//    System.out.println(products[0]);
//    System.out.println(products[1]);
//    System.out.println(products[2]);
  }

  public void createProductsWithArray(String[] products) {

  }


  public void methodWithVarArg(int i, int... ints) {
    System.out.println(i);
    for (int num : ints) {
      System.out.println(num);
    }
  }

//  public void giveDiscount(int discount) {
//
//  }

  //Existing method
  public void createProduct(String product) {
    createProduct(product, 0);
  }

  public void createProduct(String product, double discount) {
    //product creation

    if (discount > 0) {
      //add discount
    }
  }










}
