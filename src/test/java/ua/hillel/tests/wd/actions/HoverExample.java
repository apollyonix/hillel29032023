package ua.hillel.tests.wd.actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class HoverExample {
  @Test
  public void hoverTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://crossbrowsertesting.github.io/hover-menu.html");


    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(By.cssSelector(".dropdown")))
        .pause(Duration.ofSeconds(1))
        .moveToElement(driver.findElement(By.cssSelector(".secondary-dropdown a[data-toggle]")))
        .pause(Duration.ofSeconds(1))
        .moveToElement(driver.findElement(By.cssSelector(".dropdown-menu.secondary a")))
        .click()
        .perform();


    driver.quit();
  }
}
