package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.FormPage;
import com.ingjuanfg.pages.LoginPage;
import com.ingjuanfg.pages.ProductsPage;
import com.ingjuanfg.steps.LoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.junit.experimental.theories.Theories;
import org.junit.runner.notification.RunListener;

import static java.lang.Thread.*;

public class LoginSoucedemoStepDefinition {

    @Steps
    LoginStep loginStep;

    @Dado("que el usuario se encuentra en la pagina")
    public void que_el_usuario_se_encuentra_en_la_pagina() {

        loginStep.abrirNavegador();
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void el_usuario_ingrese_sus_credenciales() {
        loginStep.realizarAutenticacion("standard_user","secret_sauce");
    }

    @Entonces("el usuario deberia entrar el ecomerce")
    public void el_usuario_deberia_entrar_el_ecomerce() {
       // productsPage.loginExitoso();
    }

    @Cuando("el usuario agrega el producto al carrito")
    public void el_usuario_agrega_el_producto_al_carrito() {

    }

    @Cuando("realiza el checkout de la compra")
    public void realiza_el_checkout_de_la_compra() {

    }

    @Entonces("el deberia realizar una compra exitosa")
    public void el_deberia_realizar_una_compra_exitosa() {

    }


}
