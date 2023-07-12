package ua.hillel.tests.selenide;

import org.testng.annotations.Test;
import ua.hillel.tests.utils.TestDataStorage;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class UploadTest {

  @Test
  public void selenideDownloadTest() throws FileNotFoundException {
    File file= $(".downloads").download();
    TestDataStorage.saveTestData("file", file);

  }

  @Test
  public void selenideUploadTest() {
    File file = (File) TestDataStorage.getTestData("file");
    $(".upload").uploadFile(file.getAbsoluteFile());
  }
}
