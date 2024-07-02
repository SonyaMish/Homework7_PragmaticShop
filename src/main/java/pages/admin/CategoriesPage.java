package pages.admin;

import org.openqa.selenium.By;
import pages.base.BasePage;

public class CategoriesPage extends BasePage {
    private static final By ADDNEWCATEGORYBUTTON = By.className("fa-plus");

    public static void clickOnAddNewCategoryButton() {
        clickOnWebElementByLocator(ADDNEWCATEGORYBUTTON);
    }
}