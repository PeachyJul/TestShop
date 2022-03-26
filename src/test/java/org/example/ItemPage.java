package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    public WebDriver driver;
    public ItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory']")
    private WebElement addToCardBtn;

    @FindBy(xpath = "//*[@id='back-to-products']")
    private WebElement backToProducts;

    public void clickAddToCardBtn() {
        addToCardBtn.click();
    }

    public void clickBackToProducts() {
        backToProducts.click();
    }
}

