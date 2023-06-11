package techproed.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Odev {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna 100 defa basınız
        // 100 defa basıldığını test ediniz
        int counterEnter = 0;
        for (int i = 0; i < 100; i++) {
        WebElement addElement = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();
        counterEnter++;
        }
        System.out.println("counterEnter = " + counterEnter);

        // 90 defa delete butonuna basınız
        // 90 defa basıldığını doğrulayınız

        int counterDelete = 0;
        for (int i = 0; i < 90; i++) {
            WebElement delete = driver.findElement(By.xpath("//*[@id='elements']"));
            delete.click();
            counterDelete++;
        }
        System.out.println("counterDelete = " + counterDelete);

        // Sayfayı kapatınız
        driver.close();


   }

}







