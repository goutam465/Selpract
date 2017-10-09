import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by glek0001 on 03/09/17.
 */
public class githubtest {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/gmail/about/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[.='Sign In']")).click();

        driver.findElement(By.id("identifierId")).sendKeys("syncsoss002");

        driver.findElement(By.xpath("//span[.='Next']")).click();

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234");

        driver.findElement(By.xpath("//span[.='Next']")).click();

        driver.findElement(By.xpath("//a[.='Starred']")).click();

    }

}
