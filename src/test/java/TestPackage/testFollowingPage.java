package TestPackage;

import Pages.TestSetup;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testFollowingPage {
    TestSetup setup;

    @BeforeSuite
    public void setSetup() throws InterruptedException {
        setup = new TestSetup();
        setup.logination();
    }

    @Test
    public void loadFollowingPage(){
        setup.followingPage.gotoFollowingPage();
    }
}
