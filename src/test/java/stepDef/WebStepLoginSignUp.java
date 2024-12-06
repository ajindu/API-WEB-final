package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPageLoginSignUp;

public class WebStepLoginSignUp {

    WebPageLoginSignUp wpls = new WebPageLoginSignUp();

    public WebStepLoginSignUp(){
        this.wpls = new WebPageLoginSignUp();
    }
    @Given("open web page")
    public void openWebPage() {
        wpls.openBrowser();
    }

    @And("user click icon sign up")
    public void userClickIconSignUp() {
        wpls.clickIconSignup();
    }

    @And("user input sign up username {string}")
    public void userInputSignUpUsername(String sgUsername) {
        wpls.inputSignUsername(sgUsername);
    }

    @And("user input sign up password {string}")
    public void userInputSignUpPassword(String sgPassword) {
        wpls.inputSignPassword(sgPassword);
    }

    @And("user click sign up button")
    public void userClickSignUpButton() {
        wpls.clickSignupButton();
    }

    @Then("user will see message {string}")
    public void userWillSeeMessage(String msg) {
        wpls.assertMsg(msg);
    }

    @And("user click login icon")
    public void userClickLoginIcon() {
        wpls.clickIconLogin();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        wpls.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        wpls.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        wpls.clickLoginButton();
    }

    @Then("user will see text welcome")
    public void userWillSeeTextWelcome() {
        wpls.assertWelcome();
    }
}
