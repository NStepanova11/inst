package Pages;

import Logination.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class TestSetup {

    WebDriver driver;
    Login loginPage;
    HomePage homePage;
    public DirectPage directPage;
    public ExplorePage explorePage;
    public FollowingPage followingPage;

    public TestSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.instagram.com/");

        loginPage = new Login(driver);
        homePage = new HomePage(driver);
        directPage = new DirectPage(driver);
        explorePage = new ExplorePage(driver);
        followingPage = new FollowingPage(driver);
    }

    public void logination() throws InterruptedException {
        loginPage.loginToInst("+79877252367", "samsung1234");
        homePage.clickByNotNowBtn();
    }
}
