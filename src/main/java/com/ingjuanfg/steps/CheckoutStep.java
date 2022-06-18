package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.List;
import java.util.Map;

public class CheckoutStep {

    @Page
    CheckoutPage checkoutPage;

    @Step
    public void diligenciarCheckout(List<Map<String,String>> datosUsuario){
        checkoutPage.ingresarNombre(datosUsuario.get(0).get("nombre"));
        checkoutPage.ingresarApellido(datosUsuario.get(0).get("apellido"));
        checkoutPage.ingresarCodigoPostal(datosUsuario.get(0).get("postal"));
        checkoutPage.continuarCheckout();
    }

    @Step
    public void finalizarCheckoutCompra(){
        checkoutPage.finalizarCheckout();
    }
}