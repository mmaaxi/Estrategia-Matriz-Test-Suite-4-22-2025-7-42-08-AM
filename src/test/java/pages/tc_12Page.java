package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_12Page {
    WebDriver driver;

    By actionLButton = By.id("ACTION_L_BUTTON_ID");
    By resultLElement = By.id("RESULT_L_ELEMENT_ID");

    public tc_12Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performActionL() {
        driver.findElement(actionLButton).click();
    }

    public boolean isResultLObserved() {
        return driver.findElement(resultLElement).isDisplayed();
    }
}