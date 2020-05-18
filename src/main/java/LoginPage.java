import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath(".//*[text()='Войти']");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private void setUserName(String userNameValue) throws InterruptedException {
        driver.findElement(userName).sendKeys(userNameValue);
        Thread.sleep(5000);
    }

    private void setPassword(String passwordValue) throws InterruptedException {
        driver.findElement(password).sendKeys(passwordValue);
        Thread.sleep(5000);
    }

    private void clickLoginButton() throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(5000);
    }

    public void loginToInst(String username, String password) throws InterruptedException {
        this.setUserName(username);
        this.setPassword(password);
        this.clickLoginButton();
    }
}
