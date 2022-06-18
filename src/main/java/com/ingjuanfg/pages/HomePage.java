package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;

public class HomePage extends PageObject {
    WebDriver driver;

    By tituloProductos = By.xpath("//span[contains(.,'Products')]");
    By producto;
    By carrito = By.xpath("//div[@id='shopping_cart_container']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginExitoso(){
        //assertThat(driver.findElement(tituloProductos).getText(), is("PRODUCTS"));
        assertThat("El texto del titulo es vacio",!driver.findElement(tituloProductos).getText().isEmpty());
    }

    public void elegirProducto(String nombre){
        driver.findElement(nombreProducto(nombre)).click();
    }

    public void clickEnCarrito(){
        driver.findElement(carrito).click();
    }

    private By nombreProducto(String nombre){
        return producto = By.xpath("//div[text()='"+nombre+"']/../../following-sibling::div//button");
    }
}
