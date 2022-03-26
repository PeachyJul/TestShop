package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

    public WebDriver driver;
    public ShoppingCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[text()='Sauce Labs Bolt T-Shirt']")
    private WebElement item1;

    @FindBy(xpath = "//*[text()='Sauce Labs Fleece Jacket']")
    private WebElement item2;

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    private WebElement menu;

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    private WebElement logout;

    public String getItem1Name() {
        String Item1Name = item1.getText();
        return Item1Name;
    }

    public String getItem2Name() {
        String item2Name = item2.getText();
        return item2Name;
    }


    public void clickMenu() {
        menu.click();
    }

    public void clickLogout() {
        logout.click();
    }
}
