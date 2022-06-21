package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CheckoutCompletePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CheckoutCompleteStep {
    private static final String MSG_SUCESS_CHECKOUT = "THANK YOU FOR YOUR ORDER";
    @Page
    CheckoutCompletePage checkoutCompletePage;

    @Step
    public boolean obtenerMensajeCheckout(){
        return checkoutCompletePage.getMessageFinishCheckout().equals(MSG_SUCESS_CHECKOUT);
    }
}
