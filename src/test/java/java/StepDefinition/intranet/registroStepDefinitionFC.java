package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.RegistroPageFC;

import java.util.concurrent.TimeUnit;

public class registroStepDefinitionFC {

    WebDriver driver = null;
    RegistroPageFC registro;

    String url="https://public.test.prestamype.com";
    String urldev="https://public.dev.prestamype.com/";
    String urlprod="https://www.prestamype.com/";

    @Dado("navegador es abierto, ingreso a la plataforma")
    public void navegador_es_abierto_ingreso_a_la_plataforma() {

        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.navigate().to(urldev);
        driver.manage().window().maximize();
        registro = new RegistroPageFC(driver);

    }
    @Cuando("usuario realiza registro en la plataforma")
    public void usuario_realiza_registro_en_la_plataforma() {

        registro.enterlinkregistrate();

    }
    @Entonces("seleccionar el tipo de documento ce")
    public void seleccionar_el_tipo_de_documento_ce() {

        registro.entertxtce();

    }
    @Entonces("seleccionar el tipo de documento")
    public void seleccionar_el_tipo_de_documento() {


   }

    @Entonces("usuario ingresa el numero de documento mayor a ocho digitos {string}")
    public void usuario_ingresa_el_numero_de_documento_mayor_a_ocho_digitos(String documento) {

        registro.enterDocumento(documento);
    }



    @Entonces("usuario ingresa el numero de documento incompleto {string}")
    public void usuario_ingresa_el_numero_de_documento_incompleto(String documento) {

        registro.enterDocumento(documento);
    }

    @Entonces("usuario ingresa el numero de documento  registrado {string}")
    public void usuario_ingresa_el_numero_de_documento_registrado(String documento) {

        registro.enterDocumento(documento);
    }
    @Entonces("usuario ingresa el numero de documento {string}")
    public void usuario_ingresa_el_numero_de_documento(String documento) {

        registro.enterDocumento(documento);

    }

    @Entonces("usuario ingresar telefono y correo sin dominio {string} {string}")
    public void usuario_ingresar_telefono_y_correo_sin_dominio(String fono, String mail) {


        registro.enterPhone(fono);
        registro.enterEmail(mail);
    }


    @Entonces("usuario ingresar telefono y correo registrado {string} {string}")
    public void usuario_ingresar_telefono_y_correo_registrado(String fono, String mail) {

        registro.enterPhone(fono);
        registro.enterEmail(mail);
    }


    @Entonces("usuario ingresa el numero de telefono mayor a siete caracteres y correo {string} {string}")
    public void usuario_ingresa_el_numero_de_telefono_mayor_a_siete_caracteres_y_correo(String fono, String mail) {

        registro.enterPhone(fono);
        registro.enterEmail(mail);
    }


    @Entonces("usuario no ingresa el telefono y correo {string} {string}")
    public void usuario_no_ingresa_el_telefono_y_correo(String fono, String mail) {

        registro.enterPhone(fono);
        registro.enterEmail(mail);
    }
    @Entonces("usuario inngresar telefono y correo {string} {string}")
    public void usuario_inngresar_telefono_y_correo(String fono, String mail) {

        registro.enterPhone(fono);
        registro.enterEmail(mail);

    }

    @Entonces("usuario ingresar contrasena y no son iguales al repetir contrasena {string} {string}")
    public void usuario_ingresar_contrasena_y_no_son_iguales_al_repetir_contrasena(String pass, String repass) {


        registro.entertxtpass(pass);
        registro.entertxtrepass(repass);

    }

    @Entonces("usuario ingresar contrasena no cumple con el estandar y repetir contrasena {string} {string}")
    public void usuario_ingresar_contrasena_no_cumple_con_el_estandar_y_repetir_contrasena(String pass, String repass) {

        registro.entertxtpass(pass);
        registro.entertxtrepass(repass);

    }
    @Entonces("usuario ingresar contrasena y repetir contrasena {string} {string}")
    public void usuario_ingresar_contrasena_y_repetir_contrasena(String pass, String repass) {

        registro.entertxtpass(pass);
        registro.entertxtrepass(repass);


    }

    @Entonces("usuario acepta terminos y condiciones")
   public void usuario_acepta_terminos_y_condiciones() {

       registro.enteraceptar();



   }
    @Entonces("realizar click en registrarme")
   public void realizar_click_en_registrarme() {
        //driver.manage().timeouts().pageLoadTimeout(9840, TimeUnit.SECONDS);
       registro.enterbtnregistrar();
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
       System.out.println("Se realizo exitosamente el registro");


    }



}
