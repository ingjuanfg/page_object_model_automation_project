package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.CrearCompraPage;
import com.ingjuanfg.pages.FacturaPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.facts.Fact;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

public class CompraSaucedemoStepDefinition {

    @Page
    private CrearCompraPage crearCompra;
    private FacturaPage factura;

    @Dado("que el usuario selecciona el producto que desea comprar")
    public void queElUsuarioSeleccionaElProductoQueDeseaComprar() {
        crearCompra.agregarProducto();
        crearCompra.irAlCarritoDeCompras();
        crearCompra.iniciarCompra();
    }

    @Cuando("ingresa los datos para la factura")
    public void ingresaLosDatosParaLaFactura() {
        factura.ingresarNombreCliente("Karen");
        factura.ingresarApellidoCliente("Zapata");
        factura.ingresarCodigoPostal("055512");
        factura.continuarCompra();

    }

    @Entonces("el usuario deberia realizar la compra correctamente")
    public void elUsuarioDeberiaRealizarLaCompraCorrectamente() {

    }

}
