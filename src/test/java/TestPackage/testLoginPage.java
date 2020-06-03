package TestPackage;

import Logination.Login;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class testLoginPage {
    Login loginPage;
    HomePage homePage;

    WebDriver driver;

    @BeforeSuite
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.instagram.com/");
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        loginPage = new Login(driver);
        loginPage.loginToInst("+79877252367", "samsung1234");
    }


    @Test(priority = 2)
    public void closePopup(){
        homePage = new HomePage(driver);
        homePage.clickByNotNowBtn();
    }

    @Test(priority = 3)
    public void checkProfile(){
        Assert.assertEquals(homePage.getProfileName(), "im__aasha");
    }

}
