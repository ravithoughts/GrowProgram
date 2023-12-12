package frameworkpackage.pageobjects;

import frameworkpackage.abstractcomponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractComponent {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement userName;

    @FindBy(id = "password]")
    WebElement password;

    @FindBy(xpath = "//input[@name=\"login\"]")
    WebElement login;

    @FindBy(linkText = "Sign out")
    WebElement signOut;

    public void goToUrl() {
        driver.get("https://practice.automationtesting.in/my-account/");
    }

    public void login(String username, String pwd) {
        userName.sendKeys(username);
        password.sendKeys(pwd);
    }

    public void submitLogin() {
        login.click();
    }

    public void verifyLogin() {
        signOut.click();
    }
}