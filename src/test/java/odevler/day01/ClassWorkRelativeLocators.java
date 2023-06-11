package odevler.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ClassWorkRelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2.) Berlin’i 3 farkli relative locator ile locate edin
        //3.) Relative locator’larin dogru calistigini test edin
        WebElement boston = driver.findElement(By.xpath("//li[@id='boston']"));
        WebElement berlin = driver.findElement(with(By.tagName("li")).toRightOf(boston));
        System.out.println(berlin.getText());

        WebElement nyc = driver.findElement(By.xpath("//li[@id='nyc']"));
        WebElement berlin1 = driver.findElement(with(By.tagName("li")).below(nyc));
        System.out.println(berlin1.getText());

        WebElement bayArea = driver.findElement(By.xpath("//li[@id='bay-area']"));
        WebElement berlin3 = driver.findElement(with(By.tagName("li")).toLeftOf(bayArea));
        System.out.println(berlin3.getText());

        //4.) Sayfayı kapatın
        driver.close();







    }
}
