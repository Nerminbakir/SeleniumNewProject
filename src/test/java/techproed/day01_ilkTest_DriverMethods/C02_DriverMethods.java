package techproed.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        // getTitle() methodu : içinde olunan sayfanın baslıgını String olarak getirir.
        System.out.println("Amazon Actual Title : " + driver.getTitle());
        System.out.println("Amazon Actual Url : " + driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title : " + driver.getTitle());

        // getCurrentUrl() methodu : içinde olunan sayfanın url'ini String olarak getirir.
        System.out.println("Techproed Actual Url : " + driver.getCurrentUrl());

        // getPageSource() : içinde olunan sayfanın kaynak kodlarını String olarak getirir.
        //System.out.println(driver.getPageSource()); butun kaynak kodalrını vconsole'da verecegi ve uzun old için yoruma aldık

        // getWindowHandle() : içinde olunan sayfa ve/veya tabların handle degerlerini getirir. Bu handle degerini sayfalar arası gecis için kullanırız
        System.out.println("Techpro Handle Degeri" + driver.getWindowHandle()); //7C022CC45AA9EFA9DE08CBBA8AFA53E5

    }
}
