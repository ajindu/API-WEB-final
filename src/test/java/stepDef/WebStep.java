//package stepDef;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import pages.WebPage;
//
//public class WebStep {
//    WebPage webPage = new WebPage();
//
//    public WebStep(){
//        this.webPage = new WebPage();
//    }
//    @Given("open web page")
//    public void openWebPage() {
//        webPage.openBrowser();
//    }
//
//    @And("user click login icon")
//    public void userClickLoginIcon() {
//        webPage.clickIconLogin();
//    }
//
//    @And("user input username {string}")
//    public void userInputUsername(String username) {
//        webPage.inputUsername(username);
//    }
//
//    @And("user input password {string}")
//    public void userInputPassword(String password) {
//        webPage.inputPassword(password);
//    }
//
//    @Then("user click login button")
//    public void userClickLoginButton() {
//        webPage.clickLoginButton();
//    }
//
//    @Then("user will see text welcome")
//    public void userWillSeeTextWelcome() {
//        webPage.assertWelcome();
//    }
//
//    @Then("user will see message {string}")
//    public void userWillSeeMessage(String Msg) {
//        webPage.assertMsg(Msg);
//    }
//
//    @And("user click product {string}")
//    public void userClickProduct(String product) {
//        webPage.assertProduct(product);
//    }
//
//    @And("user click add to cart")
//    public void userClickAddToCart() {
//        webPage.clickAddToCart();
//    }
//
//    @And("user click cart icon")
//    public void userClickCartIcon() {
//        webPage.clickCart();
//    }
//
//    @And("user click delete")
//    public void userClickDelete() {
//        webPage.removeCart();
//    }
//
//    @And("user click place order")
//    public void userClickPlaceOrder() {
//        webPage.clickPlaceOrder();
//    }
//
//    @And("user input name {string}")
//    public void userInputName(String name) {
//        webPage.inputName(name);
//    }
//
//    @And("user input country {string}")
//    public void userInputCountry(String country) {
//        webPage.inputCountry(country);
//    }
//
//    @And("user input city {string}")
//    public void userInputCity(String city) {
//        webPage.inputCity(city);
//    }
//
//    @And("user input card {string}")
//    public void userInputCard(String card) {
//        webPage.inputCard(card);
//    }
//
//    @And("user input month {string}")
//    public void userInputMonth(String month) {
//        webPage.inputMonth(month);
//    }
//
//    @And("user input year {string}")
//    public void userInputYear(String year) {
//        webPage.inputYear(year);
//    }
//
//    @And("user click purchase")
//    public void userClickPurchase() {
//        webPage.clickPurchase();
//    }
//
//    @And("user click icon sign up")
//    public void userClickIconSignUp() {
//        webPage.clickIconSignup();
//    }
//
//    @And("user input sign up username {string}")
//    public void userInputSignUpUsername(String signUsername) {
//        webPage.inputSignUsername(signUsername);
//    }
//
//    @And("user input sign up password {string}")
//    public void userInputSignUpPassword(String signPassword) {
//        webPage.inputSignPassword(signPassword);
//    }
//
//    @And("user click sign up button")
//    public void userClickSignUpButton() {
//        webPage.clickSignupButton();
//    }
//
//    @And("user click log out")
//    public void userClickLogOut() {
//
//    }
//
//    @Then("user will see login icon")
//    public void userWillSeeLoginIcon() {
//    }
//
//    @And("user click phones menu")
//    public void userClickPhonesMenu() throws InterruptedException {
//        Thread.sleep(5000);
//        webPage.clickPhonesMenu();
//    }
//
//    @And("user click laptops menu")
//    public void userClickLaptopsMenu() throws InterruptedException {
//        Thread.sleep(5000);
//        webPage.clickLaptopsMenu();
//    }
//
//    @And("user click monitors menu")
//    public void userClickMonitorsMenu() throws InterruptedException {
//        Thread.sleep(5000);
//        webPage.clickMonitorsMenu();
//    }
//}
