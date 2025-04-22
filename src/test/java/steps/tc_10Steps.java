package steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_10Page;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class tc_10Steps {
    private WebDriver driver;
    private tc_10Page page;

    public tc_10Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_10Page.class);
    }

    @When("I execute action J")
    public void i_execute_action_J() {
        page.performActionJ();
    }

    @Then("I should observe result J")
    public void i_should_observe_result_J() {
        assertTrue(page.isResultJDisplayed(), "Result J is not displayed as expected");
    }
}