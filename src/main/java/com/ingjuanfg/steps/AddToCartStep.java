package com.ingjuanfg.steps;

import com.ingjuanfg.pages.AddToCartPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AddToCartStep {
    @Page
    private AddToCartPage addToCartPage;

    @Step
    public void agregarProductoCarrito(){
        addToCartPage.clickAddToCart();
    }
    @Step
    public void verificarProductoAgregado(){
        addToCartPage.verifyProductAdd();
    }
}
