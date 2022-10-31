package java.StepDefinition.intranet;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.EmpresarioPageFC;
import pagefactory.LoginPageFC;

import java.util.concurrent.TimeUnit;

public class empresarioStepdefinitionFC {

    WebDriver driver = null;
    EmpresarioPageFC empresario;
    LoginPageFC login;


    String url = "https://public.test.prestamype.com";


    @Dado("acceso al navegador")
    public void acceso_al_navegador() {
        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @Cuando("user realiza login en la pagina")
    public void user_realiza_login_en_la_pagina() {

        System.out.println("Ingresar a la pagina de prestamype");

        driver.navigate().to(url);
        driver.manage().window().maximize();
        empresario = new EmpresarioPageFC(driver);
        login = new LoginPageFC(driver);
        login.enterlinkiniciarsesion();
    }

    @Entonces("user ingresa {string} y {string}")
    public void user_ingresa_y(String username, String password) {
        System.out.println("Usuario ingresa username y password");
        empresario = new EmpresarioPageFC(driver);
        empresario.enterUsername(username);
        empresario.enterPassword(password);
        empresario.clickiniciosesion();

    }

    @Entonces("ingresar a vender facturas")
    public void ingresar_a_vender_facturas() {

        empresario.venderfactura();
    }
    @Entonces("completar mis datos")
    public void completar_mis_datos() {

        empresario.compldatos();

    }

    @Entonces("ingresar a la seccion de factoring a vender facturas")
    public void ingresar_a_la_seccion_de_factoring_a_vender_facturas() {

        empresario.clickfinannciamiento();
        empresario.clickfactoring();
        empresario.clickempresario();


    }

    @Entonces("completar los datos del perfil")
    public void completar_los_datos_del_perfil() throws InterruptedException {

        Thread.sleep(300);
        empresario.venderfactura();
        empresario.completar();

    }

    @Entonces("ingresar ocupacion en la que laboro {string}")
    public void ingresar_ocupacion_en_la_que_laboro(String ocupacion) {

        empresario.ocupation(ocupacion);


    }

    @Entonces("seleccionar el lugar de ubicacion")
    public void seleccionar_el_lugar_de_ubicacion() throws InterruptedException {


        empresario.ingresardepa();
        empresario.seleccdepart();
        empresario.ingresarprovin();
        empresario.seleccprov();
        empresario.ingresardistrit();
        empresario.seleccdis();


    }

    @Entonces("seleccionnar el lugar direccion  {string}")
    public void seleccionnar_el_lugar_direccion(String direccion) throws InterruptedException {
        empresario.ingresardireccion(direccion);


    }

    @Entonces("guardar y aceptar")
    public void guardar_y_aceptar() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        empresario.clickguardar();
        empresario.clickaceptar();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Entonces("ingresar resumen general aqui")
    public void ingresar_resumen_general_aqui() {
       empresario.datosaqui();
    }



}
