package com.ingjuanfg.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class ProductosPage extends PageObject {

    @FindBy(xpath = "//div[contains(.,'Sauce Labs Backpack') and @class='inventory_item_label']/following-sibling::div//button")
    WebElementFacade productoBolso;

    @FindBy(className = "shopping_cart_link")
    WebElementFacade btnCarrito;

    @FindBy(id="checkout")
    WebElementFacade btnCheckout;

    public void agregaProducto(){
        productoBolso.click();
    }
    public void abrirCarrito(){
        btnCarrito.click();
    }

    public void hacerCheckout(){
        btnCheckout.click();
    }
}
