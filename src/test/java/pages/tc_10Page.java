package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_10Page {
    private WebDriver driver;

    @FindBy(id = "actionJ")
    private WebElement actionJButton;

    @FindBy(id = "resultJ")
    private WebElement resultJMessage;

    public tc_10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performActionJ() {
        actionJButton.click();
    }

    public boolean isResultJDisplayed() {
        return resultJMessage.isDisplayed();
    }
}