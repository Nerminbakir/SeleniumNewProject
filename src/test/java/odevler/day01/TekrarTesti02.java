package odevler.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TekrarTesti02 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- C01_TekrarTesti isimli bir class olusturun
        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);

        // 3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        // 4.- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(1000);

        // 5. Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Spend less";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED --> " + actualTitle);

        // 6. Gift Cards sekmesine basin
        WebElement giftCards = driver.findElement(By.xpath("(//*[@class='nav-a  '])[4]"));
        giftCards.click();

        Thread.sleep(1000);

        // 7. Birthday butonuna basin
        WebElement birthday = driver.findElement(By.xpath("//*[@aria-label='Birthday']"));
        //WebElement birthday = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[29]"));
        birthday.click();
        Thread.sleep(1000);

        // 8. Best Seller bolumunden ilk urunu tiklayin
        WebElement ilkUrun = driver.findElement(By.xpath("(//*[@alt='Amazon.com eGift Card'])[1]"));
        //WebElement ilkUrun = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        ilkUrun.click();
        Thread.sleep(1000);

        // 9. Gift card details’den 25 $’i secin
        WebElement seciliFiyat = driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]"));
        seciliFiyat.click();
        Thread.sleep(1000);

        // 10-Urun ucretinin 25$ oldugunu test edin
        WebElement gercekFiyat = driver.findElement(By.xpath("//span[@class='gc-live-preview-amount']"));
        if (gercekFiyat.getText().contains("$25.00")) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");

        // 11-Sayfayi kapatin
        driver.close();
    }
}