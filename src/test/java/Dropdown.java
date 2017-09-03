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

        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        WebElement lb = driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select select = new Select(lb);

        select.selectByValue("Sunday");

        Thread.sleep(2000);


    }


}
