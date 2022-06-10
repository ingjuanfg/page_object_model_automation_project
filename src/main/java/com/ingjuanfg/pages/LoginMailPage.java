package com.ingjuanfg.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class LoginMailPage extends PageObject {

    @FindBy(xpath = "//A[@class='login']")
    WebElementFacade InputCorreo;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]")
    WebElementFacade btnCorreo;

    @FindBy(xpath = "//input[@name='password']")
    WebElementFacade InputContrasena;

    @FindBy(xpath = "//div[@id='passwordNext']")
    WebElementFacade btnLogin;

    public void ingresarCorreoLogin(String correo) {
        InputCorreo.type(correo);
    }

    public void clickButton() {
        InputCorreo.click();
    }

    public void siguienteDigitarContrasena() {
        btnCorreo.click();
    }

    public void ingresarContrasenaLogin(String pass) {
        InputContrasena.type(pass);
    }

    public void realizarLogin() {
        btnLogin.click();
    }

}