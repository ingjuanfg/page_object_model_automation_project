package com.ingbrayanh.stepdefinitions;

import com.ingbrayanh.steps.LoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginSaucedemoStepDefinition {

    @Steps
    LoginStep loginStep;

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginStep.abrirNavegador();
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        //loginStep.realizarAutenticacion("standard_user", "secret_sauce");
    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
       // productsPage.loginExitoso();
    }
}
