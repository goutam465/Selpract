import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by glek0001 on 06/09/17.
 */
public class JqueryDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

        //WebElement sdd = driver.findElement(By.id("country"));

        //Select select = new Select(sdd);

        //select.selectByValue("India");

        driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span//input[@class='select2-search__field'])[2]")).sendKeys("i");

        WebElement sdd = driver.findElement(By.xpath("//span[@class='select2-dropdown select2-dropdown--below']"));

        Select select = new Select(sdd);
        List<WebElement> options = select.getOptions();

        System.out.println(options.get(1));


    }
}
