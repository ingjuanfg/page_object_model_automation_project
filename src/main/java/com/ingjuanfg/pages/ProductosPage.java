package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductosPage extends PageObject {
    WebDriver driver;

    By tituloProducts = By.xpath("//span[text()='Products']");
    By shoppingCart = By.xpath("//a[@class='shopping_cart_link']");

    public ProductosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void agregarProducto(String producto) {
        driver.findElement(getButtonAddToCartXpath(producto)).click();
    }

    public void irAlCarrito() {
        driver.findElement(shoppingCart).click();
    }

    public boolean validarElTitulo(){
        return driver.findElement(tituloProducts).isDisplayed();
    }

    public void loginExitoso(){
        //Assert.assertThat(driver.findElement(tituloProducts).getText(), Is.is("PRODUCTS"));
        MatcherAssert.assertThat("El texto del título no coincide", driver.findElement(tituloProducts).getText().equals("PRODUCT"));
    }

    private By getButtonAddToCartXpath(String productoAgregar){
        return By.xpath("//div[@class='inventory_item_name' and text()='" + productoAgregar + "']//following::button[@class='btn btn_primary btn_small btn_inventory'][1]");
    }
}
