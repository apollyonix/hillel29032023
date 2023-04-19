package ua.hillel.lesson03;

import javax.swing.text.TableView;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class IfExample {
  public static void main(String[] args) {
    boolean flag = true;
    boolean b1 = true;
    boolean b2 = false;

    System.out.println("BEFORE IF");

    String s = null;

    if (s != null && s.contains("java")) {
      System.out.println("INSIDE IF");
      System.out.println("INSIDE IF - 2");
    }

    System.out.println("AFTER IF");

    //    boolean want = false;
    //    boolean currentState = (want && !isCheckboxChecked());
    //    if (currentState || (!want && isCheckboxChecked())) {
    //      //click
    //    }
    //
    //    if (want ^ isCheckboxChecked()) {
    //
    //    }

    int i = 0;
    if (flag) {
      i = 10;
      double d = 0;
      System.out.println(d);
    }

    System.out.println(i);

  }
}
