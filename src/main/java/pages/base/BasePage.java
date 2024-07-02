package pages.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;
import utils.WaitTool;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    /**
     * This method clicks on WebElement
     * @param locator : The locator of the element which should be clicked on.
     */
    public static void clickOnWebElementByLocator(By locator) {
        driver.findElement(locator).click();
    }

    /**
     * This method writes text in a WebElement
     * @param locator : The locator of the WebElement into which should be written text.
     * @param text : The text that should be written in the WebElement.
     */
    public static void writeTextInWebElement(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public static boolean isElementDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public static String getTextFromAlert(By locator){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String alertText = driver.findElement(locator).getText();

        return alertText;
    }
}
