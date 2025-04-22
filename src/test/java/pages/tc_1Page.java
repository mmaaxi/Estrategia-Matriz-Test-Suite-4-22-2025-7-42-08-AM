package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc1Page {
    WebDriver driver;

    By accionAButton = By.id("accionAButton");
    By resultadoA = By.id("resultadoA");

    public Tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ejecutarAccionA() {
        WebElement button = driver.findElement(accionAButton);
        button.click();
    }

    public boolean resultadoAEsVisible() {
        return driver.findElement(resultadoA).isDisplayed();
    }
}