package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;
public class WebPageClick {
    By icon_login = By.id("login2");
    By icon_home = By.xpath("//a[text()='Home ']");
    By click_add_to_cart = By.xpath("//a[@class='btn btn-success btn-lg']");
    By click_cart = By.xpath("//a[@id='cartur']");
    By remove_cart = By.xpath("//a[normalize-space()='Delete']");
    By click_place_order = By.xpath("//button[normalize-space()='Place Order']");
    By click_logout = By.id("logout2");
    By click_purchase = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By getMenu_phones = By.xpath("//a[.='Phones']");
    By getMenu_laptops = By.xpath("//a[.='Laptops']");
    By getMenu_monitors = By.xpath("//a[.='Monitors']");

    By getText_menu(String menu) {
        return By.xpath("//*[contains(text (), '" + menu + "')]");
    }

    By getText_product(String product) {
        return By.xpath("//*[contains(text(), '" + product + "')]");
    }


    public void clickPhonesMenu() {
        driver.findElement(getMenu_phones).click();
    }

    public void clickLaptopsMenu() {
        driver.findElement(getMenu_laptops).click();
    }

    public void clickMonitorsMenu() {
        driver.findElement(getMenu_monitors).click();
    }

    public void assertProduct(String Product) {
        driver.findElement(getText_product(Product)).click();
    }

    public void clickAddToCart() {
        driver.findElement(click_add_to_cart).click();
    }

    public void clickCart() {
        driver.findElement(click_cart).click();
    }

    public void removeCart() {
        driver.findElement(remove_cart).click();
    }

    public void clickPlaceOrder() {
        driver.findElement(click_place_order).click();
    }

    public void clickPurchase() {
        driver.findElement(click_purchase).click();
    }

    public void clickLogoutIcon() {
        driver.findElement(click_logout).click();
    }

    public void SeeIconLogin() {
        driver.findElement(icon_login).isDisplayed();
    }

    public void clickHome() {
        driver.findElement(icon_home).click();
    }
}
