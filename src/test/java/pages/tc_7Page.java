package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_7Page {

    WebDriver driver;
    
    private By elementoG = By.id("id_del_elemento_g");

    public tc_7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ejecutarAccionG() {
        driver.findElement(elementoG).click();
    }

    public boolean validarResultadoG() {
        // Implementación de validación del resultado G
        return driver.findElement(elementoG).isDisplayed();
    }
}