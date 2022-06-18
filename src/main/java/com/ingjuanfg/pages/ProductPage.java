package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProductPage extends PageObject {
    WebDriver driver;

    By botonAdicionarProducto = By.xpath("//button[contains(@id, 'bolt-t-shirt')]");
    By iconoCarritoDeCompras = By.xpath("//div[@id='shopping_cart_container'] /child::a");

    By botonIniciarCompra = By.xpath("//div[@class='cart_footer'] //following-sibling::button");

    By tituloProducto = By.xpath("//span[@class='title']");

    public ProductPage(WebDriver driver) {
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

    public void loginExitoso(){
        //Junit:  assertThat(driver.findElement(tituloProducto).getText(), is("PRODUCTS"));
        assertThat("El ltexto del título está vacío", !driver.findElement(tituloProducto).getText().isEmpty());
    }
}
