package ua.hillel.lesson09;

import ua.hillel.lesson09.logger.MyLogger;
import ua.hillel.logger.EnumLogger;
import ua.hillel.logger.PropLogger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductTest {
  public static void main(String[] args) {
//    PropLogger.info("start test");
    EnumLogger.log(EnumLogger.LogLevel.INFO, "starting test");
    Product product1 = new Product();
    product1.name = "prod 1";
    product1.description = "desc 1";
    product1.category = "note";
    product1.price = 1299;
    product1.discount = 2.5;
//    createProd("", "", "", 1299);
    createProd(product1);
//    PropLogger.warn("test failed");
    EnumLogger.log(EnumLogger.LogLevel.ERROR, "test failed");
    //product 2
    createProd("prod 2", "desc 2", "note", 1299);

  }

  private static void createProd(String name, String desc, String category, double price) {
    ProductDetailPage productDetailPage = new ProductDetailPage();
    productDetailPage.setProductName(name);
    productDetailPage.setDescription(desc);
    productDetailPage.setCategory(category);
    productDetailPage.setPrice(price);
  }


  private static void createProd(Product product) {
    ProductDetailPage productDetailPage = new ProductDetailPage();
    productDetailPage.setProductName(product.name);
    productDetailPage.setDescription(product.description);
    productDetailPage.setCategory(product.category);
    productDetailPage.setPrice(product.price);
  }


  public static class Product {
    String name;
    String description;
    String category;
    double price;
    double discount;

    public String getName() {
      return name;
    }
  }
}
