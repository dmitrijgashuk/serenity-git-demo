package com.epam.dmytro_hashuk.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverProvider {
    private static ThreadLocal<WebDriver> threadLocalWebDriver = new ThreadLocal<>();
    public static WebDriver getDriver(){
        if(threadLocalWebDriver.get() == null){
            threadLocalWebDriver.set(setupWebDriverUsingSystemProperty());
        }
        return threadLocalWebDriver.get();
    }

    private static WebDriver setupWebDriverUsingSystemProperty() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }

    public static void quitWebDriver(){
        if(threadLocalWebDriver.get() != null){
            threadLocalWebDriver.get().quit();
            threadLocalWebDriver.remove();
        }
    }
}
