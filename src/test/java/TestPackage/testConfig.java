package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class testConfig {

    protected static WebDriver driver;

    @BeforeSuite
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.instagram.com/");
    }
}
