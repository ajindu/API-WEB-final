package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;
public class WebPageInput {
    By input_name = By.xpath("(//input[@id='name'])[1]");
    By input_country = By.id("country");
    By input_city = By.id("city");
    By input_card = By.id("card");
    By input_month = By.id("month");
    By input_year = By.id("year");

    public void inputName(String name){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.elementToBeClickable(input_name));
       input_name.sendKeys(name);
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
}
