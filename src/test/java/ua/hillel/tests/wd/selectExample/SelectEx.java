package ua.hillel.tests.wd.selectExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class SelectEx {
  @Test
  public void selectTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/dropdown");

    WebElement selectElement = driver.findElement(By.id("dropdown"));


    Select select = new Select(selectElement);

//    List<String> selectedOptions = select.getAllSelectedOptions()
//        .stream().map(WebElement::getText).collect(Collectors.toList());


//    select.selectByValue("2");


    driver.quit();
  }
}
