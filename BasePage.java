import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    String HomePageURL = "https://rozetka.com.ua/";
    String driverName = "webdriver.chrome.driver";
    String driverPath = "browserDrivers/chromedriver.exe";
    String searchText = "popcorn";

    By searchResults = By.cssSelector(".catalog-grid .goods-tile__title");
    By searchInput = By.cssSelector("input.search-form__input");
    By searchButton = By.cssSelector("button.search-form__submit");
    By sideBar = By.cssSelector("main.content_type_main");
    By resultsGrid = By.cssSelector("div.layout_with_sidebar");
    By tabItemMain = By.xpath("//product-tab-main");
    By productTitle = By.cssSelector(".product__title");
}
