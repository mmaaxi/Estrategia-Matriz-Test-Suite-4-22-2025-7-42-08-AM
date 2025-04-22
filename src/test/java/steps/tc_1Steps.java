import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Tc1Page;

public class Tc1Steps {
    WebDriver driver = new ChromeDriver();
    Tc1Page tc1Page = new Tc1Page(driver);

    @Given("que el usuario está en la página inicial")
    public void elUsuarioEstaEnLaPaginaInicial() {
        driver.get("https://www.ejemplo.com");
    }

    @When("el usuario ejecuta la acción A")
    public void elUsuarioEjecutaLaAccionA() {
        tc1Page.ejecutarAccionA();
    }

    @Then("el usuario debería observar el resultado A")
    public void elUsuarioDeberiaObservarElResultadoA() {
        Assert.assertTrue(tc1Page.resultadoAEsVisible());
        driver.quit();
    }
}