import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by glek0001 on 08/09/17.
 */
public class Lifeboat {

    public static void main(String[] args) throws InterruptedException {

        String qa1_url = "https://lifeboat-ebussm-qa-a.synchronoss.net/";
        //String qa2_url = "https://lifeboat-ebussm-qa2.sncrsmp.com/";
        String rc_url  = "https://lifeboat-ebussm-rc-qa.sncrsmp.com/";
        String qa3_url = "https://lifeboat-ebussm-rc-stg.sncrsmp.com/";

        String iosBrowser = "//tr//td[.='orbitbrowser']/../td[.='3.0.50.0']";
        String iosDrive   = "//tr//td[.='orbitdrive']/../td[.='3.0.50.0']";
        String iosMail    = "//tr//td[.='orbitmail']/../td[.='3.0.50.0']";
        String iosSso     = "//tr//td[.='orbitsso']/../td[.='3.0.50.0']";

        String andBrowser = "//tr//td[.='orbitbrowser-android']/../td[.='3.0.50.0']";
        String andDriver = "//tr//td[.='orbitdrive-android']/../td[.='3.0.50.0']";
        String andMail = "//tr//td[.='orbitmail-android']/../td[.='3.0.50.0']";
        String andSso = "//tr//td[.='orbitsso-android']/../td[.='3.0.50.0']";

        String uName = "glek0001";
        String pWord = "Goutam@sncr1234";

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LifeBoatActions lf = new LifeBoatActions();

        lf.Login(driver,qa1_url, uName,pWord);

        driver.findElement(By.xpath("//a[.='Edit Application Instances']")).click();

        lf.Pilot(driver,iosBrowser);
        lf.Pilot(driver,iosDrive);
        lf.Pilot(driver,iosMail);
        lf.Pilot(driver,iosSso);

        lf.Pilot(driver,andBrowser);
        lf.Pilot(driver,andDriver);
        lf.Pilot(driver,andMail);
        lf.Pilot(driver,andSso);

        lf.FlushCache(driver);

        driver.findElement(By.xpath("(//img)[2]")).click();

        driver.findElement(By.xpath("//a[.='Logout']")).click();

        System.out.println("LifeBoat Logged out");

        //driver.quit();

        System.out.println("Browser Closed");

    }

}
