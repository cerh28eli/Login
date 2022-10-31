package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.InversionistaDepositoPageFC;

import java.util.concurrent.TimeUnit;

public class inversionistadepositoStepdefinitionFC {

    WebDriver driver = null;
    InversionistaDepositoPageFC inversionistaDeposito;

    String url="https://public.test.prestamype.com";



    @Dado("ingreso a webprestamype, realizo login {string} y {string}")
    public void ingreso_a_webprestamype_realizo_login_y(String username, String password) {

        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
        inversionistaDeposito  = new InversionistaDepositoPageFC(driver);
        inversionistaDeposito.enterlinkiniciarsesion();
        inversionistaDeposito.enterUsername(username);
        inversionistaDeposito.enterPassword(password);
        inversionistaDeposito.enterclickiniciosesion();

    }



    @Cuando("realizo el deposito correspondiente con los montos exactos en soles {string} {string}")
    public void realizo_el_deposito_correspondiente_con_los_montos_exactos_en_soles(String operacion, String monto) {
        inversionistaDeposito.entertxtinversionista();
        inversionistaDeposito.enterclickbtnestadodecuenta();
        inversionistaDeposito.realizardeposito();
        inversionistaDeposito.realizardeposito(operacion);
        inversionistaDeposito.entertxtmontodeposit(monto);
        inversionistaDeposito.clickcheckaceptar();
        inversionistaDeposito.entersubirimagen();
        inversionistaDeposito.clickcheckdeppsito();

    }

    @Cuando("ingresar a la seccion dolares en estado de cuenta")
    public void ingresar_a_la_seccion_dolares_en_estado_de_cuenta() {

        inversionistaDeposito.entertxtinversionista();
        inversionistaDeposito.enterclickbtnestadodecuenta();
        inversionistaDeposito.clicksecciomdolares();
        inversionistaDeposito.clickdepositodolares();

    }
    @Entonces("realizo el deposito correspondiente con los montos exactos en dolares {string} {string}")
    public void realizo_el_deposito_correspondiente_con_los_montos_exactos_en_dolares(String operaciond, String montod) {





    }

    @Cuando("realizo el retiro correspondiente con los montos exactos en soles {string} {string}")
    public void realizo_el_retiro_correspondiente_con_los_montos_exactos_en_soles(String string, String string2) {

        inversionistaDeposito.entertxtinversionista();
        inversionistaDeposito.enterclickbtnestadodecuenta();
        inversionistaDeposito.clicbtnretiros();

    }

    @Cuando("realizo el retiro correspondiente {string}")
    public void realizo_el_retiro_correspondiente(String montosoles) {
        inversionistaDeposito.entertxtinversionista();
        inversionistaDeposito.enterclickbtnestadodecuenta();
        inversionistaDeposito.clicbtnretiros();
        inversionistaDeposito.entercampoamount(montosoles);
        inversionistaDeposito.enterbtnsolicitarretiro();

    }






}
