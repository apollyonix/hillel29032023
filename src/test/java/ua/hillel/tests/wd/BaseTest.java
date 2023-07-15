package ua.hillel.tests.wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import ua.hillel.pages.MainPage;
import ua.hillel.utils.DriverHolder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class BaseTest {
  protected WebDriver driver;

  @BeforeClass
  @Parameters({"browser"})
  public void setUp(String browser) {
    if ("chrome".equalsIgnoreCase(browser)) {
      WebDriverManager.chromedriver().setup();

      ChromeOptions options = new ChromeOptions();
      Map<String, Object> prefs = new HashMap<String, Object>();
      prefs.put("download.default_directory", new File("target/downloads").getAbsolutePath());
      options.setExperimentalOption("prefs", prefs);

      driver = new ChromeDriver(options);
      driver.manage().window().maximize();
    }
    if ("remote".equalsIgnoreCase(browser)) {
      ChromeOptions options = new ChromeOptions();
      options.setCapability("browserVersion", "114.0");
      options.setCapability("selenoid:options", new HashMap<String, Object>() {{
        /* How to add test badge */
        put("name", "Test badge...");

        /* How to set session timeout */
//        put("sessionTimeout", "15m");


        /* How to add "trash" button */
        put("labels", new HashMap<String, Object>() {{
          put("manual", "true");
        }});

        /* How to enable video recording */
//        put("enableVideo", true);
        put("enableVNC", true);
      }});
      try {
        driver = new RemoteWebDriver(new URL("http://192.168.3.46:4444/wd/hub"), options);
      } catch (MalformedURLException e) {
        throw new RuntimeException(e);
      }
    }


    DriverHolder.setDriver(driver);
  }

  @AfterClass(alwaysRun = true)
  public void cleanUp() {
    driver.quit();
  }

  public MainPage openApp() {
    driver.get("https://the-internet.herokuapp.com/");
    return new MainPage();
  }
}
