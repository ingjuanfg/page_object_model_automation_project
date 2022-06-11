package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class LoginSaucedemoDefinition {

    @Page
    private LoginPage loginPage;

    @Managed
    WebDriver driver;

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

    @Entonces("el usuario podrá ver inicio de sesión exitoso")
    public void elUsuarioPodráVerInicioDeSesiónExitoso() {
    }
}
