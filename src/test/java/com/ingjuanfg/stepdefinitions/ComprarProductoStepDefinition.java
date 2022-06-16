package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.CarritoPage;
import com.ingjuanfg.pages.CheckoutPage;
import com.ingjuanfg.pages.LoginPage;
import com.ingjuanfg.pages.ProductosPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;
import org.fluentlenium.core.annotation.Page;

public class ComprarProductoStepDefinition {

    @Page
    private LoginPage loginPage;
    private ProductosPage productosPage;
    private CarritoPage carritoPage;
    private CheckoutPage checkoutPage;

    @Dado("^que el usuario se encuentra logueado en la pagina$")
    public void queElUsuarioSeEncuentraLogueadoEnLaPagina() {
        loginPage.open();
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Cuando("^el usuario agrega un (.*) al carrito$")
    public void elUsuarioAgregaUnProductoAlCarrito(String producto) {
        productosPage.agregarProducto(producto);
        productosPage.irAlCarrito();
        carritoPage.clickCheckout();
    }

    @Y("^realiza el checkout con su (.*), su (.*) y su (.*)$")
    public void realizaElCheckout(String nombre, String apellido, String codigoPostal) {
        checkoutPage.ingresarNombre(nombre);
        checkoutPage.ingresarApellido(apellido);
        checkoutPage.ingresarCodigoPostal(codigoPostal);
    }

}
