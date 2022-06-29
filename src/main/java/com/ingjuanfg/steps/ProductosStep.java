package com.ingjuanfg.steps;

import com.ingjuanfg.pages.ProductosPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductosStep {
    @Page
    private ProductosPage productosPage;

    @Step
    public void agregarProductoCarrito(){
        productosPage.agregaProducto();
    }

    @Step
    public void realizarCheckout(){
        productosPage.abrirCarrito();
        productosPage.hacerCheckout();
    }
}
