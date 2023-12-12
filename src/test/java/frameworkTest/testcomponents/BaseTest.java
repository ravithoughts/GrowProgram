package frameworkTest.testcomponents;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import frameworkpackage.pageobjects.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public RegistrationPage registrationPage;

    public WebDriver initializeDriver() throws IOException {
        //get global data from properties file
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\framework\\Resources\\GlobalData.properties");
        prop.load(fis);

        //Using Java ternary operator instead of if else loop
        String browsername = System.getProperty("browser") != null ? System.getProperty("browser") : prop.getProperty("browser");

        if (browsername.contains("chrome")) {
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            if (browsername.contains("headless")) {
                options.addArguments("headless");
            }
            driver = new ChromeDriver(options);
            driver.manage().window().setSize(new Dimension(1440, 900));
        } else if (browsername.equalsIgnoreCase("firefox")) {
            //firefox webdriver setup
        } else if (browsername.equalsIgnoreCase("edge")) {
            //edge webdriver setup
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }




    public RegistrationPage launchApplication() throws IOException {
        driver = initializeDriver();
        registrationPage = new RegistrationPage(driver);
        registrationPage.goToUrl();
        return registrationPage;
    }

    public void teardown() {
        driver.close();
    }
}