import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        driver.findElement(tabItemMain).isDisplayed();
    }

    public String getTitle() {
        return driver.findElement(productTitle).getText();
    }
}
