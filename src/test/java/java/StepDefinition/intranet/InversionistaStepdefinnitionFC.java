package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.InversionistaPageFC;

import java.util.concurrent.TimeUnit;

public class InversionistaStepdefinnitionFC {

    WebDriver driver = null;
    InversionistaPageFC inversionista;

    String url="https://public.test.prestamype.com";
    String urldev="https://public.dev.prestamype.com/";
    String urlprod="https://www.prestamype.com/";

    @Dado("ingreso al navegador e ingresar a la plataforma")
    public void ingreso_al_navegador_e_ingresar_a_la_plataforma() {

        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        System.out.println("Ingresar a la pagina de prestamype");

        driver.navigate().to(urldev);
        driver.manage().window().maximize();
        inversionista = new InversionistaPageFC(driver);
        inversionista.enterlinkiniciarsesion();
    }

    @Cuando("realizar login ingreso {string} y {string} como inversionista")
    public void realizar_login_ingreso_y_como_inversionista(String username, String password) {

        System.out.println("Ingresar a la pagina de prestamype");
        inversionista = new InversionistaPageFC(driver);
        inversionista.enterUsername(username);
        inversionista.enterPassword(password);
        inversionista.enterbtniciosesion();

    }
    @Entonces("ingresar a la seccion de inversionista a invertir")
    public void ingresar_a_la_seccion_de_inversionista_a_invertir() {

        inversionista.linkinversionista();
        inversionista.linkoportunidades();
        inversionista.linkcompletardatos();


    }
    @Entonces("completar mis datos de perfil de inversionista ingreso ocupacion {string} y {string}")
    public void completar_mis_datos_de_perfil_de_inversionista_ingreso_ocupacion_y(String ocupacion, String direccion) {

        inversionista.ocupation(ocupacion);
        inversionista.ingresardireccion(direccion);



    }


    @Entonces("ingresar a la subasta que se desea invertir")
    public void ingresar_a_la_subasta_que_se_desea_invertir() throws InterruptedException {
        inversionista.linkinversionista();
        inversionista.linkoportunidades();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        inversionista.clickbtninvertir();
    }

    @Entonces("ingresar departmento, provincia y distrito")
    public void ingresar_departmento_provincia_y_distrito() {
        inversionista.ingresardepa();
        inversionista.seleccdepart();
        inversionista.ingresarprovin();
        inversionista.seleccprov();
        inversionista.ingresardistrit();
        inversionista.seleccdis();
    }

    @Entonces("continuar para el ingreso de datos")
    public void continuar_para_el_ingreso_de_datos() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        inversionista.clicktxtdirec();
        //inversionista.clickguardar();
        inversionista.clicbtnccontinuar();
    }

    @Entonces("subir imagenes de documento")
    public void subir_imagenes_de_documento() {

        inversionista.enterbtnaceptar();
        inversionista.enterbtnsubirimagen();
        inversionista.enterbtnsubirimagen2();
        driver.manage().timeouts().pageLoadTimeout(1820, TimeUnit.SECONDS);

    }

    @Entonces("aceptar continuar")
    public void aceptar_continuar() {
       // inversionista.enterbtnpaso2();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        inversionista.clicbtnccontinuar2();
        inversionista.enterbtnatras();

    }


}
