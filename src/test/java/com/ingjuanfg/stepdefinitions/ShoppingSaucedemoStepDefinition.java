package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.ProductsPage;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class ShoppingSaucedemoStepDefinition {

    @Page
    private ProductsPage productpage;

    @Managed
    WebDriver driver;

    @Cuando("el usuario agrega el producto al carrito")
    public void elUsuarioAgregaElProductoAlCarrito() {
        productpage.clickButtonAddToCar();
        productpage.clickButtonCar();
    }

    @Cuando("realiza checkout de la compra")
    public void realizaCheckoutDeLaCompra() {
    }

    @Entonces("el deberia realizar una compra exitosa")
    public void elDeberiaRealizarUnaCompraExitosa() {
    }
}
