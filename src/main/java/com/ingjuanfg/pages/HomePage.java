package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {
    WebDriver driver;

    By producto;
    By carrito = By.xpath("//div[@id='shopping_cart_container']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
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
