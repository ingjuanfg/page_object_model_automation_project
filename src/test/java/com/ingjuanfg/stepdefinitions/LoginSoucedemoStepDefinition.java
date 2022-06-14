package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.fluentlenium.core.annotation.Page;

public class LoginSoucedemoStepDefinition {

    @Page
    private LoginPage loginPage;

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
    }
}
