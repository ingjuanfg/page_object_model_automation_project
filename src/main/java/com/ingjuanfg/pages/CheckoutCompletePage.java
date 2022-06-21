package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElementFacade textFinishCheckout;

    public String getMessageFinishCheckout(){
        return textFinishCheckout.getText();
    }
}
