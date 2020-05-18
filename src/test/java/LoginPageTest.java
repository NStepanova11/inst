import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://www.instagram.com/");
    }

    @Test
    public void loginTest(){
        loginPage = new LoginPage(driver);
        loginPage.loginToInst("+79877252367", "samsung1234");
    }

    @Test
    public void sum(){
        Assert.assertEquals(2+3, 5);
    }
}
