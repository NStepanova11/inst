package Pages;

import org.openqa.selenium.WebDriver;

public class FollowingPage {
    WebDriver driver;

    public FollowingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoFollowingPage(){
        driver.get("https://www.instagram.com/im__aasha/following/");
    }
}
