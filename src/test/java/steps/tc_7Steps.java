package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_7Page;

public class tc_7Steps {

    WebDriver driver;
    tc_7Page page;

    @Given("el usuario está en la página inicial")
    public void el_usuario_está_en_la_página_inicial() {
        driver = new ChromeDriver();
        driver.get("URL_DE_LA_PAGINA");
        page = new tc_7Page(driver);
    }

    @When("el usuario ejecuta la acción G")
    public void el_usuario_ejecuta_la_accion_g() {
        page.ejecutarAccionG();
    }

    @Then("el usuario debería observar el resultado G")
    public void el_usuario_deberia_observar_el_resultado_g() {
        Assert.assertTrue(page.validarResultadoG());
        driver.quit();
    }
}