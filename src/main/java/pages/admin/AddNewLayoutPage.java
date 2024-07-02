package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class AddNewLayoutPage extends BasePage {
    private static final By LAYOUT_NAME_INPUT_FIELD = By.id("input-name");
    private static final By SAVE_BUTTON = By.xpath("//*[@id='content']//i[@class = 'fa fa-save']");
    private static final By ALERT = By.className("alert-success");

    public static void writeTextInLayoutName(String text){
        writeTextInWebElement(LAYOUT_NAME_INPUT_FIELD, text);
    }

    public static void clickOnSaveButton(){
        clickOnWebElementByLocator(SAVE_BUTTON);
    }

    public static boolean isAlertDisplayed(){
        return isElementDisplayed(ALERT);
    }
}
