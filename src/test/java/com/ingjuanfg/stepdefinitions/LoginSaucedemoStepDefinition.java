package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import com.ingjuanfg.pages.ProductsPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.fluentlenium.core.annotation.Page;

public class LoginSaucedemoStepDefinition {

    @Page
    private LoginPage loginPage;

    @Page
    private ProductsPage productsPage;

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginPage.open();
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
        productsPage.validarLoginExitoso();
    }
}
