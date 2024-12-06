package stepDef;

import io.cucumber.java.en.And;
import pages.WebPageInput;

public class WebStepInput {
    WebPageInput wpi = new WebPageInput();
    public WebStepInput(){
        this.wpi = new WebPageInput();
    }
    
    @And("user input name {string}")
    public void userInputName(String name) throws InterruptedException {
        Thread.sleep(10000);
        wpi.inputName(name);
    }

    @And("user input country {string}")
    public void userInputCountry(String country) {
        wpi.inputCountry(country);
    }

    @And("user input city {string}")
    public void userInputCity(String city) {
        wpi.inputCity(city);
    }

    @And("user input card {string}")
    public void userInputCard(String card) {
        wpi.inputCard(card);
    }
    @And("user input month {string}")
    public void userInputMonth(String month) {
        wpi.inputMonth(month);
    }
    @And("user input year {string}")
    public void userInputYear(String year) {
        wpi.inputYear(year);
    }
}
