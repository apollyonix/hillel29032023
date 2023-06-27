package ua.hillel.pages.rozetka;

import org.openqa.selenium.WebDriver;
import ua.hillel.pages.rozetka.components.Header;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ItemPage {
  private WebDriver driver;
  public Header header;

  public ItemPage(WebDriver driver) {
    this.driver = driver;
    this.header = new Header(driver);
  }
}
