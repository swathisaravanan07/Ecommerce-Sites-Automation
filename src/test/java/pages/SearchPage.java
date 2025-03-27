package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.id("search");
    By firstProduct = By.xpath("//div[@class='inventory_item'][1]//button");

    public void searchProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void addToCart() {
        driver.findElement(firstProduct).click();
    }
}

