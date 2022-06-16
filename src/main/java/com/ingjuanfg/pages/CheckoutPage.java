package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends PageObject {
    WebDriver driver;
    String nombre;
    String apellido;
    String codigoPostal;

    By inputName = By.xpath("//input[@data-test='firstName']");
    By inputLastName = By.xpath("//input[@data-test='lastName']");
    By inputPostalCode = By.xpath("//input[@data-test='postalCode']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarNombre(String usrNombre) {
        nombre=usrNombre;
        driver.findElement(inputName).sendKeys(nombre);
    }

    public void ingresarApellido(String usrApellido) {
        apellido=usrApellido;
        driver.findElement(inputLastName).sendKeys(apellido);
    }

    public void ingresarCodigoPostal(String zipCode) {
        codigoPostal=zipCode;
        driver.findElement(inputPostalCode).sendKeys(codigoPostal);
    }
}
