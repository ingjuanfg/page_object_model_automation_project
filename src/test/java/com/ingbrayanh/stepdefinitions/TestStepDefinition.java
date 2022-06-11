package com.ingbrayanh.stepdefinitions;

import com.ingbrayanh.pages.LoginPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class TestStepDefinition {
    @Managed
    WebDriver driver;

    @Page
    private LoginPage loginPage;

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginPage.open();
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirContrasena("secret_sauce");
        loginPage.clickLogin();
    }

    @Entonces("el usuario podra ver iniciar sesion")
    public void elUsuarioPodraVerIniciarSesion() {

    }
}
