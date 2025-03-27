package steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I open the browser and navigate to the login page")
    public void iOpenTheBrowserAndNavigateToTheLoginPage() {
    	 WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");  // Replace with actual login page URL
        loginPage = new LoginPage(driver);
    }

    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("I should see the homepage")
    public void iShouldSeeTheHomepage() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";  // Update URL if needed
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
        driver.quit();
    }
}
