package odevler.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsXpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        // 2- Add Element butonuna basin
        WebElement addElement = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        addElement.click();
        Thread.sleep(2000);

        // 3. Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));

        if(deleteButonu.isDisplayed()){
            System.out.println("Delete Butonu Görünür");
        }else{
            System.out.println("Delete Butonu Görünür Degil");
        }
        Thread.sleep(2000);

        // 4. Delete tusuna basin
        deleteButonu.click();
        Thread.sleep(2000);

        // 5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//h3"));

        if(addRemoveElement.isDisplayed()){
            System.out.println("Add/Remove Element Yazisi Görünür");
        }else{
            System.out.println("Add/Remove Element Yazisi Görünür Degil");
        }

        Thread.sleep(2000);

        //Sayfayı kapatın
        driver.close();


    }
}
