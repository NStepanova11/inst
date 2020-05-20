package TestPackage;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testHomePage {
    HomePage homePage;

    @BeforeTest
    public void closePopup(){
        homePage = new HomePage(testConfig.driver);
        homePage.clickByNotNowBtn();
    }

    @Test
    public void checkProfile(){
        Assert.assertEquals(homePage.getProfileName(), "im__aasha");
    }
}
