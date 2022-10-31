package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFC {

    @FindBy(xpath = "//a[normalize-space()='Iniciar sesión']")
    WebElement linkiniciarsesion;

    @FindBy(css = ".input#emailID")
    @CacheLookup
    WebElement txt_user;

    @FindBy(css = ".input:nth-child(2)")
    @CacheLookup
    WebElement txt_password;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button")
    WebElement btniniciarsesion;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div/aside/div[3]/div[3]/ul/li/a")
    WebElement opcprestamo;

    @FindBy(xpath = "//a[normalize-space()='Entendido']")
    WebElement btnentendido;

    @FindBy(xpath = "//a[normalize-space()='Siguiente']")
    WebElement btnnext;

    @FindBy(xpath = "//div[@class='nav-bar']//img[@class='profile__arrow']")
    WebElement clickabrirmenu;

    @FindBy(xpath = "//div[@class='footer']")
    WebElement clickcerrar;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/main/div/div/section/div/p[2]/a")
    WebElement linkreenviarlink;

    @FindBy(xpath = "//button[normalize-space()='Precalifica ahora']")
    WebElement linkpre_califica;

    @FindBy(xpath = "//input[@id='documentNumber']")
    WebElement iddni;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailprest;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement txtcell;

    @FindBy(xpath = "//input[@id='phone_alt']")
    WebElement txtrecell;

    @FindBy(xpath = "//select[@placeholder='Seleccionar motivo de préstamo']")
    WebElement txtmotivo;

    @FindBy(xpath = "//option[@value='62993693b4868edcd155a43b']")
    WebElement txtcapitaltrabajo;

    @FindBy(xpath = "//option[@value='62993693b4868edcd155a43c']")
    WebElement txtconstruccion;

    @FindBy(xpath = "//option[@value='62993693b4868edcd155a43d']")
    WebElement txtconsolidardeudas;

    @FindBy(xpath = "//option[@value='62993693b4868edcd155a43e']")
    WebElement txttrasladodeuda;

    @FindBy(xpath = "//option[@value='62993693b4868edcd155a43f']")
    WebElement txtestoyeninfocorp;

    @FindBy(xpath = "//option[@value='62993693b4868edcd155a440']")
    WebElement txtlibrededispocisio;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[2]/div[2]/div[2]/div[14]/div[1]")
    WebElement aceptarpropiedad;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[2]/div[2]/div[2]/div[14]/div[2]")
    WebElement aceptarnopropiedad;


    @FindBy(xpath = "//input[@id='aceptTerms']")
    WebElement aceptarterminos;

    @FindBy(xpath = "//button[normalize-space()='Siguiente']")
    WebElement btnsiguientte;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[5]/div[1]")
    WebElement checkcasa;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[5]/div[2]")
    WebElement checkdepartamento;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[5]/div[3]")
    WebElement checkterreno;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[5]/div[4]")
    WebElement checklocal;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[5]/div[5]")
    WebElement checkedifico;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[8]/div[1]")
    WebElement checkyes;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[15]/div/select")
    WebElement selectdistrito;


    @FindBy(xpath = "//option[@value='1288']")
    WebElement clickchorrillos;

    @FindBy(xpath = "//option[@value='1300']")
    WebElement magdalenadelmar;

    @FindBy(xpath = "//option[@value='1296']")
    WebElement clicklince;

    @FindBy(xpath = "//option[@value='1313']")
    WebElement clicksanjuandemiraflores;

    @FindBy(xpath = "//option[@value='1316']")
    WebElement clicksanMiguel;

    @FindBy(xpath = "//option[@value='1281']")
    WebElement clickcercado;

    @FindBy(xpath = "//option[@value='1315']")
    WebElement sanmartindeporres;

    @FindBy(xpath = "//option[@value='1295']")
    WebElement lavictoria;

    @FindBy(xpath = "//option[@value='1293']")
    WebElement jesusmaria;

    @FindBy(xpath = "//option[@value='1294']")
    WebElement barranco;

    @FindBy(xpath = "//option[@value='1317']")
    WebElement santaanita;

    @FindBy(xpath = "//option[@value='1312']")
    WebElement sanjuandelurignacho;

    @FindBy(xpath = "//option[@value='1294']")
    WebElement lamolina;

    @FindBy(xpath = "//option[@value='1302']")
    WebElement miraflores;

    @FindBy(xpath = "//option[@value='1310']")
    WebElement sanborja;

    @FindBy(xpath = "//option[@value='1311']")
    WebElement sanisidro;

    @FindBy(xpath = "//option[@value='1297']")
    WebElement losolivos;

    @FindBy(xpath = "//option[@value='1285']")
    WebElement brena;

    @FindBy(xpath = "//option[@value='1283']")
    WebElement ate;

    @FindBy(xpath = "//option[@value='1301']")
    WebElement publolibre;

    @FindBy(xpath = "//option[@value='1320']")
    WebElement santiagodesurco;

    @FindBy(xpath = "//option[@value='1322']")
    WebElement villaelsalvador;

    @FindBy(xpath = "//option[@value='1299']")
    WebElement lurin;

    @FindBy(xpath = "//option[@value='1318']")
    WebElement santamariadelmar;

    @FindBy(xpath = "//option[@value='1306']")
    WebElement puntahermosa;

    @FindBy(xpath = "//option[@value='1309']")
    WebElement sanbartolo;

    @FindBy(xpath = "//option[@value='1318']")
    WebElement pucusana;

//    @FindBy(xpath = "//option[@value='1318']")
//    WebElement callao;
//
//    @FindBy(xpath = "//option[@value='1318']")
//    WebElement bellavista;




    @FindBy(xpath = "//option[@value='1288']")
    WebElement clickcomas;

    @FindBy(xpath = "//option[@value='1290']")
    WebElement clickindependencia;



    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[8]/div[1]")
    WebElement clickinscritosunarp;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[8]/div[2]")
    WebElement clicknoinscritosunarp;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[8]/div[3]")
    WebElement clicknoseinscritosunarp;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[17]/div/div[1]")
    WebElement clickcercapista;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[19]/div/div[1]")
    WebElement clickcercacerro;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[21]/div/div[1]")
    WebElement clickparteplana;

    @FindBy(xpath = "//input[@placeholder='m²']")
    WebElement txtmetros;

    @FindBy(xpath = "//button[@id='send-data-final']")
    WebElement btnenviardatos;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/section/div[1]/section[3]/div[2]/div[15]/div")
    WebElement listadeparatmento;

    @FindBy(xpath = "//select[@placeholder='Seleccione distrito']")
    WebElement selectdistrit;

    @FindBy(xpath = "//*[@id=\\\"property_guarantee\\\"]/label")
    WebElement aceptarpropiedadintranet;

    @FindBy(xpath = "//select[@placeholder='Seleccione distrito']")
    WebElement noaceptarpropiedadintranet;

    @FindBy(xpath = "//select[@placeholder='Seleccionar motivo de préstamo']")
    WebElement selecttipomotiv;


    @FindBy(xpath = "//option[@value='62993693b4868edcd155a43b']")
    WebElement txtcapitaltrabajointranet;

    @FindBy(xpath = "//option[@value='62aaaf91ee722cfdb48a2aff']")
    WebElement txtcompradeudainntranet;

    @FindBy(xpath = "//option[@value='62aaaf91ee722cfdb48a2b02']")
    WebElement txtiversionintranet;

    @FindBy(xpath = "//option[@value='62aaaf91ee722cfdb48a2b01']")
    WebElement txtconstruccionintranet;

    @FindBy(xpath = "//option[@value='62aaaf91ee722cfdb48a2b03']")
    WebElement txtlibrededispocisiointranet;

//    @FindBy(xpath = "//*[@id=\"property_guarantee\"]/label")
//    WebElement txtcapitaltrabajointranet;




    WebDriver driver;


    public LoginPageFC(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterlinkiniciarsesion(){
        linkiniciarsesion.click();
    }

    public void enterUsername(String username) {
       txt_user.sendKeys(username);
    }
    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void enterclickiniciosesion(){
        btniniciarsesion.click();
    }

    public void opcprestamo(){
        opcprestamo.click();
    }
    public void btnentendido(){
        btnentendido.click();
    }

    public void btnnext(){
        btnnext.click();
    }

    public void enterclickabrirmenu(){
        clickabrirmenu.click();
    }

    public void enterclickcerrar(){
        clickcerrar.click();
    }

    public void lnkreenviar(){
        linkreenviarlink.click();
    }

    public void linkpre_califica(){
        linkpre_califica.click();
    }

    public void enteriddni(String dni) {
        iddni.sendKeys(dni);
    }

    public void enteremailprest(String email) {
        emailprest.sendKeys(email);
    }

    public void entercell(String cell) {
       txtcell.sendKeys(cell);
    }

   public void enterrecell(String recell) {
       txtrecell.sendKeys(recell);
    }

    public void txtmotivo(){
        txtmotivo.click();
    }

    public void txtcapitaltrabajo(){
        txtcapitaltrabajo.click();
    }

    public void txtconstruccion(){
        txtconstruccion.click();
    }

    public void txtconsolidardeudas(){
        txtconsolidardeudas.click();
    }

    public void txttrasladodeuda(){
        txttrasladodeuda.click();
    }

    public void txtestoyeninfocorp(){
        txtestoyeninfocorp.click();
    }

    public void txtlibrededispocisio(){
        txtlibrededispocisio.click();
    }

    public void checkaceptarpropiedad(){
        aceptarpropiedad.click();
    }

    public void checknoaceptarpropiedad(){
        aceptarnopropiedad.click();
    }

    public void checkaceptarterminos(){
        aceptarterminos.click();
    }
    public void btnsiguientte(){
        btnsiguientte.click();
    }

    public void checkcasa(){
        checkcasa.click();
    }

    public void checkdepartamento(){
        checkdepartamento.click();
    }
    public void checkterreno(){
       checkterreno.click();
    }

    public void checklocal(){
       checklocal.click();
    }
    public void checkedifico(){
        checkedifico.click();
    }

    public void checkyes(){
        checkyes.click();
    }

    public void selectdistrito(){
        selectdistrito.click();
    }

    public void  clickcercado(){
        clickcercado.click();
    }
    public void  clickchorrillos(){
        clickchorrillos.click();
    }
    public void  magdalenadelmar(){
        magdalenadelmar.click();
    }
//    public void  lince(){
//        lince.click();
//    }
//
//
//    public void clickate(){
//        clickate.click();
//    }

    public void clickinscritosunarp(){
        clickinscritosunarp.click();
    }

    public void clicknoinscritosunarp(){
        clicknoinscritosunarp.click();
    }

    public void clicknoseinscritosunarp(){
        clicknoseinscritosunarp.click();
    }

    public void clickcercapista(){
        clickcercapista.click();
    }

    public void clickcercacerro(){
        clickcercacerro.click();
    }

    public void clickparteplana(){
        clickparteplana.click();
    }

    public void txtmetros(String metros) {
        txtmetros.sendKeys(metros);
    }

    public void btnenviardatos() {
        btnenviardatos.click();
    }

    public void listadeparatmento() {
        listadeparatmento.click();
    }

    public void selectdistrit(String cercado) {
        selectdistrit.sendKeys(cercado);
    }

    public void checkaceptarpropiedadintranet(){
        aceptarpropiedadintranet.click();
    }

    public void checknoaceptarpropiedadintranet(){
        noaceptarpropiedadintranet.click();
    }
    public void btntxtcapitaltrabajointranet(){
        txtcapitaltrabajointranet.click();
    }

    public void btntxtcompradeudainntranet(){
        txtcompradeudainntranet.click();
    }

    public void btntxtiversionintranet(){
        txtiversionintranet.click();
    }

    public void btntxtconstruccionintranet(){
        txtconstruccionintranet.click();
    }
    public void btntxtlibrededispocisiointranet(){
        txtlibrededispocisiointranet.click();
    }

    public void selecttipomotiv(){
        selecttipomotiv.click();
    }
}
