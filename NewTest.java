import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class NewTest extends BasePage {

    @BeforeSuite
    public void setProps() {
        System.setProperty( driverName, driverPath);
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HomePageURL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void searchProduct() {
        HomePage homePage = new HomePage(driver);
        ProductResultPage productResultPage = homePage.searchProduct(searchText);
        String ExpectedTitle = productResultPage.getNameProduct();
        ProductPage productPage = productResultPage.clickFirstProduct();
        String ActualTitle = productPage.getTitle();
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println("Product Title is: " + ActualTitle);
    }

    @AfterMethod(alwaysRun = true)
    public void quitBrowser() {
        driver.quit();
    }
}

