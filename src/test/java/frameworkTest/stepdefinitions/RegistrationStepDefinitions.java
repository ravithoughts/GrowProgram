package frameworkTest.stepdefinitions;

import frameworkTest.testcomponents.BaseTest;
import frameworkpackage.pageobjects.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class RegistrationStepDefinitions extends BaseTest {
    public RegistrationPage registrationPage;
    private StepData stepData;

    @Given("Launch registration page")
    public void launch_registration_page() throws IOException {
        registrationPage = launchApplication();
    }

    @Given("Enter the required details <email> for registration")
    public void enterTheRequiredDetailsEmailAndPasswordForRegistration(String email) {
        registrationPage.registration(email, stepData.password);
    }

    @When("submit the registration")
    public void submit_the_registration() {
        registrationPage.submitRegistration();
    }

    @Then("verify Registration is successful")
    public void verifyRegistrationIsSuccessful() {
        registrationPage.verifyRegistration();
        stepData.message = "Welcome to the Page";
        System.out.println(stepData.message);
    }
}