package com.ingjuanfg.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutStepOnePage extends PageObject {

    WebDriver webDriver;

    By inputFirstName = By.id("first-name");
    By inputLastName = By.id("last-name");
    By inputPostalCode = By.id("postal-code");
    By buttonContinue = By.id("continue");



    public CheckoutStepOnePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public void fillFormCheckout(String firstName, String lastName, String postalCode){
        webDriver.findElement(inputFirstName).sendKeys(firstName);
        webDriver.findElement(inputLastName).sendKeys(lastName);
        webDriver.findElement(inputPostalCode).sendKeys(postalCode);
        webDriver.findElement(buttonContinue).click();

    }

}
