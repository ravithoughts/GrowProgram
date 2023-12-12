package frameworkTest.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/framework/cucumber",
        glue = "stepdefinitions",
        monochrome = true,
        plugin = {"html:target/cucumber.html"})

public class cucumberTestNGRunner extends AbstractTestNGCucumberTests {

}