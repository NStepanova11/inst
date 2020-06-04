package Pages;

import org.openqa.selenium.WebDriver;

public class DirectPage {
    WebDriver driver;

    public DirectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoDirectPage(){
        driver.get("https://www.instagram.com/direct/inbox/");
    }
}
