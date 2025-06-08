package com.epam.dmytro_hashuk.wikitest;

import com.epam.dmytro_hashuk.driver.WebDriverProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public static WebDriver driver;
    @BeforeAll
    public static void setUp(){
        driver = WebDriverProvider.getDriver();
    }

    @AfterAll
    public static void shutDown(){
      WebDriverProvider.quitWebDriver();
    }
}
