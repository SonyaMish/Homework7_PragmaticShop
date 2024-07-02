package compolents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Browser;

public class AdminLeftNavigationBar {
    private static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    private static final By DASHBOARD = By.id("menu-dashboard");
    private static final By CATALOG = By.id("menu-catalog");
    private static final By EXTENSIONS = By.id("menu-extension");
    private static final By DESIGN = By.id("menu-design");
    private static final By SALES = By.id("menu-sale");
    private static final By CUSTOMERS = By.id("menu-customer");
    private static final By MARKETING = By.id("menu-marketing");
    private static final By SYSTEM = By.id("menu-system");
    private static final By REPORTS = By.id("menu-system");
    private static final By CATEGORIES = By.xpath("//*[@id = 'collapse1']/li[1]");
    private static final By LAYOUTS = By.xpath("//*[@id = 'collapse3']/li[1]");

    public static void clickOnCatalog() {
        driver.findElement(CATALOG).click();
    }

    public static void clickOnDesign() {
        driver.findElement(DESIGN).click();
    }

    public static void clickOnCategories() {
        driver.findElement(CATEGORIES).click();
    }

    public static void clickOnLayouts() {
        driver.findElement(LAYOUTS).click();
    }
}