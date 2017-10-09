import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by glek0001 on 25/09/17.
 */
public class LifeBoatActions {

    public static void Login(WebDriver driver1, String url, String uName , String pWord){

        //Login to Lifeboat

        driver1.get(url);

        driver1.findElement(By.id("userTextField")).sendKeys(uName);

        driver1.findElement(By.id("passwordTextField")).sendKeys(pWord);

        driver1.findElement(By.id("loginButton")).click();

        System.out.println("Logged into LifeBoat");

    }

    public static void Pilot(WebDriver driver2, String xpath) throws InterruptedException {

        //Enable or disable pilot mode

        Thread.sleep(5000);

        /*WebDriverWait wait = new WebDriverWait(driver2,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));*/

        driver2.findElement(By.xpath(xpath)).click();

        driver2.findElement(By.xpath("//div//a//span[.='Edit']")).click();

        driver2.findElement(By.xpath("//tr//label[.='Pilot:']")).click();

        driver2.findElement(By.xpath("(//tr//label[.='Pilot:']/../../../../../../div[2]/div//a)[2]")).click();

        String [] app = xpath.split("'");

        System.out.println(app[1] + "("+app[3] + ") Enabled/Disabled Pilot Mode");

    }

    public static void FlushCache(WebDriver driver3) throws InterruptedException {
        Thread.sleep(3000);

        driver3.findElement(By.xpath("//a[.='Monitor Services']")).click();

        driver3.findElement(By.xpath("//span[.='Cache']/..")).click();

        driver3.findElement(By.xpath("//span[.='Flush ALL caches']/..")).click();

        driver3.findElement(By.xpath("//span[.='Yes']/..")).click();

        driver3.findElement(By.xpath("//span[.='OK']/..")).click();

        System.out.println("Server Cache Flushed");

    }

}
