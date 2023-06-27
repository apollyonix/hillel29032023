package ua.hillel.tests.wd.files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.tests.wd.login.BaseTest;

import java.io.File;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class FileUploadTest extends BaseTest {
  @Test
  public void uploadTest() {
    driver.get("https://the-internet.herokuapp.com/upload");

    File file = new File("target/downloads/test.txt");

    WebElement fileInput = driver.findElement(By.id("file-upload"));
    fileInput.sendKeys(file.getAbsolutePath());

    WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
    fileUploadButton.click();

  }
}
