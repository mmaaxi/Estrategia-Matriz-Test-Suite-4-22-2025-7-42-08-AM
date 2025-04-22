package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_4Page {
    WebDriver driver;

    @FindBy(id = "actionDButton")
    private WebElement actionDButton;

    @FindBy(id = "resultD")
    private WebElement resultD;

    public tc_4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loadTestPage() {
        driver.get("http://example.com/testpage");
    }

    public void performActionD() {
        actionDButton.click();
    }

    public boolean isResultDVisible() {
        return resultD.isDisplayed();
    }
}