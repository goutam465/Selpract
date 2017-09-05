import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by glek0001 on 05/09/17.
 */
public class InputValidation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");

        WebElement fN = driver.findElement(By.name("first_name"));

        fN.sendKeys("a");

        WebElement msg1 = driver.findElement(By.xpath("//small[.='Please enter more than 2 characters']"));

        if(msg1.isDisplayed()){

            System.out.println("pass");

        }
        fN.sendKeys("ab");
        //Thread.sleep(3000);

        if(!msg1.isDisplayed()){

            System.out.println("Pass");

        }


    }
}
