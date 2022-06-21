package com.ingjuanfg.steps;

import com.ingjuanfg.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginStep {
    @Page
    private LoginPage loginPage;

    @Step
    public void openNavigator(){
        loginPage.open();
    }

    @Step
    public void authentication(String user, String password){
        loginPage.escribirUsuario(user);
        loginPage.escribirPassword(password);
        loginPage.clickLogin();
    }
}
