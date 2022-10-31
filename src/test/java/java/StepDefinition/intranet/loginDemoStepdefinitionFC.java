package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.LoginPageFC;
import pagefactory.OportunidadesdivisasPageFC;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class loginDemoStepdefinitionFC {

    WebDriver driver = null;
    LoginPageFC login;

    String url="https://public.test.prestamype.com";
    String urldev="https://public.dev.prestamype.com/prestamos";
    String urlprod="https://www.prestamype.com/";


    @Dado("navegador es abierto")
    public void navegador_es_abierto() {
        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }
    @Cuando("usuario realiza login en la pagina")
    public void usuario_realiza_login_en_la_pagina() {

        System.out.println("Ingresar a la pagina de prestamype local" +urldev);

        driver.get(urldev);
        String titlle = driver.getTitle();
        System.out.println("El titulo es :" +titlle);
        int titleLength = driver.getTitle().length();
        System.out.println("Length of the title is : "+ titleLength);
        //obtener la url correcta
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(urldev)){
            System.out.println("Verification exitosa - URL abierta es correcta");
        }
        else {
            System.out.println("Verification Failed - URL abierta no es correcta");

            System.out.println("Actual URL is : " + actualUrl);
            System.out.println("Expected URL is : " + url);
        }

        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Total length of the Pgae Source is : " + pageSourceLength);


        driver.manage().window().maximize();
        login = new LoginPageFC(driver);
        login.enterlinkiniciarsesion();

    }

    @Entonces("usuario ingresa {string} y {string}")
    public void usuario_ingresa_y(String username, String password) {
        System.out.println("Usuario ingresa username y password");

        login = new LoginPageFC(driver);
        login.enterUsername(username);
        login.enterPassword(password);

    }
    @Entonces("usuario realiza click en login")
    public void usuario_realiza_click_en_login() {

        login.enterclickiniciosesion();
        System.out.println("Usuario se logeo exitosamente");

    }

    @Entonces("usuario ingresa a opcion prestamo del intranet")
    public void usuario_ingresa_a_opcion_prestamo_del_intranet() {

        login.opcprestamo();
        login.btnentendido();
        login.btnnext();

    }
    @Entonces("usuario esta navegando por la plataforma")
    public void usuario_esta_navegando_por_la_plataforma() throws InterruptedException {

        Thread.sleep(400);
        login.enterclickabrirmenu();
        login.enterclickcerrar();

    }

    @Entonces("realizar link reenviar")
    public void realizar_link_reenviar() throws InterruptedException {

        Thread.sleep(80);
        login.lnkreenviar();
    }

    @Entonces("usuario ingresa el correo incorrecto {string} y {string}")
    public void usuario_ingresa_el_correo_incorrecto_y(String username, String password) {

        System.out.println("Usuario ingresa username y password");

        login = new LoginPageFC(driver);
        login.enterUsername(username);
        login.enterPassword(password);

    }

    @Entonces("usuario ingresa el password incorrecto {string} y {string}")
    public void usuario_ingresa_el_password_incorrecto_y(String username, String password) {
        System.out.println("Usuario ingresa username y password");

        login = new LoginPageFC(driver);
        login.enterUsername(username);
        login.enterPassword(password);
    }

    @Entonces("usuario ingresa el password incorrecto, password inccorrecto {string} y {string}")
    public void usuario_ingresa_el_password_incorrecto_password_inccorrecto_y(String username, String password) {

        login.enterUsername(username);
        login.enterPassword(password);

    }

    @Cuando("usuario ingresa a opcion prestamo")
    public void usuario_ingresa_a_opcion_prestamo() {
        System.out.println("Ingresar a la pagina de prestamype");

        driver.navigate().to(urldev);
        driver.manage().window().maximize();
        login = new LoginPageFC(driver);

    }

    @Entonces("realizar en el boton pre-califica")
    public void realizar_en_el_boton_pre_califica() {

        login.linkpre_califica();
    }

    @Entonces("ingresar los datos del  usuario registrado ingresa {string} y {string}  y {string}  y {string}")
    public void ingresar_los_datos_del_usuario_registrado_ingresa_y_y_y(String dni, String email, String cell, String recell) {

        login.enteriddni(dni);
        login.enteremailprest(email);
        login.entercell(cell);
        login.enterrecell(recell);

    }
    @Entonces("seleccionar motivo de prestamo")
    public void seleccionar_motivo_de_prestamo() {

        login.txtmotivo();
        login.txtcapitaltrabajo();

    }
    @Entonces("acepto que se tiene una propiedad")
    public void acepto_que_se_tiene_una_propiedad() throws IOException {
        login.checkaceptarpropiedad();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosstep1.jpg"));

    }

    @Entonces("aceptar terminos")
    public void aceptar_terminos() {
        login.checkaceptarterminos();
        login.btnsiguientte();

    }

    @Entonces("definir tipo de inmueble")
    public void definir_tipo_de_inmueble() throws IOException {

        login.checkcasa();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosstep2.jpg"));

    }

    @Entonces("definir tipo de inmueble casa")
    public void definir_tipo_de_inmueble_casa() throws IOException {

        login.checkcasa();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosstep2.jpg"));
        ;
    }

    @Entonces("definir tipo de inmueble terreno")
    public void definir_tipo_de_inmueble_terreno() throws IOException {
        login.checkterreno();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosstep2.jpg"));

    }
    @Entonces("definir tipo de inmueble departamento")
    public void definir_tipo_de_inmueble_departamento() throws IOException {
        login.checkdepartamento();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosstep2.jpg"));

    }
    @Entonces("definir tipo de inmueble local")
    public void definir_tipo_de_inmueble_local() throws IOException {

        login.checklocal();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosstep2.jpg"));

    }

    @Entonces("definir tipo de inmueble edificio")
    public void definir_tipo_de_inmueble_edificio() throws IOException {

        login.checkedifico();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosstep2.jpg"));

    }
    @Entonces("el inmueble esta en")
    public void el_inmueble_esta_en() {

        login.checkyes();

    }
    @Entonces("seleccionar ubicacion del inmueble")
    public void seleccionar_ubicacion_del_inmueble() {

        //lima-lima
        //login.selectdistrito();
        //login.clickcercado();
        //login.clickate();
        login.clickchorrillos();

    }

    @Entonces("el inmueble esta inscrito en sunarp")
    public void el_inmueble_esta_inscrito_en_sunarp() throws IOException {

        login.clickinscritosunarp();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste3.jpg"));

    }
    @Entonces("el inmueble no esta inscrito en sunarp")
    public void el_inmueble_no_esta_inscrito_en_sunarp() throws IOException {

        login.clicknoinscritosunarp();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste3.jpg"));

    }
    @Entonces("el inmueble no se si esta inscrito en sunarp")
    public void el_inmueble_no_se_si_esta_inscrito_en_sunarp() throws IOException {

        login.clicknoseinscritosunarp();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste3.jpg"));

    }
    @Entonces("el inmueble esta cerca de la pista")
    public void el_inmueble_esta_cerca_de_la_pista() {

        login.clickcercapista();

    }
    @Entonces("la propiedad se ubica cerca de un cerro")
    public void la_propiedad_se_ubica_cerca_de_un_cerro() throws IOException {

        login.clickcercacerro();
        login.clickparteplana();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste4.jpg"));

    }

    @Entonces("area total {string}")
    public void area_total(String met) {

        login.txtmetros(met);

    }

    @Entonces("enviar datos")
    public void enviar_datos() throws IOException {

        login. btnenviardatos();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste5.jpg"));

    }

    @Entonces("seleccionar motivo de prestamo capital de trabajo")
    public void seleccionar_motivo_de_prestamo_capital_de_trabajo() throws IOException {
        login.txtmotivo();
        login.txtcapitaltrabajo();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste6.jpg"));

    }
    @Entonces("selecciona motivo  Construccion")
    public void selecciona_motivo_construccion() throws IOException {

        login.txtmotivo();
        login.txtconstruccion();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste6.jpg"));
    }
    @Entonces("selecciona motivo  Consolidar deudas")
    public void selecciona_motivo_consolidar_deudas() throws IOException {
        login.txtmotivo();
        login.txtconsolidardeudas();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste6.jpg"));

    }
    @Entonces("selecciona motivo  Traslado de deuda")
    public void selecciona_motivo_traslado_de_deuda() throws IOException {

        login.txtmotivo();
        login.txttrasladodeuda();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste6.jpg"));

    }
    @Entonces("selecciona motivo  Estoy en Infocorp")
    public void selecciona_motivo_estoy_en_infocorp() throws IOException {

        login.txtmotivo();login.txtestoyeninfocorp();
        login.txtestoyeninfocorp();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste6.jpg"));

    }
    @Entonces("selecciona motivo  Libre disponibilidad")
    public void selecciona_motivo_libre_disponibilidad() throws IOException {

        login.txtmotivo();
        login.txtlibrededispocisio();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/hd/IdeaProjects/testprestamype/src/test/java/imagenes/sinzonareferencial/chorrillosste6.jpg"));

    }
    @Entonces("no acpeto tener una propiedad")
    public void no_acpeto_tener_una_propiedad() {

        login.checknoaceptarpropiedad();

    }

    @Entonces("acepto que se tiene una propiedad intranet")
    public void acepto_que_se_tiene_una_propiedad_intranet() {
        login.checkaceptarpropiedadintranet();
    }
    @Entonces("no acpeto tener una propiedad inntranet")
    public void no_acpeto_tener_una_propiedad_inntranet() {

        login.checknoaceptarpropiedadintranet();

    }

    @Entonces("seleccionar motivo intranet")
    public void seleccionar_motivo_intranet() {
        login.selecttipomotiv();
    }

    @Entonces("seleccionar motivo de prestamo capital de trabajo intranet")
    public void seleccionar_motivo_de_prestamo_capital_de_trabajo_intranet() throws InterruptedException {

        //Thread.sleep(400);
        login.btntxtcapitaltrabajointranet();

    }
    @Entonces("selecciona motivo  Construccion intranet")
    public void selecciona_motivo_construccion_intranet() {
        login.selecttipomotiv();
        login.btntxtcompradeudainntranet();

    }
    @Entonces("selecciona motivo  Consolidar deudas intranet")
    public void selecciona_motivo_consolidar_deudas_intranet() {
        login.selecttipomotiv();
        login.btntxtiversionintranet();

    }
    @Entonces("selecciona motivo  Traslado de deuda intranet")
    public void selecciona_motivo_traslado_de_deuda_intranet() {
        login.selecttipomotiv();

    }
    @Entonces("selecciona motivo  Estoy en Infocorp intranet")
    public void selecciona_motivo_estoy_en_infocorp_intranet() {
        login.selecttipomotiv();

    }
    @Entonces("selecciona motivo  Libre disponibilidad intranet")
    public void selecciona_motivo_libre_disponibilidad_intranet() {
        login.selecttipomotiv();

    }


}
