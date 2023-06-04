package odevler.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class OdevBitmedi {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);

        //iphone aratınız
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone", Keys.ENTER);
        Thread.sleep(1000);

        //çıkan sonuç yazısını konsola yazdırınız
        WebElement sonucYazisi = driver.findElement(By.xpath("((//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucYazisi.getText()); // 1-16 of 20 results for "iphone"

        //Sayfayı kapatalım
        driver.close();

        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız

//        for (int i = 0; i < 5; i++) {
//            sonucYazisi = driver.findElement(By.xpath("((//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
//            System.out.println(sonucYazisi.get(i).getText());
//            sonucYazisi.get(i).click();
//            Thread.sleep(1000);
//            driver.navigate().back();
//            Thread.sleep(1000);
//        }





    }


}
