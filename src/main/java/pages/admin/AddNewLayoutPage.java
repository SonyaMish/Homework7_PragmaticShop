package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class AddNewLayoutPage extends BasePage {
    private static final By LAYOUTNAMEINPUTFIELD = By.id("input-name");
    private static final By SAVEBUTTON = By.xpath("//*[@id='content']//i[@class = 'fa fa-save']");
    private static final By ALERT = By.className("alert-success");

    public static void writeTextInLayoutName(String text){
        writeTextInWebElement(LAYOUTNAMEINPUTFIELD, text);
    }

    public static void clickOnSaveButton(){
        clickOnWebElementByLocator(SAVEBUTTON);
    }

    public static boolean isAlertDisplayed(){
        return isElementDisplayed(ALERT);
    }
}
