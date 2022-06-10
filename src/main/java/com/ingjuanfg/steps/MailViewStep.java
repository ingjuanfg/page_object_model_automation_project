package com.ingjuanfg.steps;


import com.ingjuanfg.pages.MailViewPages;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class MailViewStep {

    @Page
    private MailViewPages mailViewPages;

    @Step
    public void crear_nuevo_mensaje(){
        mailViewPages.abrirNuevoCorreo();
    }

    @Step
    public void redactar_correo(String destinatario, String asunto, String cuerpoMensaje){
        mailViewPages.ingresarDestinatario(destinatario);
        mailViewPages.ingresarAsunto(asunto);
        mailViewPages.ingresarCuerpoMensaje(cuerpoMensaje);
    }

    @Step
    public void enviarCorreoRedactado(){
        mailViewPages.enviarCorrreo();
    }

    @Step
    public void validar_correo_exitoso(){
        mailViewPages.validarCorreoExitoso();
    }

    @Step
    public void validar_correo_fallido(){
        mailViewPages.validarCorreoFallido();
    }

}