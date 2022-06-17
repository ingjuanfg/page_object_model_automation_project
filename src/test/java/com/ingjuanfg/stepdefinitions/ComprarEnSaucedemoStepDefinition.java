package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.ComprarEnSaucedemoPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.fluentlenium.core.annotation.Page;

public class ComprarEnSaucedemoStepDefinition {

    @Page
    private ComprarEnSaucedemoPage comprarEnSaucedemoPage;


    @Cuando("el usuario desea comprar un (.*)")
    public void elUsuarioDeseaComprarUn(String articulo) {
            comprarEnSaucedemoPage.Comprar(articulo);


    }

    @Entonces("el usuario puede ver su articulo en el carrito de compras")
    public void elusuarioPuedeVerSuArticuloEnElCarritoDeCompras() {
        comprarEnSaucedemoPage.verEnElCarritoDeCompras();

    }

    @Y("el usuario ingresa sus datos para finalizar la compra")
    public void elUsuarioIngresaSusDatosParaFinalizarLaCompra() {
        comprarEnSaucedemoPage.finalizarCompra("aide","moros","987");

    }


}
