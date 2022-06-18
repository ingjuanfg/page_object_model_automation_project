package com.ingbrayanh.stepdefinitions;

import com.ingbrayanh.steps.CheckoutStep;
import com.ingbrayanh.steps.LoginStep;
import com.ingbrayanh.steps.ProductsStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class ComprarProductosStepDefinition {

    @Steps
    LoginStep loginStep;

    @Steps
    ProductsStep productsStep;

    @Steps
    CheckoutStep checkoutStep;

    @Dado("que el usuario se autentica en la pagina de Saucelabs")
    public void queElUsuarioSeAutenticaEnLaPaginaDeSaucelabs(Map<String, String> credenciales) {
        loginStep.abrirNavegador();
        loginStep.realizarAutenticacion(credenciales);
    }

    @Cuando("el usuario agrega al carrito el producto Sauce Labs Backpack")
    public void elUsuarioAgregaAlCarritoElProductoSauceLabsBackpack() {
        productsStep.agregarProductoCarrito();
    }

    @Y("realiza el checkout")
    public void realizaElCheckout(List<Map<String,String>> datosUsuario) {
        productsStep.realizarCheckout();
        checkoutStep.diligenciarCheckout(datosUsuario);
    }

    @Cuando("confirma la compra")
    public void confirmaLaCompra() {
        checkoutStep.finalizarCheckoutCompra();
    }

    @Entonces("el usuario deberia de ver que su compra es exitosa")
    public void elUsuarioDeberiaDeVerQueSuCompraEsExitosa() {
    }
}
