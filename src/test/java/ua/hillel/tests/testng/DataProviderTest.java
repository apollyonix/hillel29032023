package ua.hillel.tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class DataProviderTest {
  @Test(dataProvider = "userProvider")
  public void userRoleTest(String username, String password, String role) {
    System.out.printf("name: %s - paswword: %s - role: %s%n", username, password, role);
    System.out.println("Starting test for " + role);
    if (role.equals("admin")) {
      throw new RuntimeException("Test failed");
    }

    System.out.println("Test for " + role + " passed");

    Assert.assertEquals("actual", 1, "Assertion message");
    Assert.assertFalse(true, "Message");

    SoftAssert softUserAssert = new SoftAssert();
    softUserAssert.assertEquals(username, "Jon");
    softUserAssert.assertTrue(role.isBlank());


    System.out.println("test goes on");
    softUserAssert.assertAll();

  }


  @DataProvider(name = "userProvider")
  public Object[][] userProvider() {
    String[][] users = {
      {"userName", "userPass", "user"},
      {"adminName", "adminPass", "admin"},
      {"guestName", "guestPass", "guest"}
    };
    return users;
  }
}
