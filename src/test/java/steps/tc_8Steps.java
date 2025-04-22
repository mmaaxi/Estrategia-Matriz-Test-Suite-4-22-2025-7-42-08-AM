package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_8Page;

public class tc_8Steps {
    WebDriver driver;
    tc_8Page page;

    public tc_8Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_8Page.class);
    }

    @Given("the user is on the application page")
    public void the_user_is_on_the_application_page() {
        driver.get("http://url.of.the.application.page");
    }

    @When("the user executes action H")
    public void the_user_executes_action_H() {
        page.performActionH();
    }

    @Then("the user should observe result H")
    public void the_user_should_observe_result_H() {
        page.verifyResultH();
    }
}