package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPage extends PageObject {
    WebDriver driver;

    By buttonCheckout = By.xpath("//button[@data-test='checkout']");

    public CarritoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckout() {
        driver.findElement(buttonCheckout).click();
    }
}
