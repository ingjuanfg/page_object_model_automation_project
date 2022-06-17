package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends PageObject {

    WebDriver driver;
    By botonCheckOut = By.xpath("//button[@id='checkout']");
    By inputFirstName = By.xpath("//input[@id='first-name']");
    By inputLastName = By.xpath("//input[@id='last-name']");
    By inputZipCode = By.xpath("//input[@id='postal-code']");
    By botonContinue = By.xpath("//input[@id='continue']");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnCheckOut(){
        driver.findElement(botonCheckOut).click();
    }

    public void escribirFirstName(String firstName){
        driver.findElement(inputFirstName).sendKeys(firstName);
    }

    public void escribirLastName(String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
    }

    public void escribirZipCode(String zipCode){
        driver.findElement(inputZipCode).sendKeys(zipCode);
    }

    public void clickEnContinue(){
        driver.findElement(botonContinue).click();
    }
}
