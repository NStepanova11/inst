package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By notNowBtn = By.xpath(".//*[text()='Не сейчас']");
    By prifileName = By.className("SKguc");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickByNotNowBtn(){
        driver.findElement(notNowBtn).click();
    }

    public String getProfileName(){
        return driver.findElement(prifileName).getText();
    }
}
