package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
public class ProductsPage extends PageObject {
    WebDriver driver;

    By tituloProductos = By.xpath("//span[contains(.,'Products')]");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginExitoso(){
        assertThat("El texto del titulo es vacio", driver.findElement(tituloProductos).getText().isEmpty());
    }
}
