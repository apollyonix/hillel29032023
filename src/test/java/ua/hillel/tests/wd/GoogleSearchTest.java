package ua.hillel.tests.wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class GoogleSearchTest {
  @Test
  public void googleSearchTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://google.com");

    WebElement searchArea = driver.findElement(By.cssSelector("[name='q']"));

    searchArea.clear();
    searchArea.sendKeys("Selenium Webdriver" + Keys.ENTER);

    WebElement searchResultLink = driver.findElement(By.xpath("//h3"));

    Assert.assertTrue(searchResultLink.getText().contains("WebDriver"));

    driver.quit();
  }
}
