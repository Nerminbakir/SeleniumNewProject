package techproed.day06_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım
        //Webelementleri yazısını console'a yazdıralım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());

        WebElement electricBike = driver.findElement(with(By.tagName("a")).below(hybridBike));
        System.out.println(electricBike.getText());

        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(completeBike.getText());

        System.out.println("***********************");

        //Bikes altındaki tum linkleri(webelement) console'a yazdıralım
        List<WebElement> linlkerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
        /*
        XPATH kullanımında bir sayfadaki webelementlere müdahale etmek istedigimizde xpath ile locate aldıgımızda
        birden fazla sonuc verebilir. [position()>=10 and position()<=16] bu kullanımla aralık belirterek istedigimiz WE'leri secip müdahale edebiliriz.
         */

        // lambda ile yazdırdık
        linlkerListesi.forEach(t-> System.out.println(t.getText()));
        System.out.println("***********************");

        //foreach ile yazdırdık
        for (WebElement w:linlkerListesi) {
            System.out.println(w.getText());
        }

        // Bu linklerin hepsini tıklayalım ve sayfa baslıklarını alalım.

        for (int i = 0; i < linlkerListesi.size(); i++) {
            linlkerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
            System.out.println(linlkerListesi.get(i).getText());
            linlkerListesi.get(i).click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
        }

    }

        // completeBike.click();

}

