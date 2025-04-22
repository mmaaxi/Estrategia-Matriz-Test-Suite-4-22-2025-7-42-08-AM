package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_12Page;
import static org.junit.Assert.*;

public class tc_12Steps {
    WebDriver driver;
    tc_12Page page;

    @Given("I am on the relevant page")
    public void i_am_on_the_relevant_page() {
        driver = new ChromeDriver();
        page = new tc_12Page(driver);
        driver.get("URL_OF_THE_PAGE");
    }

    @When("I execute action L")
    public void i_execute_action_l() {
        page.performActionL();
    }

    @Then("I should observe result L")
    public void i_should_observe_result_l() {
        assertTrue(page.isResultLObserved());
        driver.quit();
    }
}