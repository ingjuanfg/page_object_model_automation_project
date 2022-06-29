package com.ingjuanfg.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;

public class ComprasPage extends PageObject {

    @FindBy(className = "pony_express")
    WebElementFacade imgCompraExitosa;

    public void imagenCompraExitosa(){
        assertThat("La imagen no esta visible", imgCompraExitosa.waitUntilVisible().isVisible());
    }

}
