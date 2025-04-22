package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_4Page;

public class tc_4Steps {
    private WebDriver driver;
    private tc_4Page page;

    @Before
    public void setUp() {
        // Setup the WebDriver and initialize the page
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_4Page.class);
    }

    @Given("el usuario ha cargado la página de prueba")
    public void el_usuario_ha_cargado_la_página_de_prueba() {
        page.loadTestPage();
    }

    @When("el usuario ejecuta la acción D")
    public void el_usuario_ejecuta_la_acción_D() {
        page.performActionD();
    }

    @Then("el usuario debería observar el resultado D")
    public void el_usuario_debería_observar_el_resultado_D() {
        assertTrue("El resultado D no se observó correctamente", page.isResultDVisible());
    }
}