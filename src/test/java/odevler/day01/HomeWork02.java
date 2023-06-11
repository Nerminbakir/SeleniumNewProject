package odevler.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);

        //Çıkan reklamı locate edip kapatalım
        WebElement reklam = driver.findElement(By.xpath("//*[@class='eicon-close']"));
        reklam.click();

        //Arama bölümünde qa aratalım
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("qa", Keys.ENTER);

        //Sayfa başlığının qa içerdiğini doğrulayalım
        String actualTitle = driver.getTitle();
        String expectedTitle = "qa";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement career = driver.findElement(By.xpath("//h3[1]"));
        career.isDisplayed();
        career.isEnabled();

        //Carrer Opportunities In QA linkine tıklayalım
        career.click();

        //Başlığın Opportunities içerdiğini test edelim
        String gercekBaslik = driver.getTitle();
        String beklenenBaslik = "Opportunities";

        if (gercekBaslik.contains(beklenenBaslik)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://techproeducation.com";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        //Sayfayı kapatalım
        driver.close();

    }
}