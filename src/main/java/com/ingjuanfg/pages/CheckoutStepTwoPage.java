package com.ingjuanfg.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/checkout-step-two.html")
public class CheckoutStepTwoPage extends PageObject {

    WebDriver webDriver;

    By buttonFinish = By.id("finish");



    public CheckoutStepTwoPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void finishBuy(){

        webDriver.findElement(buttonFinish).click();

    }

}
