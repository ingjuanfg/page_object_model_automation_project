package com.ingjuanfg.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;

public class MailViewPages extends PageObject {

    @FindBy(xpath="//div[@class='nM']//div[@role='button']")
    WebElementFacade btnRedactar;

    @FindBy(xpath="//textarea[@name='to']")
    WebElementFacade inputCorreoDestinatario;

    @FindBy(xpath="//input[@name='subjectbox']")
    WebElementFacade inputAsunto;

    @FindBy(xpath="//div[@role='textbox']")
    WebElementFacade inputCuerpoMensaje;

    @FindBy(xpath="//div[@role='button' and .='Enviar']")
    WebElementFacade btnEnviarCorreo;

    @FindBy(xpath="//*[@id=\"link_vsm\"]")
    WebElementFacade lblMensajeEnviado;

    @FindBy(xpath="//div[@class='Kj-JD-Jz']")
    WebElementFacade labelMensajeError;

    public void abrirNuevoCorreo(){
        btnRedactar.waitUntilEnabled().click();
    }

    public void ingresarDestinatario(String destinatario){
        inputCorreoDestinatario.type(destinatario);
    }

    public void ingresarAsunto(String asunto){
        inputAsunto.type(asunto);
    }

    public void ingresarCuerpoMensaje(String cuerpoMensaje){
        inputCuerpoMensaje.type(cuerpoMensaje);
    }

    public void enviarCorrreo(){
        btnEnviarCorreo.click();
    }

    public void validarCorreoExitoso(){
        MatcherAssert.assertThat("No se ha enviado el correo", lblMensajeEnviado.isVisible() );
    }

    public void validarCorreoFallido(){
        MatcherAssert.assertThat("El correo fue enviado (No debería)", !labelMensajeError.waitUntilVisible().getText().isEmpty());
    }

}