package odevler.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ManageWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1.Yeni bir Class olusturalim.C06_ManageWindow
        // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https:///www.amazon.com");

        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu " + driver.manage().window().getSize());
        Thread.sleep(3000);

        // 4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);

        // 5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın konumu " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu " + driver.manage().window().getSize());
        Thread.sleep(3000);

        // 7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        // 8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın konumu " + driver.manage().window().getPosition()); //Sayfanın konumu (0, 0)
        System.out.println("Sayfanın boyutu " + driver.manage().window().getSize()); //Sayfanın boyutu (1536, 864)
        Thread.sleep(3000);

        // 9. Sayfayi kapatin
        driver.close();


    }

}
