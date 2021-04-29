import org.openqa.selenium.WebDriver;

public class ProductResultPage extends BasePage {

    public ProductResultPage(WebDriver driver) {
        this.driver = driver;
        driver.findElement(resultsGrid).isEnabled();
    }
    public ProductPage clickFirstProduct(){
        driver.findElements(searchResults).get(0).click();
        return new ProductPage(driver);
    }
    public String getNameProduct(){
        return driver.findElements(searchResults).get(0).getText();
    }
}
