package com.ingjuanfg.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {


    @FindBy(id="user-name")
    WebElementFacade inputUser;

    @FindBy(id="password")
    WebElementFacade inputPass;

    @FindBy(id="login-button")
    WebElementFacade btnLogin;

    public  void digitarUsuario(String usuario){
        inputUser.type(usuario);
    }
    public  void digitarPassword(String password){
        inputPass.type(password);
    }
    public void clickAutenticacion(){
        btnLogin.click();
    }

}
