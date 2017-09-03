import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by glek0001 on 03/09/17.
 */
public class RadioButton {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        driver.findElement(By.xpath("(//input[@value='Male'])[1]")).click();

        System.out.println(driver.findElement(By.xpath("(//input[@value='Female'])[1]")).isSelected());


    }
}

