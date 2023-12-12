package com.epam.growprogram.designpatternTest;

import designpatternpackage.factoryclass.DriverManager;

import org.openqa.selenium.WebDriver;

public class HomeTask2FactoryPattern {
    protected WebDriver driver;
    public void invokeBrowser() {
        String browserToUse = "chrome";
        driver = new DriverManager().createInstance(browserToUse);
        driver.get("www.google.com");
        driver.quit();
    }
}