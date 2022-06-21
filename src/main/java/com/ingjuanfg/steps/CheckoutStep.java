package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CheckoutStepOnePage;
import com.ingjuanfg.pages.CheckoutStepTwoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

public class CheckoutStep {

    @Page
    private CheckoutStepOnePage checkoutStepOnePage;

    @Page
    private CheckoutStepTwoPage checkoutStepTwoPage;

    @Step
    public void completarFormularioCheckout(){
        checkoutStepOnePage.fillFormCheckout("Maria", "Lopez", "050026");
        checkoutStepTwoPage.finishBuy();
    }


}
