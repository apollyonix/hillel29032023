package ua.hillel.lesson02;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class StringEx {
  public static void main(String[] args) {
    String str = "string1";
    String str2 = new String("string2");

    System.out.println(str.toUpperCase());
    System.out.println(str);

    str.isEmpty();
    str = "I learn java";
    boolean result = str.contains("java");


    String s = "I " + " learn " + 10 + " langs";
  }
}
