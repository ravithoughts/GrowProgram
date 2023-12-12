package designpatternpackage.factoryclass;

import org.openqa.selenium.WebDriver;



public class DriverManager {
    public WebDriver createInstance(String browser) {
        WebDriver driver;
        BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());
        switch (browserType) {
            case CHROME:
                driver = new ChromeDriverManager().createDriver();
                break;
            case FIREFOX:
                driver = new FireFoxDriverManager().createDriver();
                break;
            case EDGE:
                driver = new EdgeDriverManager().createDriver();
                break;
            default:
               System.out.println("Invlid Browser");
               driver=null;
        }
        return driver;
    }
}