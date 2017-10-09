import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by glek0001 on 03/09/17.
 */
public class Dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        WebElement lb = driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select select = new Select(lb);

        select.selectByValue("Sunday");

        Thread.sleep(2000);

        select.selectByIndex(2);

        Thread.sleep(2000);

        select.selectByVisibleText("Friday");


        WebElement mlb = driver.findElement(By.id("multi-select"));

        Select select1 = new Select(mlb);

        select1.selectByVisibleText("California");

        Thread.sleep(2000);

        select1.selectByIndex(5);

        Thread.sleep(2000);

        select1.selectByValue("Washington");


    }


}
