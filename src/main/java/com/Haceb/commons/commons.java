package com.Haceb.commons;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
public class commons extends PageObject {

    public static String changeWindow(WebDriver driver) {
        // Get window handles
        Set<String> handles = driver.getWindowHandles();
        // window handle
        String  currentWindow = null;
        for (String handle : handles) {
            driver.switchTo().window(handle);
            // active window identifier
            currentWindow = handle;
        }
        // Maximize new window
        driver.manage().window().maximize();
        //Return active window handle
        return currentWindow;
    }

    // The parameters are sent
    public static void selectElementByText(WebDriver driver, By locator, String text) {
        WebElement element = driver.findElement(locator);
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(text);
    }

    // Receive instance
    public static void executeScript(WebDriver driver, String script, By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript(script, element);
    }


    public static void hover(WebDriver driver, By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).perform();
    }
}
