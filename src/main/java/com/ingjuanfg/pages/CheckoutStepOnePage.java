package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/checkout-step-one.html")
public class CheckoutStepOnePage extends PageObject {


    @FindBy(id="first-name")
    WebElementFacade inputFirstName;
    @FindBy(id="last-name")
    WebElementFacade inputLastName;
    @FindBy(id="postal-code")
    WebElementFacade inputPostalCode;
    @FindBy(id="continue")
    WebElementFacade buttonContinue;


    public void fillFormCheckout(String firstName, String lastName, String postalCode){
        inputFirstName.type(firstName);
        inputLastName.type(lastName);
        inputPostalCode.sendKeys(postalCode);
        buttonContinue.click();
    }

}
