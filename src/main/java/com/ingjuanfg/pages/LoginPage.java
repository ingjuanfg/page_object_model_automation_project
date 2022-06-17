package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//recibe diferentes URL
@DefaultUrl("https://www.saucedemo.com/")

public class LoginPage extends PageObject {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By inputUsuario = By.id("user-name");
    By inputLogin = By.id("password");
    By buttonLogin = By.id("login-button");



    public  void escribirUsuario(String usuario){
        driver.findElement(inputUsuario).sendKeys(usuario);
    }

    public  void escribirPassword(String password){
        driver.findElement(inputLogin).sendKeys(password);
    }

    public  void clickLogin(){
        driver.findElement(buttonLogin).click();
    }
}
