package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.ConfirmingPageFC;

import java.util.concurrent.TimeUnit;

public class confirmingStepdefinitionFC {

    WebDriver driver = null;
    ConfirmingPageFC confirming;

    String url="https://public.test.prestamype.com";
    String Devurl="https://public.dev.prestamype.com/";

    @Dado("navegador abierto")
    public void navegador_abierto() {
        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }
    @Cuando("usuario realizar login en la pagina")
    public void usuario_realizar_login_en_la_pagina() {


        System.out.println("Ingresar a la pagina de prestamype");

        driver.navigate().to(Devurl);
        driver.manage().window().maximize();
        confirming = new ConfirmingPageFC(driver);
        confirming.enterlinkiniciarsesion();

    }
    @Entonces("usuario ingresar {string} y {string}")
    public void usuario_ingresar_y(String username, String password) {
        System.out.println("Usuario ingresa username y password");

        confirming = new ConfirmingPageFC(driver);
        confirming.enterUsername(username);
        confirming.enterPassword(password);

    }
    @Entonces("usuario realizar click en login")
    public void usuario_realizar_click_en_login() {

        confirming.enterclickiniciosesion();


    }
    @Entonces("usuario esta navegando en la plataforma")
    public void usuario_esta_navegando_en_la_plataforma() {

        confirming.enteropcconfirming();
        confirming.enterclickbtnagregarempresa();
        confirming.enterselectipeempresa();
        confirming.enterbtnempresa();

    }
    @Entonces("selecionar la opcion confirming {string} {string} {string}")
    public void selecionar_la_opcion_confirming(String rucc, String rrz, String phone) {
        confirming.entertxtidRuc(rucc);
        confirming.entertxtbusinessName(rrz);
        confirming.entertxtphoneProvider(phone);
        confirming.entercheckterminos();
        confirming.entercheckguardar();
        confirming.entercheckaceptar();

    }
    @Entonces("selecciono el proveedor {string} {string} {string} {string} {string} {string}")
    public void selecciono_el_proveedor(String pruc, String praz, String pphone, String proname, String pmail, String prophone) {

        confirming.enterbtnproovedor();
        confirming.enterbtnidRucpro(pruc);
        confirming.enterrzpro(praz);
        confirming.enterpphone(pphone);
        confirming.entertxtnombreconntacto(proname);
        confirming.entertxtemailcontact(pmail);
        confirming.entertxtphoneContact(prophone);
        confirming.entercheckbtnguardar();
        confirming.entercheckaceptar();

    }
    @Entonces("seleccinar el tipo de moneda")
    public void seleccinar_el_tipo_de_moneda() {
        confirming.enterselectmoneda();

    }

    @Entonces("usuario esta navegando en la plataforma  en dev")
    public void usuario_esta_navegando_en_la_plataforma_en_dev() {
        confirming.enteropcconfirming();
        confirming.enterclickbtnagregarempresa();
        confirming.enterselectipeempresadev();
        confirming.enterbtnempresadev();
       // confirming.enterbtnempresa();

    }

    @Entonces("selecionar la opcion confirming {string} {string} {string} en dev")
    public void selecionar_la_opcion_confirming_en_dev(String rucc, String rrz, String phone) {
        confirming.entertxtidRuc(rucc);
        confirming.entertxtbusinessName(rrz);
        confirming.entertxtphoneProvider(phone);
        confirming.entercheckterminos();
        confirming.entercheckguardar();
        confirming.entercheckaceptar();
    }

    @Entonces("selecciono el proveedor {string} {string} {string} {string} {string} {string} en dev")
    public void selecciono_el_proveedor_en_dev(String string, String string2, String string3, String string4, String string5, String string6) {
    ;
    }

    @Entonces("seleccinar el tipo de moneda en dev")
    public void seleccinar_el_tipo_de_moneda_en_dev() {

    }

}
