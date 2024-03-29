package ua.hillel.tests.wd.files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.tests.wd.BaseTest;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FileDownload extends BaseTest {
  @Test
  public void fileDownloadTest() {

    driver.get("https://the-internet.herokuapp.com/download");
    WebElement fileLink = driver.findElement(By.linkText("test.txt"));
    fileLink.click();

    System.out.println("done");
  }
}
