package ua.hillel.pages.rozetka.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ItemCard {
  private WebElement parent;

  @FindBy(css = ".title")
  private WebElement title;

  @FindBy(xpath = ".//span[@class='price']")
  private WebElement price;

  public ItemCard(WebElement element) {
    parent = element;
    PageFactory.initElements(element, this);
  }

  public String getTitle() {
    return title.getText();
  }

  public String getPrice() {
    return price.getText();
  }

  public boolean isAvailable() {
    return true;
  }
}
