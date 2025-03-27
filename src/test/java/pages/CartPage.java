package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkoutButton = By.id("checkout");

    public void goToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
