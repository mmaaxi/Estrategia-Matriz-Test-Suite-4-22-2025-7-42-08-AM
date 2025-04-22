package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_9Page {
    WebDriver driver;
    
    // Locators
    By actionILocator = By.id("actionIButton");
    By resultILocator = By.id("resultIMessage");

    public tc_9Page(WebDriver driver) {
        this.driver = driver;
    }
    
    // Page Actions
    public void performActionI() {
        driver.findElement(actionILocator).click();
    }
    
    public boolean isResultIObserved() {
        return driver.findElement(resultILocator).isDisplayed();
    }
}