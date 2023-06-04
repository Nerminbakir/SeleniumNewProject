package odevler.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class TekrarTesti01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. Yeni bir class olusturun (TekrarTesti)
        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https:///www.youtube.com");
        Thread.sleep(3000);

        String actaulTitle = driver.getTitle();
        String expectedTitle = "youtube";

        if (actaulTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED --> " + actaulTitle);

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "youtube";
        if (actualUrl.contains(arananKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED --> " + actualUrl);

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https:///www.amazon.com");
        Thread.sleep(3000);

        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        //7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String gercekBaslik = driver.getTitle();
        String arananKelimeAmazon = "Amazon";

        if (gercekBaslik.contains(arananKelimeAmazon)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED --> " + gercekBaslik);

        //10. Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualUrlAmazon = driver.getCurrentUrl();
        String expextedUrlAmazon = "https://www.amazon.com";

        if (actualUrlAmazon.equals(expextedUrlAmazon)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED --> " + actualUrlAmazon);

        //11. Sayfayi kapatin
        driver.quit();

    }
}
