package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.CheckOutPage;
import com.ingjuanfg.pages.HomePage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.fluentlenium.core.annotation.Page;

public class ComprarProductoStepDefinition {

    @Page
    HomePage homePage;
    @Page
    CheckOutPage checkOut;

    @Dado("que el usuario agrega al carrito el producto (.*)")
    public void queElUsuarioAgregaAlCarritoElProducto(String nombre) {
        homePage.elegirProducto(nombre);
        homePage.clickEnCarrito();
        checkOut.clickEnCheckOut();
    }

    @Cuando("el usuario realice la compra")
    public void elUsuarioRealiceLaCompra() {
        checkOut.escribirFirstName("Brahian");
        checkOut.escribirLastName("Restrepo");
        checkOut.escribirZipCode("050006");
        checkOut.clickEnContinue();
    }

    @Entonces("el usuario deberia ver la compra exitosa")
    public void elUsuarioDeberiaVerLaCompraExitosa() {
    }

}
