import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WhileSynchronize {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.seleniumeasy.com/");

        driver.findElement(By.xpath("//a[.='Demo Website!']")).click();

        while (true){

            try{

                driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
                break;

            }
            catch(Exception e){

                System.out.println("not found");

            }
        }
    }
}
