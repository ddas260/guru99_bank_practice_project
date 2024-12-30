package Pages;

import base.PageUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageUtils {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By usernameField = By.name("uid");
    By passwordField = By.name("password");
    By loginButton = By.name("btnLogin");

    public void login(String username, String password){
        findElement(usernameField).sendKeys(username);
        findElement(passwordField).sendKeys(password);
        findElement(loginButton).click();
    }
}
