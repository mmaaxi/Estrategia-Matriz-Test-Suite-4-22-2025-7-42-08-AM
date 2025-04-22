package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_3Page {

    private WebDriver driver;
    private By actionCButton = By.id("actionCButton");
    private By resultC = By.id("resultC");

    public tc_3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToActionCPage() {
        driver.get("http://example.com/actionC");
    }

    public void performActionC() {
        WebElement button = driver.findElement(actionCButton);
        button.click();
    }

    public boolean isResultCObserved() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultC)).isDisplayed();
    }
}