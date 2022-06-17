package com.ingjuanfg.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ComprarEnSaucedemoPage extends PageObject {
    WebDriver driver;
    By buttonCheckout = By.id("checkout");
    By link = By.id("shopping_cart_container");



    public ComprarEnSaucedemoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Comprar(String articulo) {
        if (articulo.equalsIgnoreCase("Bolt T-Shirt")) {
            By button = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
            driver.findElement(button).click();
        } else if (articulo.equalsIgnoreCase("Backpack")) {
            By button = By.id("add-to-cart-sauce-labs-backpack");
            driver.findElement(button).click();
        } else if (articulo.equalsIgnoreCase("Onesie")) {
            By button = By.id("add-to-cart-sauce-labs-onesie");
            driver.findElement(button).click();
        } else if (articulo.equalsIgnoreCase("T-Shirt Red")) {
            By button = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
            driver.findElement(button).click();
        }
    }
    public void verEnElCarritoDeCompras() {
            driver.findElement(link).click();
            driver.findElement(buttonCheckout).click();

    }
    By inputNombre = By.id("first-name");
    By inputApellido = By.id("last-name");
    By inputCodigoPostal = By.id("postal-code");
    By inputContinuar = By.id("continue");
    By buttonFinalizar = By.id("finish");

    public void finalizarCompra(String nombre,String apellido,String codigoPostal) {

        driver.findElement(inputNombre).sendKeys(nombre);
        driver.findElement(inputApellido).sendKeys(apellido);
        driver.findElement(inputCodigoPostal).sendKeys(codigoPostal);
        driver.findElement(inputContinuar).click();
        driver.findElement(buttonFinalizar).click();
    }

}

