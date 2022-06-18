package com.ingjuanfg.steps;

import com.ingjuanfg.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginStep {

    @Page
    private LoginPage loginPage;

    @Step
    public void abrirNavegador(){
        loginPage.open();
    }

    @Step
    public void loginInSauceLabs(String user, String pass){
        loginPage.typeUser(user);
        loginPage.typePass(pass);
        loginPage.clickToLogin();
    }
}
