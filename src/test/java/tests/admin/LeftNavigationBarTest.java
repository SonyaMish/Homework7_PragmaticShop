package tests.admin;

import compolents.AdminLeftNavigationBar;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.admin.*;
import tests.base.BaseTest;

public class LeftNavigationBarTest extends BaseTest {
    @Test
    public void testCatalog() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin1", "parola123!");
        AdminLeftNavigationBar.clickOnCatalog();
        AdminLeftNavigationBar.clickOnCategories();
        CategoriesPage.clickOnAddNewCategoryButton();
        AddNewCategoryPage.writeTextInCategoryName("SonyaCategory");
        AddNewCategoryPage.writeTextInMetaTagTitle("SonyaTag");
        AddNewCategoryPage.clickOnSaveButton();
        Assert.assertTrue(AddNewCategoryPage.isAlertDisplayed());
    }

    @Test
    public void testExtensions() {
        LoginPage.goToLoginPage();
        LoginPage.login("admin1", "parola123!");
        AdminLeftNavigationBar.clickOnDesign();
        AdminLeftNavigationBar.clickOnLayouts();
        LayoutsPage.clickOnAddNewLayoutButton();
        AddNewLayoutPage.writeTextInLayoutName("Sonya Layout");
        AddNewLayoutPage.clickOnSaveButton();
        Assert.assertTrue(AddNewLayoutPage.isAlertDisplayed());
    }
}