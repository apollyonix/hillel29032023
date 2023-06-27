package ua.hillel.lesson08;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class Finals {
  private final String FINAL_VAR_NAME = "name";
  public final String FINAL_CONST_VAR;

  public Finals(String value) {
    FINAL_CONST_VAR = value;
  }

  public void updateVar() {
//    FINAL_VAR_NAME = "newName";
  }

  public void setStatus(Status status) {
    System.out.println("Setting status: " + status.getStatus());
  }

  public void finalMethod() {
    System.out.println("I'm final in Finals.class");
  }
}
