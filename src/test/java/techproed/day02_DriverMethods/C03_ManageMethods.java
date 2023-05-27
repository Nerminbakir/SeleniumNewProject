package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Browser'in konumunu yazdıralım
        System.out.println("Sayfanın konumu " + driver.manage().window().getPosition());

        // Browser'in boyutlarını yazdıralım
        System.out.println("Sayfanın boyutu " + driver.manage().window().getSize());

        // Browser'in maximize yapalım
        driver.manage().window().maximize();

        /*
        Bir web sitesine gittiğinizde browser default olarak bir boyutta gelir ve acılan browser'daki
        web elementlere browsermaximize olmadıgı için ulaşamayabiliriz. Dolayısıyla browser'ı actıktan sonra
        maximize yaparsak driver butun web elementleri görür ve rahatlıkla mudahale edebilir. Bu yuzden
        browser'ı actıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim web elementlere
        ulasmada işimizi kolaylastırır. Boylelikle fail almamıs oluruz.
         */

        // Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        // Browser'in konumunu yazdıralım
        System.out.println("Sayfanın konumu " + driver.manage().window().getPosition());

        // Browser'in boyutlarını yazdıralım
        System.out.println("Sayfanın boyutu " + driver.manage().window().getSize());
        Thread.sleep(3000);

        // Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        // Sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50, 50)); //istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600, 600)); //istediğimiz boyuta getirir
        Thread.sleep(3000);

        //Sayfayı kapatalım
        driver.close();



    }


}
