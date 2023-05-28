package techproed.day01_ilkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//        // Java uygulamalarında sistem özelliklerini ayarlamak için setProperty() methodu ile kullanırız.
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.techproeducation.com");

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında system özelliiklerini ayarlamak için setProperty() methodu ile kullanırız.
        // setProperty() methodu ile classımıza driver2ın fiziki yolunu belirtiriz.
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "value" a ulaşılabilir.

        WebDriver driver = new ChromeDriver();
        // ChromeDriver türünde yeni bir obje olusturduk
        driver.get("https://www.techproeducation.com");// get() methodu ile String olarak girilen url'ye gideriz







    }
}
