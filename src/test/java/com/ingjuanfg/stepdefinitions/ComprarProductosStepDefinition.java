package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.steps.CheckoutStep;
import com.ingjuanfg.steps.ComprasStep;
import com.ingjuanfg.steps.LoginStep;
import com.ingjuanfg.steps.ProductosStep;
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
    ProductosStep productosStep;

    @Steps
    CheckoutStep checkoutStep;

    @Steps
    ComprasStep comprasStep;

    @Dado("que el usuario se autentica en la pagina de Saucelabs")
    public void queElUsuarioSeAutenticaEnLaPaginaDeSaucelabs(Map<String, String> credenciales) {
        loginStep.abrirNavegador();
        loginStep.realizarAutenticacion(credenciales);
    }

    @Cuando("el usuario agrega al carrito el producto Sauce Labs Backpack")
    public void elUsuarioAgregaAlCarritoElProductoSauceLabsBackpack() {
        productosStep.agregarProductoCarrito();
    }

    @Y("realiza el checkout")
    public void realizaElCheckout(List<Map<String,String>> datosUsuario) {
        productosStep.realizarCheckout();
        checkoutStep.diligenciarCheckout(datosUsuario);
    }

    @Cuando("confirma la compra")
    public void confirmaLaCompra() {
        checkoutStep.finalizarCheckoutCompra();
    }

    @Entonces("el usuario deberia de ver que su compra es exitosa")
    public void elUsuarioDeberiaDeVerQueSuCompraEsExitosa() {
        comprasStep.compraRealizadaConExito();
    }
}
