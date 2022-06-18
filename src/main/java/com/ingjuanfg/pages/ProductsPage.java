package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertThat;

public class ProductsPage extends PageObject {

    WebDriver driver;

    By buttonAddToCar = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By buttonCar = By.xpath("//span[@class='shopping_cart_badge']");
    By buttonCheckout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button']");

    By tituloProductos = By.xpath("//span[contains(.,'Products')");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAddToCar(){
        driver.findElement(buttonAddToCar).click();
    }

    public void clickButtonCar(){
        driver.findElement(buttonCar).click();
    }

    public void clickButtonCheckout(){
        driver.findElement(buttonCheckout).click();
    }

    public void loginExitoso(){
        assertThat(driver.findElement(tituloProductos).getText(), is("PRODUCTS"));
    }
}
