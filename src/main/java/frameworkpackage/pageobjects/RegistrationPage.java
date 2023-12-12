package frameworkpackage.pageobjects;

import frameworkpackage.abstractcomponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends AbstractComponent {
    WebDriver driver;

    //create constructor
    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //PageFactory
    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//input[@name=\"register\"]")
    WebElement register;

    @FindBy(linkText = "Sign out")
    WebElement signOut;

    public void goToUrl() {
        driver.get("https://practice.automationtesting.in/my-account/");
    }

    public void registration(String emailtxt, String pwd) {
        email.sendKeys(emailtxt);
        password.sendKeys(pwd);
    }

    public void submitRegistration() {
        register.click();
    }

    public void verifyRegistration() {
        signOut.click();
    }
}