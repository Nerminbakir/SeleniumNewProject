package odevler.day01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1.Yeni bir class olusturalim (Homework)
        // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED --> " + actualTitle);

        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "facebook";

        if (actualUrl.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED --> " + actualUrl);

        //4. https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");
        Thread.sleep(3000);

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitleWalmart = driver.getTitle();
        String expectedTitleWalmart = "Walmart.com";
        if(actualTitleWalmart.contains(expectedTitleWalmart)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED --> " + actualTitleWalmart);

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(3000);

        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //9. Browser’i kapatin
        driver.close();

    }
}