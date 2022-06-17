package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrearCompraPage extends PageObject {
    WebDriver driver;

    By botonAdicionarProducto = By.xpath("//button[contains(@id, 'bolt-t-shirt')]");
    By iconoCarritoDeCompras = By.xpath("//div[@id='shopping_cart_container'] /child::a");

    By botonIniciarCompra = By.xpath("//div[@class='cart_footer'] //following-sibling::button");

    public CrearCompraPage(WebDriver driver) {
        this.driver = driver;
    }

    public void agregarProducto(){
        driver.findElement(botonAdicionarProducto).click();
    }

    public void irAlCarritoDeCompras(){
        driver.findElement(iconoCarritoDeCompras).click();
    }

    public void iniciarCompra(){
        driver.findElement(botonIniciarCompra).click();
    }
}
