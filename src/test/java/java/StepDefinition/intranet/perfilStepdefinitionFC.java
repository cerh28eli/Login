package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.PerfilPageFC;

import java.util.concurrent.TimeUnit;

public class perfilStepdefinitionFC {

    WebDriver driver = null;
    PerfilPageFC fondo;

    String url="https://public.test.prestamype.com";
    String urldev="https://public.dev.prestamype.com/";
    String urlprod="https://www.prestamype.com/";

    @Dado("ingreso al navegador e ingreso a la plataforma")
    public void ingreso_al_navegador_e_ingreso_a_la_plataforma() {

        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

    }
    @Cuando("realizo el login ingreso {string} y {string} como inversionista persona natural")
    public void realizo_el_login_ingreso_y_como_inversionista_persona_natural(String username, String password) {

        System.out.println("Ingresar a la pagina de prestamype");

        driver.navigate().to(urldev);
        driver.manage().window().maximize();
        fondo = new PerfilPageFC(driver);
        fondo.enterlinkiniciarsesion();
        fondo.enterUsername(username);
        fondo.enterPassword(password);
        fondo.enterclickiniciosesion();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }
    @Entonces("selecciono opcion para ingresar perfil institucional")
    public void selecciono_opcion_para_ingresar_perfil_institucional() {

        fondo.enteopcinversionista();
        fondo.enteopcoportunidades();
        fondo.enteopcperfil();
        fondo.enteopcnuevoperfil();
        fondo.entebtncontinuar();

    }
    @Entonces("ingresar los datos correspondiente del inmueble {string} {string} {string} {string}  {string}")
    public void ingresar_los_datos_correspondiente_del_inmueble(String rucempre, String rzempre, String emailempre, String fonoempresa, String commet) {

        fondo.entertipoempresa();
        fondo.enterselecttipoempresa();
        fondo.enterrucempresa(rucempre);
        fondo.enterrazonoempresa(rzempre);
        fondo.enteremailmpresa(emailempre);
        fondo.enterfonompresa(fonoempresa);
        fondo.entercommetempresa(commet);

    }
    @Entonces("acepto el perfil institucional")
    public void acepto_el_perfil_institucional() {

        fondo.btnempresa();
        fondo.aceptarempresa();

    }

    @Entonces("filtrar en perfiles aprobados")
    public void filtrar_en_perfiles_aprobados() {

        fondo.seccionaprobado();
        fondo.okregistro();


    }

    @Entonces("link ver detalle pendiente")
    public void link_ver_detalle_pendiente() {
        fondo.linkverdetallerpendiente();
    }


    @Entonces("perfiles estado pendiente")
    public void perfiles_estado_pendiente() {
        fondo.seccionpendiente();
    }



}
