package ua.hillel.lesson08;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public enum Status {
  NEW("New"),
  IN_PROGRESS("In progress"),
  DONE("Done"),
  BLOCKED("Blocked by...");

  private String status;

  private Status(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
