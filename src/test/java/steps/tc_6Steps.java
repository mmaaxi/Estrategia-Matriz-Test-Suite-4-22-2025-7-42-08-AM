package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_6Page;

public class tc_6Steps {
    WebDriver driver = new ChromeDriver();
    tc_6Page page = new tc_6Page(driver);

    @Given("el usuario está en la página inicial")
    public void el_usuario_esta_en_la_pagina_inicial() {
        driver.get("http://example.com");
    }

    @When("el usuario ejecuta la acción F")
    public void el_usuario_ejecuta_la_accion_f() {
        page.performActionF();
    }

    @Then("el usuario debería observar el resultado F")
    public void el_usuario_deberia_observar_el_resultado_f() {
        page.verifyResultF();
        driver.quit();
    }
}