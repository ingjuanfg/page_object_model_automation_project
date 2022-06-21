package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import com.ingjuanfg.steps.LoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.springframework.core.SpringVersion;

import java.util.Map;

public class LoginSaucedemoStepDefinition {

    @Steps
    LoginStep loginStep;
    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginStep.openNavigator();


    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales(Map<String, String> credenciales) {
        loginStep.authentication(credenciales);

    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {

    }

}
