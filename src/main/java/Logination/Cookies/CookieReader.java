package Logination.Cookies;

import org.openqa.selenium.Cookie;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;
import static Logination.Cookies.CookiesHandler.COOKIES_PATH;

public class CookieReader {
    public Set<Cookie> readCookiesFromFile() {
        Set<Cookie> newСookies = new HashSet<>();
        Cookie ck = new Cookie("","");

        try {
            File file = new File(COOKIES_PATH);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer str = new StringTokenizer(line, ";");
                while (str.hasMoreTokens()) {
                    String name = str.nextToken();
                    String value = str.nextToken();
                    String domain = str.nextToken();
                    String path = str.nextToken();
                    Date expiry = null;

                    String val;
                    SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy", Locale.ENGLISH);
                    if (!(val = str.nextToken()).equals("null")) {
                        expiry = formatter.parse(val);
                    }
                    boolean isSecure = new Boolean(str.nextToken()).booleanValue();

                    ck = new Cookie(name, value, domain, path, expiry, isSecure);
                }
                newСookies.add(ck);
            }
        } catch (Exception ex) {
            System.out.println("Ошибка при чтении куки - "+ ex.getLocalizedMessage());
        }
       return newСookies;
    }
}