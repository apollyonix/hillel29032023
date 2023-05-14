package ua.hillel.lesson08;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class AdminDetailPage extends UserDetailPage {
  public AdminDetailPage(String adminParam) {
    if (param.contains("111")) {
      System.out.println("111");
    }
    System.out.println("AdminDetail page created");
  }

  @Override
  public void openUserDetails() {
    super.openUserDetails();
    System.out.println("admin details");
  }


  public void openUserDetails(String role) {

  }
}
