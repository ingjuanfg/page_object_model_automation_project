package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.steps.MailViewStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import com.ingjuanfg.steps.LoginMailStep;

public class SendMailSuccessDefinitions {

    @Managed WebDriver driver;

    @Steps
    LoginMailStep loginMailSteps;

    @Steps
    MailViewStep mailViewSteps;

    @Given("que estoy en el inicio de sesion de gmail")
    public void que_estoy_en_el_inicio_de_sesion_de_gmail() throws Exception {
        loginMailSteps.abrir_navegador();
    }

    @When("digite mi usuario \"([^\"]*)\" y contrasena \"([^\"]*)\"")
    public void digite_mi_usuario_y_contrasena(String correo, String pass) throws Exception {
       loginMailSteps.clickEn();
        loginMailSteps.realizar_login(correo, pass);
    }

    @When("cree un nuevo correo para destinatario \"([^\"]*)\" asunto \"([^\"]*)\" y cuerpo de mensaje \"([^\"]*)\"")
    public void cree_un_nuevo_correo_para_destinatario_asunto_y_cuerpo_de_mensaje(String destinatario, String asunto, String cuerpoMsj) throws Exception {
        mailViewSteps.crear_nuevo_mensaje();
        mailViewSteps.redactar_correo(destinatario, asunto, cuerpoMsj);
        mailViewSteps.enviarCorreoRedactado();
    }

    @Then("el email debe ser enviado con exito")
    public void el_email_debe_ser_enviado_con_exito() throws Exception {
        mailViewSteps.validar_correo_exitoso();
    }
}
