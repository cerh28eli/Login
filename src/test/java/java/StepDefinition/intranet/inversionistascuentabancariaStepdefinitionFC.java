package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.InversionistacuentabancariaPageFC;

import java.util.concurrent.TimeUnit;

public class inversionistascuentabancariaStepdefinitionFC {

    WebDriver driver = null;
    InversionistacuentabancariaPageFC invertircuentabancarias;

    String url="https://public.test.prestamype.com";

    @Dado("navegador se encuentra abierto")
    public void navegador_se_encuentra_abierto() {
        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }
    @Cuando("realiza login en la pagina")
    public void realiza_login_en_la_pagina() {
        System.out.println("Ingresar a la pagina de prestamype");

        driver.navigate().to(url);
        driver.manage().window().maximize();
        invertircuentabancarias = new InversionistacuentabancariaPageFC(driver);
        invertircuentabancarias.enterlinkiniciarsesion();

    }
    @Entonces("ingresa {string} y {string}")
    public void ingresa_y(String username, String password){
        invertircuentabancarias = new InversionistacuentabancariaPageFC(driver);
        invertircuentabancarias.enterUsername(username);
        invertircuentabancarias.enterPassword(password);
    }
    @Entonces("realiza click en login")
    public void realiza_click_en_login() throws InterruptedException {

        invertircuentabancarias.enterclickiniciosesion();
        Thread.sleep(4000);
        invertircuentabancarias.enterbnempresario();
    }
    @Entonces("esta navegando por la plataforma")
    public void esta_navegando_por_la_plataforma() throws InterruptedException {
        Thread.sleep(1200);
        invertircuentabancarias.enterbninversionista();
        Thread.sleep(4000);
        invertircuentabancarias.enterbnempresario();
        Thread.sleep(1200);
        invertircuentabancarias.enterbninversionista();
        invertircuentabancarias.enterlistadonuevacuenta();
    }

    @Entonces("apertura de numero de cuenta")
    public void apertura_de_numero_de_cuenta() {

        invertircuentabancarias.enternuevacuenta();
        invertircuentabancarias.enterseleccionebanco();
        invertircuentabancarias.enterbanco();
        invertircuentabancarias.enterselecttipocuenta();
    }
    @Entonces("seleccionar cuenta de ahorros")
    public void seleccionar_cuenta_de_ahorros() {
        invertircuentabancarias.txtcuentahorros();

    }


    @Entonces("apertura de numero de cuenta en dolares {string} {string}")
    public void apertura_de_numero_de_cuenta_en_dolares(String ccnrodolares, String ccinrodolares) throws InterruptedException {
        invertircuentabancarias.enteropctipocuenta();
        invertircuentabancarias.enterselectmoneda();
        invertircuentabancarias.enterenterselmonedadolares();
        invertircuentabancarias.enteropccc(ccnrodolares);
        invertircuentabancarias.enteropccci(ccinrodolares);

    }
    @Entonces("apertura de numero de cuenta en soles {string} {string}")
    public void apertura_de_numero_de_cuenta_en_soles(String ccnrosoles, String ccinrosoles) {
        invertircuentabancarias.enteropctipocuenta();
        invertircuentabancarias.enterselectmoneda();
        invertircuentabancarias.txtselmonedasoles();
        invertircuentabancarias.txtsolopccc(ccnrosoles);
        invertircuentabancarias.txtsolopccci(ccinrosoles);

    }

    @Entonces("guardar y acpetar")
    public void guardar_y_acpetar() {
        invertircuentabancarias.btnbtninvguardar();
        invertircuentabancarias.btnbtninvaceptarr();
    }

    @Entonces("editar alias de la cuenta {string}")
    public void editar_alias_de_la_cuenta(String alias) {
        invertircuentabancarias.txtaliascc(alias);
    }

    @Entonces("eliminar apertura de cuenta")
    public void eliminar_apertura_de_cuenta() {
        invertircuentabancarias.txtverdetalle();
        invertircuentabancarias.txteliminarcc();
        invertircuentabancarias.btnbtnaceptar();

    }



}
