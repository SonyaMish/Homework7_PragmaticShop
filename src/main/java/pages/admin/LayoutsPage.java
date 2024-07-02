package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class LayoutsPage extends BasePage {
    private static final By ADDNEWLAYOUTBUTTON = By.className("fa-plus");

    public static void clickOnAddNewLayoutButton() {
        clickOnWebElementByLocator(ADDNEWLAYOUTBUTTON);
    }
}
