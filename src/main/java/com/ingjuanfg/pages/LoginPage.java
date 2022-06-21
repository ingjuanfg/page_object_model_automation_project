package com.ingjuanfg.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com")
public class LoginPage extends PageObject {

    @FindBy(id="user-name")
    WebElementFacade inputUsuario;
    @FindBy(id="password")
    WebElementFacade inputPassword;
    @FindBy(id="login-button")
    WebElementFacade buttonLogin;

    public void escribirUsuario(String usuario){
        inputUsuario.type(usuario);
    }

    public void escribirPassword(String clave){
       inputPassword.type(clave);
    }

    public void clickLogin(){
        buttonLogin.click();
    }
}
