package com.ingjuanfg.steps;

import com.ingjuanfg.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import javax.swing.*;

public class LoginStep {

    @Page
    private LoginPage loginPage;

    @Step
    public void abrirNavegador(){
        loginPage.open();
    }

    @Step
    public void realizarAutenticacion(String usuario, String clave){
        loginPage.digitarUsuario(usuario);
        loginPage.digitarPassword(clave);
        loginPage.clickAutenticacion();
    }

}
