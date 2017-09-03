import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by glek0001 on 01/09/17.
 */
public class InputFields {

    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();

        driver .get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");

        driver.findElement(By.id("user-message")).sendKeys("Hi welcome to SELENIUM");

        driver.findElement(By.xpath("//*[@id='get-input']/button")).click();

        String msg = driver.findElement(By.id("display")).getText();

        System.out.println(msg);

        driver.findElement(By.id("sum1")).sendKeys("10");

        driver.findElement(By.id("sum2")).sendKeys("40");

        driver.findElement(By.xpath("//*[@id='gettotal']/button")).click();

        String total = driver.findElement(By.id("displayvalue")).getText();

        System.out.println("Total is :" + total);

        driver.quit();
    }
}
