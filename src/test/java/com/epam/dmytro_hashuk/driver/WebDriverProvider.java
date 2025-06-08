package com.epam.dmytro_hashuk.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider {
    public static WebDriver getDriver(){
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
