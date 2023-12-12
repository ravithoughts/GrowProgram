package frameworkTest.stepdefinitions;

import frameworkTest.testcomponents.BaseTest;
import frameworkpackage.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends BaseTest {
    public LoginPage loginPage;
    private StepData stepData;

    @Given("Enter the required details <username> for login")
    public void enterTheRequiredDetailsUsernameForLogin(String username) {
        loginPage.login(username, stepData.password);
    }

    @When("login into the page")
    public void loginIntoThePage() {
        loginPage.submitLogin();
    }

    @Then("verify login is successful")
    public void verifyLoginIsSuccessful() {
        loginPage.verifyLogin();
        System.out.println(stepData.message);
    }


}