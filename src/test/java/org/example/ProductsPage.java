package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    public WebDriver driver;
    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    //фильтр
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectBtn;

    //выбор в фильтра
    @FindBy(xpath = "//option[text()='Price (high to low)']")
    private WebElement selectedFilter;

    // первый продукт в списке
    @FindBy(xpath = "//*[@class='inventory_list']/child::div[1]/*[@class='inventory_item_img']")
    private WebElement firstItem;

    // кнопка у третьего итема
    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    private WebElement addToCardBtnShort;

    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    private WebElement shoppingCart;

    public void clickSelectBtn() {
        selectBtn.click();
    }

    public void clickSelectedFilter() {
        selectedFilter.click();
    }

    public void clickAddToCardBtnShort() {
        addToCardBtnShort.click();
    }

    public void clickFirstItem() {
        firstItem.click();
    }

    public void clickShoppingCart() {
        shoppingCart.click();
    }
}

