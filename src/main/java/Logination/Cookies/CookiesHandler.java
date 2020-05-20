package Logination.Cookies;

import Logination.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CookiesHandler {
    static final String COOKIES_PATH = "cookies.data";
    static final String REQUEST_URL = "https://www.instagram.com/im__aasha";
    static final String BASE_URL = "https://www.instagram.com/";
    static final String LOGIN = "+79877252367";
    static final String PASSWORD = "samsung1234";

    static WebDriver driver;
    static Login login;
    static CookieReader cookieReader;
    static CookieWriter cookieWriter;

    static void setDriverProps(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        setDriverProps();
        driver.get(BASE_URL );

        cookieReader = new CookieReader();
        File file = new File(COOKIES_PATH);
        if (file.exists()){
            Set<Cookie> cooks = cookieReader.readCookiesFromFile();
            for(Cookie ck : cooks){
                driver.manage().addCookie(ck);
            }
            driver.get(REQUEST_URL);
        }
        else{
            login = new Login(driver);
            login.loginToInst(LOGIN, PASSWORD);
            cookieWriter = new CookieWriter();
            cookieWriter.writeCookiesToFile(driver);
        }
    }
}
