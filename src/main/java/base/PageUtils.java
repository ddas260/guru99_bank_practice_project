package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageUtils {
    private WebDriver driver;
    private WebDriverWait wait;

    public PageUtils(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public List<WebElement> waitForAllElementsVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public WebElement waitForElementVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean waitForElementInvisibility(By locator){
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

}
