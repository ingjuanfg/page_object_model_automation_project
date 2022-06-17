package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacturaPage extends PageObject {

    WebDriver driver;

    By nombreCliente = By.xpath("//input[@id='first-name' and @name='firstName']");
    By apellidoCliente = By.xpath("//input[@id='last-name']");
    By codigoPostal = By.xpath("//input[contains(@id, 'postal')]");
    By botonContinuar = By.xpath("//div[@class = 'checkout_buttons']/child::input");

    public FacturaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarNombreCliente(String nombre){
        driver.findElement(nombreCliente).sendKeys(nombre);
    }

    public void ingresarApellidoCliente(String apellido){
        driver.findElement(apellidoCliente).sendKeys(apellido);
    }

    public void ingresarCodigoPostal(String codigo){
        driver.findElement(codigoPostal).sendKeys(codigo);
    }

    public void continuarCompra(){
        driver.findElement(botonContinuar).click();
    }

}
