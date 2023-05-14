package ua.hillel.lesson09;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CatalogTest {
  public static void main(String[] args) {
    CatalogPage catalogPage = new CatalogPage();
    CatalogPage.ProductTable productTable = catalogPage.new ProductTable();

    productTable.getProductName();

    catalogPage.filterByName("product1");
    catalogPage.filterByStatus(AppValues.ProductStatus.NEW);

    productTable = catalogPage.new ProductTable();
    productTable.getProductName();

  }
}
