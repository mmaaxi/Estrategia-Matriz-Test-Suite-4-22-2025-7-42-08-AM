package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pages.tc_3Page;

public class tc_3Steps {

    tc_3Page actionCPage = new tc_3Page();

    @Given("I am on the Action C page")
    public void i_am_on_the_action_c_page() {
        actionCPage.navigateToActionCPage();
    }

    @When("I perform action C")
    public void i_perform_action_c() {
        actionCPage.performActionC();
    }

    @Then("I should observe result C")
    public void i_should_observe_result_c() {
        assertTrue(actionCPage.isResultCObserved());
    }
}