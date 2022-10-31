package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.OportunidadesdivisasPageFC;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OportunidadesdivisasStepdefinitionFC {

    WebDriver driver = null;
    OportunidadesdivisasPageFC oportunidades;

    String url="https://public.test.prestamype.com";
    String urldev ="https://public.dev.prestamype.com/";

    @Dado("navegador open")
    public void navegador_open() {
        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }
    @Cuando("usuario login en la pagina")
    public void usuario_login_en_la_pagina() {
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
        oportunidades = new OportunidadesdivisasPageFC(driver);
        oportunidades.enterlinkiniciarsesion();
    }
    @Entonces("ingresar {string} y {string}")
    public void ingresar_y(String username, String password){
        System.out.println("Usuario ingresa username y password");

        oportunidades = new OportunidadesdivisasPageFC(driver);
        oportunidades.enterUsername(username);
        System.out.println("<-----------Los datos de mi username-----------------------> ");
        System.out.println("La longitud del corre es :" +username);
        int correoleght = username.length();
        System.out.println("la longitud del correo: " +correoleght);
        oportunidades.enterPassword(password);
        System.out.println("<-----------Los datos del password-----------------------> ");
        System.out.println("La longitud del corre es :" +password);
        int passwordleght = password.length();
        System.out.println("la longitud del password: " +passwordleght);
        oportunidades.enterclickiniciosesion();
        oportunidades.enterbtninversionista();
        oportunidades.enterbtnoportunidades();
    }
    @Entonces("ingresar a inversionista resumen general")
    public void ingresar_a_inversionista_resumen_general() {
        oportunidades.enterbtninversionista();
        oportunidades.entervalidarurl();
    }
    @Entonces("visualizar los campos de las subasta")
    public void visualizar_los_campos_de_las_subasta() {
        oportunidades.enterlblcliente();
        oportunidades.enterlblcodigo();
        oportunidades.enterlblriesgo();
//        oportunidades.enterlbmontototal();
//        oportunidades.enterlblrendimiento();
//        oportunidades.enterlblmodelo();
//        oportunidades.enterlblcierredesubasta();

    }
    @Entonces("cambiar divisas de soles a dolares")
    public void cambiar_divisas_de_soles_a_dolares() {
       oportunidades.enterbtndolaresasoles();

    }

    @Entonces("cambiar divisas de dolares a soles")
    public void cambiar_divisas_de_dolares_a_soles() {
        oportunidades.enterbtnsolesadolares();


    }
    @Entonces("monto de soles a cambiar {string} {string}")
    public void monto_de_soles_a_cambiar(String montodesad, String montoenviar) {
        oportunidades.entertxtmontodesad(montodesad);
        oportunidades.entertxtmontoenviar(montoenviar);

    }
    @Entonces("monto de dolares a cambiar {string}")
    public void monto_de_dolares_a_cambiar(String montod) {

    }
    @Entonces("ingresar a perfil institucional")
    public void ingresar_a_perfil_institucional() throws InterruptedException {
        oportunidades.enterbtninversionista();
        oportunidades.entervalidarurl();
        oportunidades.enterbtnoportunidades();
        driver.manage().timeouts().implicitlyWait(1240, TimeUnit.SECONDS);
        oportunidades.enterclickabrirmenu();
        oportunidades.enterclickempresainsitucional();
        oportunidades.entervalidarurlempresarial();
        driver.manage().timeouts().implicitlyWait(1240, TimeUnit.SECONDS);
        driver.navigate().refresh();

    }

    @Entonces("ingresar a  perfil persona natural")
    public void ingresar_a_perfil_persona_natural() {
        oportunidades.enterclickabrirmenu();
        driver.manage().timeouts().implicitlyWait(1240, TimeUnit.SECONDS);
        oportunidades.enterclickpersonanatural();
        driver.navigate().refresh();

    }
    @Entonces("visualizar inversiones")
    public void visualizar_inversiones() {

        oportunidades.enterclickinversionista();

    }

    @Cuando("en menu innversionista")
    public void en_menu_innversionista() {

        System.out.println("Ingresar a la pagina de prestamype");

        driver.navigate().to(url);
        driver.manage().window().maximize();
        oportunidades = new OportunidadesdivisasPageFC(driver);
    }

    @Entonces("ingresar a realizar una inversion")
    public void ingresar_a_realizar_una_inversion() {

        oportunidades.btninvertir();

    }


    @Entonces("seleccionnar el numero de subasta {string}")
    public void seleccionnar_el_numero_de_subasta(String nosubasta) {

        System.out.println("<-----------Evaluacion de la subasta-----------------------> ");
        oportunidades.entertxtsubasta(nosubasta);
        int subastalong = nosubasta.length();
        System.out.println("Numeros de  subasta" +nosubasta);
        System.out.println("Numeros de  subasta" +subastalong);

    }
    @Entonces("ingresar a primer perfil institucional")
    public void ingresar_a_primer_perfil_institucional() {

        oportunidades.enterbtninversionista();
        oportunidades.entervalidarurl();
        oportunidades.enterbtnoportunidades();
        driver.manage().timeouts().implicitlyWait(1240, TimeUnit.SECONDS);
        oportunidades.enterclickabrirmenu();
        oportunidades.enterclickempresainsitucional();



    }

    @Entonces("ingresar el perfil instiucional con perfil fondo")
    public void ingresar_el_perfil_instiucional_con_perfil_fondo() {
        String urlinv = "https://public.dev.prestamype.com/app/inversionista/dashboard?t=1666668324810";
      oportunidades.enterperfilfondo();
      driver.navigate().to(urlinv);




    }




}
