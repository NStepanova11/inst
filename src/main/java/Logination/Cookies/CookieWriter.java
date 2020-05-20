package Logination.Cookies;

import Logination.Login;
import Pages.HomePage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static Logination.Cookies.CookiesHandler.COOKIES_PATH;

public class CookieWriter {
    public void writeCookiesToFile(WebDriver webDriver){
        File file = new File(COOKIES_PATH);
        try {
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (Cookie ck : webDriver.manage().getCookies()) {
                writer.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи куки - "+ e.getLocalizedMessage());
        }
    }
}
