import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by glek0001 on 31/08/17.
 */
public class GetTitle {

    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");

        String title = driver.getTitle();

        if( title.equals("Google")){
            
            System.out.println("Title is Displayed as Google");
        }
        else{
            System.out.println("Title is Not Displayed as Google");
        }

        String url = driver.getCurrentUrl();

        if(url.contains(".co.in")){
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }

        driver.quit();


    }
}
