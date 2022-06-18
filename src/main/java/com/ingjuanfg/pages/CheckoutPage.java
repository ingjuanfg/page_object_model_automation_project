package com.ingjuanfg.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy(id="first-name")
    WebElementFacade campoNombre;

    @FindBy(id="last-name")
    WebElementFacade campoApellido;

    @FindBy(id="postal-code")
    WebElementFacade campoCodigoPostal;

    @FindBy(id="continue")
    WebElementFacade btnContinuar;

    @FindBy(id="finish")
    WebElementFacade btnFinalizar;

    public void ingresarNombre(String nombre){
        campoNombre.type(nombre);
    }

    public void ingresarApellido(String apellido){
        campoApellido.type(apellido);
    }

    public void ingresarCodigoPostal(String postal){
        campoCodigoPostal.type(postal);
    }

    public void continuarCheckout(){
        btnContinuar.click();
    }

    public void finalizarCheckout(){
        btnFinalizar.click();
    }

}
