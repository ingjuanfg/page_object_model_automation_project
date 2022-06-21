package com.ingjuanfg.pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class AddToCartPage extends PageObject {
    WebDriver driver;

    By buttonAddToCart = By.id("add-to-cart-sauce-labs-backpack");
    By verifyProductAddCart = By.id("shopping_cart_container");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart(){
        driver.findElement(buttonAddToCart).click();
    }

    public void verifyProductAdd(){ driver.findElement(verifyProductAddCart).click();

    }
// xpath(//div[contains(.,'Sauce Labs Backpack') and @class='inventory_item_label']/following-sibling::div//button)

}
