package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By confirmationMessage = By.xpath("//h2[contains(text(),'THANK YOU')]");

    public void enterDetailsAndSubmit() {
        driver.findElement(firstName).sendKeys("John");
        driver.findElement(lastName).sendKeys("Doe");
        driver.findElement(zipCode).sendKeys("12345");
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
    }

    public void verifyConfirmation() {
        boolean isDisplayed = driver.findElement(confirmationMessage).isDisplayed();
        assert isDisplayed;
    }
}

