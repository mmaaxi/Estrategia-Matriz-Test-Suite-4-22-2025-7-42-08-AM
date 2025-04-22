import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class tc_2Steps {
    private WebDriver driver;
    private tc_2Page page;

    public tc_2Steps() {
        // Assuming driver is initialized elsewhere
        this.page = PageFactory.initElements(driver, tc_2Page.class);
    }

    @Given("I am on the application")
    public void i_am_on_the_application() {
        // Implement navigation to the application home page
        driver.get("http://example.com");
    }

    @When("I execute action B")
    public void i_execute_action_B() {
        page.performActionB();
    }

    @Then("I should observe result B")
    public void i_should_observe_result_B() {
        assertTrue(page.isResultBVisible());
    }
}