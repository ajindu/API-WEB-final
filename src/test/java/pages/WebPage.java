package pages;

import helper.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;

public class WebPage {
    By icon_login = By.id("login2");
    By input_username = By.id("loginusername");
    By input_password = By.id("loginpassword");
    By sign_username = By.id("sign-username");
    By sign_password = By.id("sign-password");
    By click_signup = By.xpath("//a[@id='signin2']");
    By click_signupButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By click_login = By.xpath("//button[normalize-space()='Log in']");
    By click_add_to_cart = By.xpath("//a[@class='btn btn-success btn-lg']");
    By click_cart = By.xpath("//a[@id='cartur']");
    By remove_cart = By.xpath("//a[normalize-space()='Delete']");
    By click_place_order = By.xpath("//button[normalize-space()='Place Order']");
    By input_name = By.id("name");
    By input_country = By.id("country");
    By input_city = By.id("city");
    By input_card = By.id("card");
    By input_month = By.id("month");
    By input_year = By.id("year");
    By click_logout = By.id("logout2");
    By click_purchase = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By getText_welcome(String txtWelcome){
        return By.xpath("//*[contains(text (), '" + txtWelcome + "')]");
    }
    By getText_menu(String menu){
        return By.xpath("//*[contains(text (), '" + menu + "')]");
    }
    By getText_product(String product){
        return By.xpath("//*[contains(text (), '" + product + "')]");
    }

    public void openBrowser(){
        driver.get("https://www.demoblaze.com/");
    }
    public void clickIconLogin(){
        driver.findElement(icon_login).click();
    }
    public void inputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(input_password).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(click_login).click();
    }
    public void assertWelcome(String welcome){
        driver.findElement(getText_welcome(welcome)).isDisplayed();
    }
    public void assertMsg(String message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (alertText.contains(message)) {
            System.out.println(alertText);
        } else {
            System.out.println("Invalid");
        }
        alert.accept();
    }
    public void assertMenu(String Menu){
        driver.findElement(getText_menu(Menu)).click();
    }
    public void assertProduct(String Product){
        driver.findElement(getText_menu(Product)).click();
    }
    public void clickAddToCart(){
        driver.findElement(click_add_to_cart).click();
    }
    public void clickCart(){
        driver.findElement(click_cart).click();
    }
    public void removeCart(){
        driver.findElement(remove_cart).click();
    }
    public void clickPlaceOrder(){
        driver.findElement(click_place_order).click();
    }
    public void inputName(String name){
        driver.findElement(input_name).sendKeys(name);
    }
    public void inputCountry(String country){
        driver.findElement(input_country).sendKeys(country);
    }
    public void inputCity(String city){
        driver.findElement(input_city).sendKeys(city);
    }
    public void inputCard(String card){
        driver.findElement(input_card).sendKeys(card);
    }
    public void inputMonth(String month){
        driver.findElement(input_month).sendKeys(month);
    }
    public void inputYear(String year){
        driver.findElement(input_year).sendKeys(year);
    }
    public void clickPurchase(){
        driver.findElement(click_purchase).click();
    }
    public void clickIconSignup(){
        driver.findElement(click_signup).click();
    }
    public void inputSignUsername(String sgUsername){
        driver.findElement(sign_username).sendKeys(sgUsername);
    }
    public void inputSignPassword(String sgPassword){
        driver.findElement(sign_password).sendKeys(sgPassword);
    }
    public void clickSignupButton(){
        driver.findElement(click_signupButton).click();
    }
    public void clickLogoutIcon(){
        driver.findElement(click_logout).click();
    }
    public void SeeIconLogin(){
        driver.findElement(icon_login).isDisplayed();
    }
}
