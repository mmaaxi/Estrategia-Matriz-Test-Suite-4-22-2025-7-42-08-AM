package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_5Page;
import static org.junit.Assert.assertTrue;

public class tc_5Steps {
    WebDriver driver;
    tc_5Page page;

    public tc_5Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_5Page.class);
    }

    @When("I execute action E")
    public void executeActionE() {
        page.performActionE();
    }

    @Then("I should observe result E")
    public void shouldObserveResultE() {
        assertTrue("Result E was not observed", page.isResultEObserved());
    }
}