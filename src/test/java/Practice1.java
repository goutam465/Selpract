import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Practice1 {
    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://way2automation.com/way2auto_jquery/index.php");

        Thread.sleep(5000);

        driver.findElement(By.xpath(".//*[@id='load_form']/div/div[1]/p/a")).click();


    }
}
