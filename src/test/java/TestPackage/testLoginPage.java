package TestPackage;

import Logination.Login;
import org.testng.annotations.*;

public class testLoginPage {
    Login loginPage;

    @Test
    public void loginTest() throws InterruptedException {
        loginPage = new Login(testConfig.driver);
        loginPage.loginToInst("+79877252367", "samsung1234");
    }
}
