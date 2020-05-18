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
        Thread.sleep(5000);
        driver.findElement(userName).sendKeys(userNameValue);
    }

    private void setPassword(String passwordValue) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(password).sendKeys(passwordValue);
    }

    private void clickLoginButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(loginButton).click();
    }

    public void loginToInst(String username, String password) throws InterruptedException {
        this.setUserName(username);
        this.setPassword(password);
        this.clickLoginButton();
    }
}
