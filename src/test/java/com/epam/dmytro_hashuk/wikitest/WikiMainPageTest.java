package com.epam.dmytro_hashuk.wikitest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WikiMainPageTest extends BaseTest {

    @Test
    public void openWikiMainPage(){
        driver.get("https://www.wikipedia.org/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#js-link-box-en")));
        Assertions.assertTrue(until.isDisplayed());
    }

}
