package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class AddNewCategoryPage extends BasePage{
    private static final By CATEGORYNAMEINPUTFIELD = By.id("input-name1");
    private static final By METATAGTITLEINPUTFIELD = By.id("input-meta-title1");
    private static final By SAVEBUTTON = By.xpath("//*[@id='content']//i[@class = 'fa fa-save']");
    private static final By ALERT = By.className("alert-success");

    public static void writeTextInCategoryName(String text){
        writeTextInWebElement(CATEGORYNAMEINPUTFIELD, text);
    }

    public static void writeTextInMetaTagTitle(String text){
        writeTextInWebElement(METATAGTITLEINPUTFIELD, text);
    }

    public static void clickOnSaveButton(){
        clickOnWebElementByLocator(SAVEBUTTON);
    }

    public static boolean isAlertDisplayed(){
        return isElementDisplayed(ALERT);
    }

    public static String getAlertElementText(){
        return getTextFromAlert(ALERT);
    }
}
