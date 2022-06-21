package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CartCheckoutPage;
import org.fluentlenium.core.annotation.Page;

public class CartCheckoutStep {
    @Page
    private CartCheckoutPage cartCheckout;

    public void clickBotonCheckout(){
        cartCheckout.clickCheckout();
    }
}
