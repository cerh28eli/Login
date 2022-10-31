package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageFC {


    @FindBy(xpath = "(//div//input[@class='input'])[1]")
    WebElement infoadmin;

    @FindBy(xpath = "//input[@type='password']")
    WebElement adminpass;

    @FindBy(xpath = "//button[normalize-space()='Comenzar']")
    WebElement admincomenzar;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]")
    WebElement adminonversionista;

    @FindBy(xpath = "//a[@href='/inversionistas']//span[@class='title-menu'][normalize-space()='Listado']")
    WebElement adminlistainver;

    @FindBy(xpath = "//input[@placeholder='Ingrese texto']")
    WebElement txtingresartexto;

    @FindBy(xpath = "//span[normalize-space()='Filtrar']")
    WebElement btnfiltrar;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/span[2]")
    WebElement btneditar;

    @FindBy(xpath = "///button[normalize-space()='cerrar']")
    WebElement btncerrar;

    @FindBy(xpath = "(//select[@placeholder='Seleccione'])[2]")
    WebElement opctiposexo;

    @FindBy(xpath = "//option[@value='female']")
    WebElement opcfemale;

    @FindBy(xpath = "//option[@value='male']")
    WebElement opcmale;

    @FindBy(xpath = "//div[9]//div[1]//div[2]//select[1]")
    WebElement opcestadocivil;

    @FindBy(xpath = "//option[@value='single']")
    WebElement opcsolatero;

    @FindBy(xpath = "//textarea[@placeholder='Comentarios referentes al inversionista']")
    WebElement comment;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[24]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement subirpdf;

    @FindBy(linkText = "//span[normalize-space()='Contrato de Inversionista']")
    WebElement bajarencoment;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[25]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement subirpdf2;

    @FindBy(xpath = "(//label[@class='input-indicator'])[1]")
    WebElement check1;

    @FindBy(xpath = "(//label[@class='input-indicator'])[2]")
    WebElement check2;

    @FindBy(xpath = "(//label[@class='input-indicator'])[3]")
    WebElement check3;

    @FindBy(xpath = "(//select[@placeholder='Seleccione'])[8]")
    WebElement selectestado;

    @FindBy(xpath = "//option[@value='aprobado']")
    WebElement aprobado;

    @FindBy(linkText = "Datos completos")
    WebElement datosaprobados;

    @FindBy(xpath = "//button[normalize-space()='Guardar']")
    WebElement guardar;

    @FindBy(xpath = "//li[@class='active']")
    WebElement seccaprobado;

    @FindBy(xpath = "//li[normalize-space()='Cancelados']")
    WebElement secccancelar;

    @FindBy(xpath = "//li[normalize-space()='Pendientes']")
    WebElement seccpendiente;

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@listrates='[object Object]']//div//div//div//div[1]//div[1]//div[1]//label[1]//span[1]")
    WebElement iraestado;

    @FindBy(xpath = "//label[@for='|1-11']//span")
    WebElement factura;

    @FindBy(xpath = "//a[@href='/factoring/subastas']//span")
    WebElement subasta;

    @FindBy(xpath = "//input[@placeholder='Buscar']")
    WebElement codigosubasta;

    @FindBy(xpath = "//div[@id='__layout']//div//div//div//div//div//div//div//button")
    WebElement btncodigosubasta;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[10]/div[1]/a[1]")
    WebElement selectsubasta;

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div/div/div/div/div/div/div/div/div/div/div/div/button[1]")
    WebElement editarsubasta;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/input[1]")
    WebElement porcentaje;

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div/div/div/div/div/div[@custompanel='[object Object]']/div/div/div/div[1]/div[1]/div[1]")
    WebElement datefecha;

    @FindBy(xpath = "//a[@href='/factoring/cuentas-bancarias']")
    WebElement cuentabancaria;

    @FindBy(xpath = "//input[@placeholder='Buscar']")
    WebElement namecuentabancaria;

    @FindBy(xpath = "//div[@id='__layout']//div//div//div//div//div//div//div//button")
    WebElement btnbuscar;

    @FindBy(xpath = "//span[@class='btn-edit']")
    WebElement btnseleccionar;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[7]/div/div[2]/div[1]")
    WebElement btnaprobar;

    @FindBy(xpath = "//span[normalize-space()='Depósitos y retiros']")
    WebElement btndepositoyretiro;

    @FindBy(xpath = "//input[@placeholder='Buscar']")
    WebElement btnname;

    @FindBy(xpath = "//button[normalize-space()='Buscar']")
    WebElement xtxbtnbuscar;

    @FindBy(xpath = "//button[normalize-space()='Cancelar']")
    WebElement xtxbtncancelar;

    @FindBy(xpath = "//div[@class='d-flex']//div[1]//label[1]")
    WebElement checkaprobar;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/span[2]")
    WebElement detalledeposito;

    @FindBy(xpath = "//div[@class='input-wrap has-error']//input[@class='input']")
    WebElement ndetalledeposito;

    @FindBy(xpath = "//span[normalize-space()='IAM']")
    WebElement opciaiam;

    @FindBy(xpath = "//span[normalize-space()='Usuarios']")
    WebElement opciaiamusuario;

    @FindBy(xpath = "//span[normalize-space()='Facturas']")
    WebElement opcfacturas;

    @FindBy(xpath = "//span[normalize-space()='Cartera']")
    WebElement opcfacturascartera;

    @FindBy(xpath = "//span[normalize-space()='Asignación']")
    WebElement opcfacturascarterasignacion;

    @FindBy(xpath = "//span[normalize-space()='Solicitudes']")
    WebElement opcfacturascarterasolicitudes;

    @FindBy(xpath = "//span[normalize-space()='Pefiles institucionales']")
    WebElement opcperfilinsitucional;

    @FindBy(xpath = "//input[@placeholder='Ingrese texto']")
    WebElement txtrucempresa;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[4]/div")
    WebElement btneditarperfil;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/label[1]")
    WebElement btninversionista;

   @FindBy(xpath = "//li[normalize-space()='Aprobados']")
    WebElement btnaprobados;

    @FindBy(xpath = "//li[normalize-space()='Aprobados']")
    WebElement btncancelado;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/i")
    WebElement btnpaso1;

    @FindBy(xpath = "//button[normalize-space()='Editar subasta']")
    WebElement editarsubasta1;

    @FindBy(xpath = "//button[normalize-space()='Nuevo usuario']")
    WebElement registeruser;

    @FindBy(xpath = "//div[@class='card_wrapper']//div[1]//div[1]//div[2]//input[1]")
    WebElement txtname;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[3]/div/div[3]/div[1]/div/div[2]/div[2]/div/div[2]/input")
    WebElement txtlastname;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[3]/div/div[3]/div[1]/div/div[2]/div[3]/div/div[2]/input")
    WebElement txtcell;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[3]/div/div[3]/div[1]/div/div[2]/div[4]/div/div[2]/input")
    WebElement txtemail;

    @FindBy(xpath = "//button[normalize-space()='Guardar']")
    WebElement btnguardar;

    @FindBy(xpath = "//span[normalize-space()='Facturas']")
    WebElement linkfacturas;

    @FindBy(xpath = "//span[normalize-space()='Cartera']")
    WebElement linkcarteras;

    @FindBy(xpath = "//span[normalize-space()='Asignación']")
    WebElement linkasignar;

    @FindBy(xpath = "//input[@placeholder='Buscar']")
    WebElement listaname;

    @FindBy(xpath = "//button[normalize-space()='Buscar']")
    WebElement botonbuscar;




    WebDriver driver;


    public AdminPageFC(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterinfoadmin(String usuadmin){
        infoadmin.sendKeys(usuadmin);
    }

    public void enteradminpass(String adminpassword){
        adminpass.sendKeys(adminpassword);
    }

    public void enteradmincomenzar(){
        admincomenzar.click();
    }

    public void enteradminonversionista(){
        adminonversionista.click();
    }

    public void enteradminlistainver(){
        adminlistainver.click();
    }

    public void entertxtingresartexto(String ingresartexto){
        txtingresartexto.sendKeys(ingresartexto);
    }

    public void enterbtnfiltrar(){
        btnfiltrar.click();
    }

    public void enterbtneditar(){
        btneditar.click();
    }

    public void entertiposexo(){
        btneditar.click();
    }

    public void enteropctiposexo(){
        opctiposexo.click();
    }

    public void enteropcmale(){
        opcmale.click();
    }

    public void enteropcfemale(){
        opcfemale.click();
    }

    public void enteropcestadocivil(){
        opcestadocivil.click();
    }

    public void enteropcsolatero(){
        opcsolatero.click();
    }

    public void entercomment(String coment){
        comment.sendKeys(coment);
    }

    public void entersubirpdf(){
        subirpdf.sendKeys("/Users/hd/Documents/Prestapyme/Dni_pruebas.pdf");
    }

    public void entersubirpdf2(){
        subirpdf2.sendKeys("/Users/hd/Documents/Prestapyme/Dni_pruebas.pdf");
    }

    public void enterbajarencoment(){
        bajarencoment.click();
    }

    public void entercheck1(){
        check1.click();
    }

    public void entercheck2(){
        check2.click();
    }

    public void entercheck3(){
        check3.click();
    }

    public void enterselectestado(){
        selectestado.click();
    }

    public void enteraprobado(){
        aprobado.click();
    }

    public void enterdatosaprobados(){
        datosaprobados.click();
    }

    public void enterguardar(){
        guardar.click();
    }

    public void enterseccaprobado(){
        seccaprobado.click();
    }

    public void entersecccancelar(){
        secccancelar.click();
    }

    public void enterbtnbuscar(){
        btnbuscar.click();
    }

    public void enteriraestado(){

        Actions actions = new Actions(driver);
        actions.moveToElement(iraestado);
        iraestado.click();
    }

    public void enterfactura(){
        factura.click();
    }

    public void entersubasta(){
        subasta.click();
    }

    public void entercodigosubasta(String cdsubasta){
        codigosubasta.sendKeys(cdsubasta);
    }

    public void btncodigosubasta(){
        btncodigosubasta.click();
    }

    public void btnselectsubasta(){
         selectsubasta.click();
    }

    public void btneditarsubasta(){
        editarsubasta.click();
    }

    public void enterporcentaje(String nporcentaje){
        porcentaje.clear();
        porcentaje.sendKeys(nporcentaje);
    }

    public void btndatefecha(){
        datefecha.click();
    }
    public void txtdatefecha(String datefechas){
        datefecha.clear();
        datefecha.sendKeys(datefechas);
    }

    public void btncuentabancaria(){
        cuentabancaria.click();
    }

    public void enternamecuentabancaria(String name){
        namecuentabancaria.sendKeys(name);
    }

    public void btnbtnbuscar(){
        btnbuscar.click();
    }

    public void btnbtnseleccionar(){
        btnseleccionar.click();
    }
    //btnaprobar
    public void btnbtnaprobar(){
        btnaprobar.click();
    }

    public void btnbtndepositoyretiro(){
        btndepositoyretiro.click();
    }

    public void btnbtnname(String nameinv){
        btnname.sendKeys(nameinv);
    }

    public void btnenterbtnbuscar(){
        xtxbtnbuscar.click();
    }

    public void  btxtxbtncancelar(){
        xtxbtncancelar.click();
    }

    public void  btndetalledeposito(){
        detalledeposito.click();
    }

    public void  btncheckaprobar(){
        checkaprobar.click();
    }


    public void txtndetalledeposito(String noperac){
        ndetalledeposito.sendKeys(noperac);
    }

    public void  btnopciaiam(){
        opciaiam.click();
    }

    public void  btnopciaiamusuario(){
        opciaiamusuario.click();
    }

    public void  btnopcfacturas(){
        opcfacturas.click();
    }

    public void  btnopcfacturascartera(){
        opcfacturascartera.click();
    }

    public void  btnopcfacturascarterasignacion(){
        opcfacturascarterasignacion.click();
    }

    public void  btnopcfacturascarterasolicitudes(){
        opcfacturascarterasolicitudes.click();
    }

    public void  btnopcperfilinsitucional(){
        opcperfilinsitucional.click();
    }

    public void btntxtrucempresa(String rucempre){
        txtrucempresa.sendKeys(rucempre);
    }

    public void btneditarperfil(){
        btneditarperfil.sendKeys();
    }

    public void btninversionista(){
        btninversionista.sendKeys();
    }

    public void btnaprobados(){
        btnaprobados.click();
    }

    public void btnpaso1(){
        btnpaso1.click();
    }
    public void editarsubasta1(){
        editarsubasta1.click();
    }

    public void registeruser(){
        registeruser.click();
    }

    public void entertxtname(String name){
        txtname.sendKeys(name);
    }

    public void entertxtlastname(String lastname){
        txtlastname.sendKeys(lastname);
    }

    public void entertxtcell(String cell){
        txtcell.sendKeys(cell);
    }

    public void enterbtnguardar(){
        btnguardar.click();
    }

    public void linkfacturas(){
        linkfacturas.click();
    }

    public void linkcarteras(){
        linkcarteras.click();
    }

    public void linkasignar(){
        linkasignar.click();
    }

    public void entertxtemail(String email){
        txtemail.sendKeys(email);
    }

    public void finduser(String nameuser){
        listaname.sendKeys(nameuser);
    }
    public void botonbuscar(){
        botonbuscar.click();
    }
}
