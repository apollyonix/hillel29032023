package ua.hillel.pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.hillel.pages.rozetka.components.Header;
import ua.hillel.pages.rozetka.components.ItemCard;

import java.util.List;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CatalogPage {
  private WebDriver driver;
  public Header header;

  private List<WebElement> items;

  public CatalogPage(WebDriver driver) {
    this.driver = driver;
    header = new Header(driver);
  }

  public String getItemName(int itemNum) {
    WebElement item = items.get(itemNum-1);
    return new ItemCard(item).getTitle();
  }
}
