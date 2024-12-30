package Pages;

import base.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerHomePage extends PageUtils {
    private WebDriver driver;
    public ManagerHomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By welcomeMeaageArea = By.tagName("marquee");

    public String getWelcomeText(){
        return findElement(welcomeMeaageArea).getText();
    }
}
