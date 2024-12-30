package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverManager;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void launchApp(){
        driver = DriverManager.getDriver("firefox");
        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().window().setSize(new Dimension(1440,900));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void closeApp(){
        driver.quit();
    }
}
