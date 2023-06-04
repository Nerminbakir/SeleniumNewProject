package odevler.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AmazonSearchTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1.Bir class oluşturun : AmazonSearchTest
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        // b.Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        Thread.sleep(3000);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisi = sonucYazilari.get(0);

        System.out.println(sonucYazisi.getText()); // 1-16 of 189 results for "city bike"

        String sonucSayisi [] = sonucYazisi.getText().split(" ");
        System.out.println(sonucSayisi[2]); //189

        // d.Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> sonuclar = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = sonuclar.get(0);
        ilkUrun.click();
        Thread.sleep(3000);

        // Sayfayı kapatalım
        driver.close();

    }
}