package com.ingjuanfg.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id="user-name")
    WebElementFacade inpUsuario;

    @FindBy(id="password")
    WebElement inpPass;

    @FindBy(id="login-button")
    WebElement btnLogin;

    public void typeUser(String User){
        inpUsuario.type(User);
    }

    public void typePass(String User){
        inpPass.sendKeys(User);

    }
    public void clickToLogin(){
        btnLogin.click();
    }

}
