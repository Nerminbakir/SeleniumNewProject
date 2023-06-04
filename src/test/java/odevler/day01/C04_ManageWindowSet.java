package odevler.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1.Yeni bir Class olusturalim.C07_ManageWindowSet
        // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu : " + driver.manage().window().getSize());
        Thread.sleep(3000);

        // 4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Point yeniKonum = new Point(100,100);
        Dimension yeniBoyut = new Dimension(800,600);
        driver.manage().window().setPosition(yeniKonum);
        driver.manage().window().setSize(yeniBoyut);
        Thread.sleep(3000);

        // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Point guncelKonum = driver.manage().window().getPosition();
        Dimension guncelBoyut = driver.manage().window().getSize();
        if (guncelKonum.equals(yeniKonum) && guncelBoyut.equals(yeniBoyut)) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");

        // 6. Sayfayi kapatin
        driver.close();

    }
}

