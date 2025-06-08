package com.epam.dmytro_hashuk.wikitest;

import com.epam.dmytro_hashuk.driver.WebDriverProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseWikiTest {
    public String wikiUrl = "https://www.wikipedia.org/";
    @Test
    public void checkUkrWiki(){
        WebDriver webDriver = WebDriverProvider.getDriver();
        webDriver.get(wikiUrl);
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));

        WebElement ukrLangElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#js-link-box-uk")));
        ukrLangElement.click();

        WebElement wikiLogo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img.mw-logo-wordmark")));
        String currentAttribute = wikiLogo.getAttribute("alt");
        Assertions.assertEquals("Вікіпедія", currentAttribute);
    }
}
