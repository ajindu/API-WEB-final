package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.WebPageClick;

public class WebStepClick {

    WebPageClick wpc = new WebPageClick();

    public WebStepClick(){
        this.wpc = new WebPageClick();
    }

    @And("user click laptops menu")
    public void userClickLaptopsMenu throws InterruptedException(){
        Thread.sleep(10000);
        wpc.clickLaptopsMenu();
    }

    @And("user click product {string}")
    public void userClickProduct(String product) {
        wpc.assertProduct(product);

    }

    @And("user click add to cart")
    public void userClickAddToCart() {
        wpc.clickAddToCart();
    }

    @And("user click cart icon")
    public void userClickCartIcon() {
        wpc.clickCart();
    }

    @And("user click purchase")
    public void userClickPurchase() {
        wpc.clickPurchase();
    }

    @And("user click place order")
    public void userClickPlaceOrder() {
        wpc.clickPlaceOrder();
    }

    @And("user click monitors menu")
    public void userClickMonitorsMenu throws InterruptedException(){
        Thread.sleep(10000);
        wpc.clickMonitorsMenu();
    }

    @And("user click phones menu")
    public void userClickPhonesMenu throws InterruptedException(){
        Thread.sleep(10000);
        wpc.clickPhonesMenu();
    }

    @And("user click delete")
    public void userClickDelete(){
        wpc.removeCart();
    }

    @And("user click log out")
    public void userClickLogOut throws InterruptedException(){
        Thread.sleep(10000);
        wpc.clickLogoutIcon();
    }

    @Then("user will see login icon")
    public void userWillSeeLoginIcon() {
        wpc.SeeIconLogin();
    }

    @And("user click home")
    public void userClickHome() {
        wpc.clickHome();
    }
}
