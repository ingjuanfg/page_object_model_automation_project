package com.ingbrayanh.steps;

import com.ingbrayanh.pages.ProductsPage;
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
