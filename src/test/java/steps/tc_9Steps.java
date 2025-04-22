package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_9Page;

public class tc_9Steps {
    WebDriver driver;
    tc_9Page page;
    
    @Given("^I am on the application page$")
    public void i_am_on_the_application_page() {
        driver = new ChromeDriver();
        driver.get("http://application-url.com");
        page = new tc_9Page(driver);
    }
    
    @When("^I execute action I$")
    public void i_execute_action_I() {
        page.performActionI();
    }

    @Then("^I should observe result I$")
    public void i_should_observe_result_I() {
        assertTrue(page.isResultIObserved());
        driver.quit();
    }
}