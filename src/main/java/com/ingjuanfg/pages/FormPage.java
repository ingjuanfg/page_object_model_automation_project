package com.ingjuanfg.pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class FormPage extends PageObject {

    WebDriver driver ;

    By inputFirstName = By.id("first-name");
    By inputLastName = By.id("last-name");
    By inputZipCode = By.id("postal-code");
    By buttonContinue= By.xpath("//div[@class='checkout_buttons']/child::input");
    By buttonfinish= By.xpath("//button[@data-test='finish' and @id='finish']");
    By imgFinOrder= By.xpath("//div[@class='complete-text']/following-sibling::img");

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void escribirFirstname(String firstname){
        driver.findElement(inputFirstName).sendKeys(firstname);
    }
    public void escribirLastname(String lastname){
        driver.findElement(inputLastName).sendKeys(lastname);
    }
    public void escribirZipCode(String zipcode){
        driver.findElement(inputZipCode).sendKeys(zipcode);
    }
    public void clickContinue(){
        driver.findElement(buttonContinue).click();
    }
    public void clickFinish(){
        driver.findElement(buttonfinish).click();
    }
    public boolean encontrarImagenCaballo(){
        boolean resultado = (driver.findElement(imgFinOrder).isDisplayed())?true:false;
        return  resultado;
    }
}
