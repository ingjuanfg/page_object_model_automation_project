package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CheckoutStepOnePage;
import com.ingjuanfg.pages.CheckoutStepTwoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

import java.util.List;
import java.util.Map;

public class CheckoutStep {

    @Page
    private CheckoutStepOnePage checkoutStepOnePage;

    @Page
    private CheckoutStepTwoPage checkoutStepTwoPage;

    @Step
    public void completarFormularioCheckout(List<Map<String, String>> datosCheckOut){
        checkoutStepOnePage.fillFormCheckout(datosCheckOut.get(0).get("nombre"),
                datosCheckOut.get(0).get("apellido"),
                datosCheckOut.get(0).get("postal"));
        checkoutStepTwoPage.finishBuy();
    }


}
