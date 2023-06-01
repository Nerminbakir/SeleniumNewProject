package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike" + Keys.ENTER);

        // sonuc yazısını yazdırın
        List<WebElement> sonucYazilari = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisi = sonucYazilari.get(0);

        System.out.println(sonucYazisi);
        
        // sonuc sayısını yazdırın


        // ilk ürünün locatini alın


        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        // ilk urune tıklayın
        // sayfayı kapatın



    }
}
