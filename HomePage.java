import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.findElement(sideBar).isDisplayed();
    }

    public ProductResultPage searchProduct(String searchText){
        driver.findElement(searchInput).click();
        driver.findElement(searchInput).clear();
        driver.findElement(searchInput).sendKeys(searchText);
        driver.findElement(searchButton).click();
        return new ProductResultPage(driver);
    }
}
