package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_11Page;
import static org.junit.Assert.assertTrue;

public class tc_11Steps {
    WebDriver driver;
    tc_11Page page;

    public tc_11Steps() {
        driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_11Page.class);
    }

    @Given("the user is on the relevant page")
    public void the_user_is_on_the_relevant_page() {
        page.navigateToRelevantPage();
    }

    @When("the user executes action K")
    public void the_user_executes_action_K() {
        page.performActionK();
    }

    @Then("the user should observe result K")
    public void the_user_should_observe_result_K() {
        assertTrue(page.isResultKDisplayed());
    }
}