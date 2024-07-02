package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class CategoriesPage extends BasePage {
    private static final By ADD_NEW_CATEGORY_BUTTON = By.className("fa-plus");

    public static void clickOnAddNewCategoryButton() {
        clickOnWebElementByLocator(ADD_NEW_CATEGORY_BUTTON);
    }
}