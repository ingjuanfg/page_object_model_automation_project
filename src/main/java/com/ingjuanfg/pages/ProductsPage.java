package com.ingjuanfg.pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Time;

@DefaultUrl("https://www.saucedemo.com/")
public class ProductsPage extends PageObject {

    WebDriver driver ;

    By buttonAddBackpack = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack'  and contains(.,'Add to cart')]");
    By buttonCart= By.xpath("//div[@class='shopping_cart_container']/child::a");
    By buttonCheckout= By.xpath("//button[@name='checkout'  and contains(.,'Checkout')]");
    By ProductsTitle= By.xpath("//div[@class='header_secondary_container']//child::span");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddCartBackPack(){
        driver.findElement(buttonAddBackpack).click();
    }

    public void clickCart(){
        driver.findElement(buttonCart).click();
    }

    public void clickCheckout(){
        driver.findElement(buttonCheckout).click();
    }

    public boolean encontrarTituloProducto(){
        boolean resultado = (driver.findElement(ProductsTitle).isDisplayed())?true:false;
        return  resultado;
    }
}

