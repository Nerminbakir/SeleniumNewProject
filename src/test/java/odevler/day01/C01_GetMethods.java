package odevler.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Yeni bir package olusturalim : day01
        // 2. Yeni bir class olusturalim : C01_GetMethods
        // 3. Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com"); // driver.navigate().to("https://www.amazon.com"); bu sekilde de kullanılabilir.
        Thread.sleep(3000);

        // 4. Sayfa basligini(title) yazdirin
        System.out.println("Amazon Sayfa Basliği : " + driver.getTitle()); // Amazon.com. Spend less. Smile more.
        Thread.sleep(3000);

        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        // 6. Sayfa adresini(url) yazdirin
        System.out.println("Amazon URL : " + driver.getCurrentUrl());
        Thread.sleep(3000);

        // 7.Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        // 8. Sayfa handle degerini yazdirin
        System.out.println("Amazon Handle Degeri : " + driver.getWindowHandle()); // C24ADFE2EB3DA43E6D8ECD3B27D32D9A
        Thread.sleep(3000);

        // 9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        // System.out.println(driver.getPageSource()); cok uzun old için yoruma aldık
        String actualHtmlCode = driver.getPageSource();
        String expectedCode = "Gateway";

        if (actualHtmlCode.contains(expectedCode)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        // 10.Sayfayi kapatin
        driver.close();

    }
}
