package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.fluentlenium.core.annotation.Page;

public class AddToCartSaucedemoStepDefinition {
    @Page
    private AddToCartPage addToCartPage;

    @Page
    private LoginPage loginPage;

    @Page
    private CartCheckout cartCheckout;

    @Page
    private CheckoutStepOnePage checkoutStepOnePage;

    @Page
    private CheckoutStepTwoPage checkoutStepTwoPage;

    @Dado("que el usuario ya esta logueado")
    public void queElUsuarioYaEstaLogueado() {
        loginPage.open();
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Cuando("el usuario agrega producto al carrito")
    public void elUsuarioAgregaProductoAlCarrito() {
        addToCartPage.clickAddToCart();
        addToCartPage.verifyProductAdd();


    }

    @Cuando("realiza el checkout de la compra")
    public void realizaElCheckoutDeLaCompra() throws Exception{
        cartCheckout.clickCheckout();

        checkoutStepOnePage.fillFormCheckout("Maria", "Lopez", "050026");

        checkoutStepTwoPage.finishBuy();

        Thread.sleep(10000);


    }

    @Entonces("el usuario realiza una compra exitosa")
    public void elUsuarioRealizaUnaCompraExitosa()  {


    }

}
