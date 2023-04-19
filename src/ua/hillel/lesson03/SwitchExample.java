package ua.hillel.lesson03;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SwitchExample {
  public static void main(String[] args) {
    int dayOfWeek = 70;

    switch (dayOfWeek) {
      case 6:
      System.out.println("SATURDAY");
      break;
      case 1:
      case 2:
      case 3:
        System.out.println("WORKING DAY");
        break;

      case 7:
        System.out.println("SUNDAY");
        break;
      default:
        System.out.println("WRONG DAY");
    }


    String month = "Jan";
    switch (month) {
      case "Jan":
      case "Feb":
      case "Dec":
        System.out.println("winter");
    }



  }




}
