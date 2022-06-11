package com.ingbrayanh.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    WebDriver driver;
    By inputUsuario = By.id("user-name");
    By inputPassword = By.id("password");
    By buttonLogin = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void escribirUsuario(String usuario){
        driver.findElement(inputUsuario).sendKeys(usuario);
    }

    public void escribirContrasena(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(buttonLogin).click();
    }

}
