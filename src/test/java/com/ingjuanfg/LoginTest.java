package com.ingjuanfg;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void loginEnSaucedemoExitosoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        String tituloProductos;

        WebElement inputUsuario = driver.findElement(By.id("user-name"));
        WebElement inputClave = driver.findElement(By.id("password"));
        WebElement buttonLogin = driver.findElement(By.id("login-button"));

        inputUsuario.sendKeys("standard_user");
        inputClave.sendKeys("secret_sauce");
        buttonLogin.click();

        WebElement labelProducts = driver.findElement(By.xpath("//span[contains(.,'Products')]"));
        tituloProductos = labelProducts.getText();
        Assert.assertEquals("PRODUCTS", tituloProductos); ;
        driver.close();
    }
}
