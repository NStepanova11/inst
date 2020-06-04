package Pages;

import org.openqa.selenium.WebDriver;

public class ExplorePage {
    WebDriver driver;

    public ExplorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoExplorePage(){
        driver.get("https://www.instagram.com/explore/");
    }
}
