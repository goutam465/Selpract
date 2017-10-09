import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by glek0001 on 07/09/17.
 */
public class DatePicker1 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");

        driver.findElement(By.xpath("//div[@class='input-group date']//span//i")).click();
        driver.findElement(By.xpath("((//table)[1]//tbody//tr//td[.='28'])[1]")).click();

        WebElement sdate = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        sdate.sendKeys("09/09/2017");
        sdate.sendKeys(Keys.ESCAPE);

        WebElement edate = driver.findElement(By.xpath("//input[@placeholder='End date']"));
        edate.click();

        driver.findElement(By.xpath("//div[@class='datepicker-days']//table//td[.='11']")).click();
        edate.sendKeys(Keys.ESCAPE);
    }
}
