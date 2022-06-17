package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class LoginSaucedemoStepDefinition {

    //me permite llamar las clases donde tengo los objetos  e interatuar con ellos
    @Page
    private LoginPage loginPage;

    //Me permite interactuar con el driver
    @Managed
    WebDriver driver;


    @Dado("que un usuario desea ingresar ala pagina")
    public void queUnUsuarioDeseaIngresarAlaPagina() {
        loginPage.open();

    }

    @Cuando("el usuario ingresa las credecenciales correctas")
    public void elUsuarioIngresaLasCredecencialesCorrectas() {
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirPassword("secret_sauce");
        loginPage.clickLogin();

    }

    @Entonces("puede ingresar a la pagina")
    public void puedeIngresarALaPagina() {

    }

}
