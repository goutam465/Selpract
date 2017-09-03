import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by glek0001 on 01/09/17.
 */
public class CheckBox {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        driver.findElement(By.id("isAgeSelected")).click();

        String text = driver.findElement(By.id("txtAge")).getText();

        System.out.println(text);

        WebElement cb = driver.findElement(By.xpath("(//input)[2]"));

        if(!cb.isSelected()){

            cb.click();


            System.out.println("cb2 now checked");
        }


        //driver.navigate().refresh();

        List<WebElement> cb1 = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));

        System.out.println("there are "+cb1.size()+" Checkboxes");

        for (int i=0;i<cb1.size();i++){

            if(!cb1.get(i).isSelected()){

                cb1.get(i).click();
                System.out.println("Checkbox "+i+ " is selected now");
            }
            else{
                System.out.println("Checkbox "+i+ " is already selected");
            }

        }


    }
}
