package java.StepDefinition.intranet;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.AdminPageFC;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class adminStatusStepdefinition {

    WebDriver driver = null;
    AdminPageFC admin;


    String urladmin="https://admin.test.prestamype.com/login";
    String urladmindev="https://admin.dev.prestamype.com/";


    @Dado("navegador es abierto, ingreso al admin")
    public void navegador_es_abierto_ingreso_al_admin() {
        System.out.println("Ingresar al navegador -- navegador abierto ");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.navigate().to(urladmindev);
        driver.manage().window().maximize();
        admin = new AdminPageFC(driver);

    }
    @Cuando("usuario ingresa a inversionista {string} y {string}")
    public void usuario_ingresa_a_inversionista(String usuadmin, String adminpassword) {
        admin.enterinfoadmin(usuadmin);
        admin.enteradminpass(adminpassword);
        admin.enteradmincomenzar();

    }
    @Entonces("usuario selecciona listado de inversionista")
    public void usuario_selecciona_listado_de_inversionista() {

        admin.enteradminonversionista();
        admin.enteradminlistainver();


    }
    @Entonces("usuaeio visualiza el perfil inversionista {string}")
    public void usuaeio_visualiza_el_perfil_inversionista(String ingresartexto) throws InterruptedException {

        admin.entertxtingresartexto(ingresartexto);
        admin.enterbtnfiltrar();
        Thread.sleep(350);
        admin.enterbtneditar();
    }

    @Entonces("ingresar datos faltantes {string}")
    public void ingresar_datos_faltantes(String coment) throws InterruptedException {

        admin.enteropctiposexo();
        admin.enteropcmale();
        admin.enteropcfemale();
        admin.enteropcestadocivil();
        admin.enteropcsolatero();
        Thread.sleep(10);
        admin.enteriraestado();
        admin.entercomment(coment);
    }

    @Entonces("subir pdf y aprobar inversionista")
    public void subir_pdf_y_aprobar_inversionista() throws AWTException {
        //admin.enterbajarencoment();
        admin.entersubirpdf();
        admin.entersubirpdf2();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        admin.entercheck1();
        admin.entercheck2();
        admin.entercheck3();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        admin.enterselectestado();
        admin.enteraprobado();
        admin.enterguardar();

    }

    @Entonces("validar en seccion aprobados buscar por correo")
    public void validar_en_seccion_aprobados_buscar_por_correo() {
        admin.enterseccaprobado();

    }

    @Entonces("validar el inversionista cancelado")
    public void validar_el_inversionista_cancelado() {
        admin.enterselectestado();
        admin.entersecccancelar();
        admin.enterguardar();

    }

    @Cuando("ingresar a seccion facturas subastas")
    public void ingresar_a_seccion_facturas_subastas() {
        admin.enterfactura();
        admin.entersubasta();


    }


    @Entonces("buscar codigo de subasta {string}")
    public void buscar_codigo_de_subasta(String codigosubasta) {
        admin.entercodigosubasta(codigosubasta);
        admin.btncodigosubasta();
        admin.btnselectsubasta();
    }


    @Entonces("seleccionar la subasta {string}")
    public void seleccionar_la_subasta(String nporcentaje) {

        admin.btneditarsubasta();
        admin.enterporcentaje(nporcentaje);
        admin.btndatefecha();
    }


    @Entonces("seleccionar fecha de la subasta {string}")
    public void seleccionar_fecha_de_la_subasta(String datefechas) {
        admin.txtdatefecha(datefechas);
    }

    @Entonces("ingresar a seccion facturas cuenta bancaria")
    public void ingresar_a_seccion_facturas_cuenta_bancaria() {

        admin.enterfactura();
        admin.btncuentabancaria();

    }
    @Entonces("resalizar la busqueda correspondiente {string}")
    public void resalizar_la_busqueda_correspondiente(String name) throws InterruptedException {


        Thread.sleep(1350);
        admin.enternamecuentabancaria(name);
        Thread.sleep(3250);
        admin.btnbtnbuscar();

    }
    @Entonces("aprobar estado de cuenta")
    public void aprobar_estado_de_cuenta() throws InterruptedException {

        admin.btnbtnseleccionar();
        Thread.sleep(1110);
        admin.btnbtnaprobar();
        Thread.sleep(1350);


    }

    @Entonces("ingresar a seccion facturas depositos")
    public void ingresar_a_seccion_facturas_depositos() {
        admin.enterfactura();
        admin.btnbtndepositoyretiro();


    }

    @Entonces("buscar cliente para aprobacion del deposito {string}")
    public void buscar_cliente_para_aprobacion_del_deposito(String nameinv) {
        admin.btnbtnname(nameinv);
        admin.btnenterbtnbuscar();

    }

    @Entonces("buscar cliente para aprobacion del retiro {string}")
    public void buscar_cliente_para_aprobacion_del_retiro(String nameinv) {
        admin.btnbtnname(nameinv);
        admin.btnenterbtnbuscar();
    }


    @Entonces("cancelar gestion de cuenta")
    public void cancelar_gestion_de_cuenta() throws InterruptedException {
        admin.btxtxbtncancelar();
        admin.btnbtnseleccionar();
        //Thread.sleep(1110);
        admin.btnbtnaprobar();
        Thread.sleep(1350);
        admin.enterguardar();

    }

    @Entonces("seleccionar detalle de deposito para la aprobacio  en admin")
    public void seleccionar_detalle_de_deposito_para_la_aprobacio_en_admin() {

        admin.btndetalledeposito();

    }
    @Entonces("ingresar codigo de operacion {string}")
    public void ingresar_codigo_de_operacion(String noperac) {

        admin.txtndetalledeposito(noperac);

    }


    @Entonces("ingresar a seccion IAM")
    public void ingresar_a_seccion_iam() {

        admin.btnopciaiam();
        admin.btnopciaiamusuario();

    }

    @Entonces("ingresar a seccion subastas")
    public void ingresar_a_seccion_subastas() {
        admin.btnopcfacturas();

    }

    @Entonces("dirigirse a carteras")
    public void dirigirse_a_carteras() {

        admin.btnopcfacturascartera();
        admin.btnopcfacturascarterasignacion();

    }

    @Entonces("ingresan a seccion cartera")
    public void ingresan_a_seccion_cartera() {
        admin.btnopcfacturascartera();

    }
    @Entonces("ingresar a la seccion mis solicitudes")
    public void ingresar_a_la_seccion_mis_solicitudes() {
        admin.btnopcfacturascarterasolicitudes();

    }
    @Entonces("ingresar a mi cartera")
    public void ingresar_a_mi_cartera() {

    }
    @Entonces("ingresar al perfil institucional")
    public void ingresar_al_perfil_institucional() {

        admin.btnopcperfilinsitucional();

    }

    @Entonces("ingresar el ruc correspondiente a la razon social {string}")
    public void ingresar_el_ruc_correspondiente_a_la_razon_social(String rucempre) {

        admin.btntxtrucempresa(rucempre);


    }
    @Entonces("aceptar en el boton y realizar la busqueda")
    public void aceptar_en_el_boton_y_realizar_la_busqueda() throws InterruptedException {

        admin.enterbtnfiltrar();
    }

    @Entonces("editar el perfil institucional")
    public void editar_el_perfil_institucional() {

       admin.btneditarperfil();
    }
    @Entonces("ingresar al modulo inversionista")
    public void ingresar_al_modulo_inversionista() {

        admin.btninversionista();
    }

    @Entonces("tab inversionista aprobados")
    public void tab_inversionista_aprobados() {

        admin.btnaprobados();

    }

    @Entonces("ingresar al paso1")
    public void ingresar_al_paso1() {
        admin.btnpaso1();
    }

    @Entonces("editar subasta")
    public void editar_subasta() {

        admin.editarsubasta1();

    }

    @Entonces("registrar usuario")
    public void registrar_usuario() {

        admin.registeruser();

    }


    @Entonces("ingresar datos del usuario {string} {string} {string} {string}")
    public void ingresar_datos_del_usuario(String name, String lastname, String cell, String email) {

        admin.entertxtname(name);
        admin.entertxtlastname(lastname);
        admin.entertxtcell(cell);
        admin.entertxtemail(email);

    }

    @Entonces("guadar el registro")
    public void guadar_el_registro() {

        admin.enterbtnguardar();

    }

    @Entonces("ingresar a facturas")
    public void ingresar_a_facturas() {

        admin.linkfacturas();
        admin.linkcarteras();
    }
    @Entonces("poder asignar correctamente")
    public void poder_asignar_correctamente() {

        admin.linkasignar();

    }

    @Entonces("realizar la busqueda {string}")
    public void realizar_la_busqueda(String nombreape) {

        admin.finduser(nombreape);

    }
    @Entonces("click en el boton buscar")
    public void click_en_el_boton_buscar() {

        admin.botonbuscar();


    }










}
