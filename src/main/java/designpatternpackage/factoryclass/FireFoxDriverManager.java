package designpatternpackage.factoryclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class FireFoxDriverManager implements Factory {
    @Override
    public WebDriver createDriver() {
        WebDriverManager.getInstance(FIREFOX).setup();
        return new FirefoxDriver();
    }
}