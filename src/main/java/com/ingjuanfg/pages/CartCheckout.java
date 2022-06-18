package com.ingjuanfg.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/cart.html")
public class CartCheckout extends PageObject {
    WebDriver driver;

    By buttonCheckout = By.id("checkout");

    public CartCheckout(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCheckout(){
        driver.findElement(buttonCheckout).click();
    }
}
