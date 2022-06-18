package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.LoginPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
<<<<<<< HEAD
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.springframework.core.SpringVersion;

public class LoginSaucedemoStepDefinition {
    @Page
    private LoginPage loginPage;

    @Managed
    WebDriver driver;

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginPage.open();


=======
import org.fluentlenium.core.annotation.Page;

public class LoginSaucedemoStepDefinition {

    @Page
    private LoginPage loginPage;

    @Dado("que el usuario se encuentra en la pagina")
    public void queElUsuarioSeEncuentraEnLaPagina() {
        loginPage.open();
>>>>>>> origin
    }

    @Cuando("el usuario ingrese sus credenciales")
    public void elUsuarioIngreseSusCredenciales() {
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirPassword("secret_sauce");
        loginPage.clickLogin();
<<<<<<< HEAD

=======
>>>>>>> origin
    }

    @Entonces("el usuario deberia ingresar al ecommerce")
    public void elUsuarioDeberiaIngresarAlEcommerce() {
<<<<<<< HEAD

    }

=======
    }
>>>>>>> origin
}
