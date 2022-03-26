package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // локатор поля ввода логина
    @FindBy(xpath = "//*[contains(@id, 'user-name')]")
    private WebElement loginField;

    // локатор кнопки входа
    @FindBy(xpath = "//*[contains(@id, 'login-button')]")
    private WebElement loginBtn;

    // локатор поля ввода пароля
    @FindBy(xpath = "//*[contains(@id, 'password')]")
    private WebElement passwdField;


    // ввод логина
    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void inputPasswrd(String password) {
        passwdField.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
