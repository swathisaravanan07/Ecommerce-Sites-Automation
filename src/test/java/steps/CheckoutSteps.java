package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class CheckoutSteps {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    SearchPage searchPage = new SearchPage(driver);
    CartPage cartPage = new CartPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("User logs in with {string} and {string}")
    public void user_logs_in(String username, String password) {
        loginPage.login(username, password);
    }

    @When("User searches for {string}")
    public void user_searches_for_product(String product) {
        searchPage.searchProduct(product);
    }

    @When("User adds product to cart")
    public void user_adds_product_to_cart() {
        searchPage.addToCart();
    }

    @When("User proceeds to checkout")
    public void user_proceeds_to_checkout() {
        cartPage.goToCheckout();
    }

    @When("User enters shipping details and places the order")
    public void user_enters_shipping_details() {
        checkoutPage.enterDetailsAndSubmit();
    }

    @Then("Order confirmation message should be displayed")
    public void order_confirmation_should_be_displayed() {
        checkoutPage.verifyConfirmation();
        driver.quit();
    }
}
