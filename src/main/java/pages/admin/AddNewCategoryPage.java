package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class AddNewCategoryPage extends BasePage{
    private static final By CATEGORY_NAME_INPUT_FIELD = By.id("input-name1");
    private static final By META_TAG_TITLE_INPUT_FIELD = By.id("input-meta-title1");
    private static final By SAVE_BUTTON = By.xpath("//*[@id='content']//i[@class = 'fa fa-save']");
    private static final By ALERT = By.className("alert-success");

    public static void writeTextInCategoryName(String text){
        writeTextInWebElement(CATEGORY_NAME_INPUT_FIELD, text);
    }

    public static void writeTextInMetaTagTitle(String text){
        writeTextInWebElement(META_TAG_TITLE_INPUT_FIELD, text);
    }

    public static void clickOnSaveButton(){
        clickOnWebElementByLocator(SAVE_BUTTON);
    }

    public static boolean isAlertDisplayed(){
        return isElementDisplayed(ALERT);
    }

    public static String getAlertElementText(){
        return getTextFromAlert(ALERT);
    }
}
