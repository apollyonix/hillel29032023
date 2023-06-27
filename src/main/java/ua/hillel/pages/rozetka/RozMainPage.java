package ua.hillel.pages.rozetka;

import org.openqa.selenium.WebDriver;
import ua.hillel.pages.rozetka.components.Header;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozMainPage {
  private WebDriver driver;
  public Header header;

  public RozMainPage(WebDriver driver) {
    this.driver = driver;
    header = new Header(driver);
  }
}
