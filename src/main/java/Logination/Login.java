package Logination;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath(".//*[text()='Войти']");

    public Login(WebDriver driver){
        this.driver=driver;
    }

    private void setUserName(String userNameValue) throws InterruptedException {
        driver.findElement(userName).sendKeys(userNameValue);
    }

    private void setPassword(String passwordValue) throws InterruptedException {
        driver.findElement(password).sendKeys(passwordValue);
    }

    private void clickLoginButton() throws InterruptedException {
        driver.findElement(loginButton).click();
    }

    public void loginToInst(String username, String password) throws InterruptedException {
        this.setUserName(username);
        this.setPassword(password);
        this.clickLoginButton();

        HomePage homePage = new HomePage(driver);
        homePage.clickByNotNowBtn();
    }
}
