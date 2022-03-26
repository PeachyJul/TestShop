package org.example;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProductsPage productsPage;
    public static ItemPage itemPage;
    public static ShoppingCart shoppingCart;
    public static WebDriver driver;


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.getProperty("loginpage"));
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        itemPage = new ItemPage(driver);
        shoppingCart = new ShoppingCart(driver);

    }

    @Test
    public void loginTest() {
    loginPage.inputLogin(ConfProperties.getProperty("login"));

    loginPage.inputPasswrd(ConfProperties.getProperty("password"));

    loginPage.clickLoginBtn();
    }

    @Test
    public void addToCardTest() {
    productsPage.clickSelectBtn();

    productsPage.clickSelectedFilter();

    productsPage.clickAddToCardBtnShort();

    productsPage.clickFirstItem();

    itemPage.clickAddToCardBtn();

    itemPage.clickBackToProducts();

    productsPage.clickShoppingCart();

    String item1 = shoppingCart.getItem1Name();
    String item2 = shoppingCart.getItem2Name();

    Assert.assertEquals(ConfProperties.getProperty("firstItem"), item1);
    Assert.assertEquals(ConfProperties.getProperty("secondItem"), item2);
    }

    @AfterClass
    public static void tearDown() {
        shoppingCart.clickMenu();
        shoppingCart.clickLogout();
        driver.close();
    }


}
