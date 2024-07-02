package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class LayoutsPage extends BasePage {
    private static final By ADD_NEW_LAYOUT_BUTTON = By.className("fa-plus");

    public static void clickOnAddNewLayoutButton() {
        clickOnWebElementByLocator(ADD_NEW_LAYOUT_BUTTON);
    }
}
