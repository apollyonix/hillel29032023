package ua.hillel.tests.wd.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.pages.LoginPage;


/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoginTestPO extends BaseTest {
  @Test
  public void loginTest() {

    LoginPage loginPage = openApp().openAuthPage()
        .setUsername("tomsmith11111")
        .setPassword("SuperSecretPassword!")
        .loginWithInvalidCreds();

    Assert.assertTrue(loginPage.getErrorText().contains("Your username is invalid!"));

  }
}
