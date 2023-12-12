package designpatternpackage.factoryclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import static org.openqa.selenium.remote.BrowserType.EDGE;

public class EdgeDriverManager implements Factory {
    @Override
    public WebDriver createDriver() {
        WebDriverManager.getInstance(EDGE).setup();
        return new EdgeDriver();
    }
}