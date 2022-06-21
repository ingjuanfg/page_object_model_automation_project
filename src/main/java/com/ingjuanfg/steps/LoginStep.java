package com.ingjuanfg.steps;

import com.ingjuanfg.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.Map;

public class LoginStep {
    @Page
    private LoginPage loginPage;

    @Step
    public void openNavigator(){
        loginPage.open();
    }

    @Step
    public void authentication(Map<String, String> credenciales){
        loginPage.escribirUsuario(credenciales.get("usuario"));
        loginPage.escribirPassword(credenciales.get("clave"));
        loginPage.clickLogin();
    }
}
