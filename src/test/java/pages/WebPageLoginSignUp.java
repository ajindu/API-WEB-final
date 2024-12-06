package pages;
import helper.Utility;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;

public class WebPageLoginSignUp {
    By icon_login = By.id("login2");
    By input_username = By.id("loginusername");
    By input_password = By.id("loginpassword");
    By sign_username = By.id("sign-username");
    By sign_password = By.id("sign-password");
    By click_signup = By.xpath("//a[@id='signin2']");
    By click_signupButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By click_login = By.xpath("//button[normalize-space()='Log in']");
    By getText_welcome = By.id("nameofuser");

    public void assertMsg(String message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
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
    public void assertWelcome(){
        driver.findElement(getText_welcome).isDisplayed();
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


}
