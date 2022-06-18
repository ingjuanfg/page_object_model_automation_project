package com.ingjuanfg.steps;

import com.ingjuanfg.pages.ProductsPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductsStep {
    @Page
    private ProductsPage productsPage;

    @Step
    public void agregarProductoCarrito(){
        productsPage.agregaProducto();
    }

    @Step
    public void realizarCheckout(){
        productsPage.abrirCarrito();
        productsPage.hacerCheckout();
    }
}
