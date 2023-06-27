package ua.hillel.tests.wd.actions;

import org.testng.annotations.Test;
import ua.hillel.pages.rozetka.CatalogPage;
import ua.hillel.pages.rozetka.ItemPage;
import ua.hillel.pages.rozetka.RozMainPage;
import ua.hillel.tests.wd.login.BaseTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class RozetkaComponentsTest extends BaseTest {
  @Test
  public void rozCompTest() {
    RozMainPage rozMainPage = new RozMainPage(driver);

    rozMainPage.header.search("Item");

    ItemPage itemPage = new ItemPage(driver);
    itemPage.header.goToMainPage();

    CatalogPage catalogPage = new CatalogPage(driver);

    String item1Name = catalogPage.getItemName(1);
    String item2Name = catalogPage.getItemName(2);

  }

}
