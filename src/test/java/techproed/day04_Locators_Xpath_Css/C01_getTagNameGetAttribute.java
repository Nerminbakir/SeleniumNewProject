package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // arama kutusunun tagName'inin "input" oldugunu test edin
        String actuelTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";

        if (actuelTagName.equals(expectedTagName)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAİLED");

        // arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
            /*
            <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
            placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
            tabindex="0" aria-label="Search Amazon" spellcheck="false">
             */

        String actuelAttribute = aramaKutusu.getAttribute("name");
        String expectedAttribute = "field-keywords";

        if (actuelAttribute.equals(expectedAttribute)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAİLED");

        // sayfayı kapatın
        driver.close();


    }
}
