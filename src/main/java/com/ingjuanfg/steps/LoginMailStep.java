package com.ingjuanfg.steps;


import net.thucydides.core.annotations.Step;
import com.ingjuanfg.pages.LoginMailPage;
import org.fluentlenium.core.annotation.Page;

public class LoginMailStep {

    @Page
    private LoginMailPage loginMailPages;

    @Step
    public void abrir_navegador(){
        loginMailPages.open();
    }

    @Step
    public void clickEn(){
        loginMailPages.clickButton();
    }

    @Step
    public void realizar_login(String correo, String pass){
        loginMailPages.ingresarCorreoLogin(correo);
        loginMailPages.siguienteDigitarContrasena();
        loginMailPages.ingresarContrasenaLogin(pass);
        loginMailPages.realizarLogin();
    }

}
