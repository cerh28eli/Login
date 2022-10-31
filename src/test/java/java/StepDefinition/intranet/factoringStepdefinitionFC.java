package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.FactoringPageFC;

import java.util.concurrent.TimeUnit;

public class factoringStepdefinitionFC {

    WebDriver driver = null;
    FactoringPageFC factoring;


    String url="https://public.test.prestamype.com";



    @Dado("ingreso al navegador")
    public void ingreso_al_navegador() {

        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
       factoring = new FactoringPageFC (driver);


    }
    @Cuando("ingreso a la pagina web realizo el login {string} y {string}")
    public void ingreso_a_la_pagina_web_realizo_el_login_y(String username, String password) {

        factoring.enterlinkiniciarsesion();
        System.out.println("Usuario ingresa username y password");
        factoring.enterUsername(username);
        factoring.enterPassword(password);
        factoring.enterclickiniciosesion();
    }
    @Entonces("realizar click en el nombre de tu empresa, relacion que tiene con la empresa")
    public void realizar_click_en_el_nombre_de_tu_empresa_relacion_que_tiene_con_la_empresa() {

        factoring.linkvenderfact();
        factoring.selectempre();
        factoring.selectipe();
        factoring.relacionempresa();

    }
    @Entonces("ingreso el ruc correspondiente de la empresa, ingreso la razon social {string} y {string}")
    public void ingreso_el_ruc_correspondiente_de_la_empresa_ingreso_la_razon_social_y(String rucc, String namebussiness) {

        factoring.rruc(rucc);
        factoring.rrazonsocial(namebussiness);


    }
    @Entonces("ingreso el numero de contacto de la empresa {string}")
    public void ingreso_el_numero_de_contacto_de_la_empresa(String phonecontact) {

        factoring.telfcontact(phonecontact);
    }

    @Entonces("aceptar condiciones")
    public void aceptar_condiciones() {

        factoring.chkaceptar();

    }
    @Entonces("llenados los datos requeridos click en el boton guardar")
    public void llenados_los_datos_requeridos_click_en_el_boton_guardar() {

        factoring.btnguardar();
        factoring.rereguardar();


    }
    @Entonces("realizar click en tu cliente")
    public void realizar_click_en_tu_cliente() {

        //factoring.selectbussiness();
        //factoring.xlog();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        factoring.cliente();

    }
    @Entonces("ingreso ruc del cliente {string}")
    public void ingreso_ruc_del_cliente(String rrucliente) {

        factoring.txtruccliente(rrucliente);

    }

    @Entonces("ingreso razon social del cliente {string}")
    public void ingreso_razon_social_del_cliente(String rsruccliente) {

        factoring.txtrsruccliente(rsruccliente);

    }
    @Entonces("ingreso telefono de la oficina del cliente {string}")
    public void ingreso_telefono_de_la_oficina_del_cliente(String ofcliente) {

        factoring.phonecliente(ofcliente);

    }

    @Entonces("ingreso nombre del contacto del cliente, correo electronico {string} y {string}")
    public void ingreso_nombre_del_contacto_del_cliente_correo_electronico_y(String contaccli, String email) {

        factoring.nombrecontacto(contaccli);
        factoring.emailcliente(email);

    }

    @Entonces("ingresa telefono  {string}")
    public void ingresa_telefono(String phonnecliente) {

        factoring.phoneContact(phonnecliente);

    }

    @Entonces("llenados los datos del cliente requeridos click en el boton guardar")
    public void llenados_los_datos_del_cliente_requeridos_click_en_el_boton_guardar() {

        factoring.btnnguardar();
        factoring.btnnaceptart();

    }

    @Entonces("seleccionar nombre de la empresa")
    public void seleccionar_nombre_de_la_empresa() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        factoring.selectbussiness();
       //factoring.xlog();
        factoring.electronics();
        factoring.btncontinuar();

    }

    @Entonces("seleccionar fecha y moneda")
    public void seleccionar_fecha_y_moneda() throws InterruptedException {

        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        factoring.selectfecha();
        factoring.nextfecha();
        factoring.fechadia();
        factoring.escogermoneda();
        factoring.mondolares();


    }
    @Entonces("subir factura")
    public void subir_factura() throws InterruptedException {

        Thread.sleep(20);
        factoring.btnsubirfactura();


    }


}
