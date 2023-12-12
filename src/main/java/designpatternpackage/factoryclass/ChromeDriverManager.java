package designpatternpackage.factoryclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.remote.BrowserType.CHROME;


public class ChromeDriverManager implements Factory {
    @Override
    public WebDriver createDriver() {
        WebDriverManager.getInstance(CHROME).setup();
        return new ChromeDriver();
    }
}