package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;

    public ChromeOptions options;
    public BrowserDriver() {
        driver = driver;
        System.setProperty("webdriver.chrome.driver", "C:/Users/samue/untitled/src/test/resources/drives/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void close() {
        driver.close();
    }

}
