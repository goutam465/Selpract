import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        EventFiringWebDriver e = new EventFiringWebDriver(driver);

        File source = e.getScreenshotAs(OutputType.FILE);
        File Dest = new File("/Users/goutam465/Desktop/auto.png");
        FileUtils.copyFile(source,Dest);


    }
}
