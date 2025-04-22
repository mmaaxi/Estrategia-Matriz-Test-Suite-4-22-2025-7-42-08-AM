import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class tc_2Page {
    WebDriver driver;

    // Define web elements
    @FindBy(how = How.ID, using = "actionBButton")
    private WebElement actionBButton;

    @FindBy(how = How.ID, using = "resultBMessage")
    private WebElement resultBMessage;

    public tc_2Page(WebDriver driver) {
        this.driver = driver;
    }

    // Action method to perform action B
    public void performActionB() {
        actionBButton.click();
    }

    // Method to validate if result B is visible
    public boolean isResultBVisible() {
        return resultBMessage.isDisplayed();
    }
}