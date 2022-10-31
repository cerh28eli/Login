package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoringPageFC {

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

    @FindBy(xpath = "//ul[@class='list']//a[normalize-space()='Vender facturas']")
    WebElement clickvenderfactura;

   @FindBy(xpath = "//label[normalize-space()='Agregar empresa']")
   WebElement seleccionarempresa;

    @FindBy(xpath = "//select[@placeholder='Selecciona el tipo']")
    WebElement seleccionartipo;

    @FindBy(xpath = "//*[@id=\"panelEmpresa\"]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/select/option[2]")
    WebElement relacionemp;

    @FindBy(xpath = "//input[@id='idRuc']")
    WebElement ruc;

    @FindBy(xpath = "//input[@data-qa='businessName']")
    WebElement razonsocial;

    @FindBy(xpath = "//input[@id='phoneProvider']")
    WebElement telfcontact;

    @FindBy(id = "terms_and_conditions")
    WebElement chkaceptar;

    @FindBy(xpath = "//span[normalize-space()='Guardar']")
    WebElement btnguardar;

    @FindBy(xpath  = "//button[normalize-space()='Aceptar']")
    WebElement btnreguardar;

    @FindBy(xpath  = "//select[@placeholder='Selecciona empresa']")
    WebElement selectbusiness;

    @FindBy(xpath  = "//option[@value='6326879d4c9d4c54c634c643']")
    WebElement xlog;

    @FindBy(xpath  = "//option[@value='6327e3534c9d4c54c634fb96']")
    WebElement electronics;

    @FindBy(xpath  = "//label[normalize-space()='Agregar cliente']")
    WebElement cliente;

    @FindBy(id = "idRuc")
    WebElement txtruccliente;

    @FindBy(xpath = "//input[@data-qa='razon_social']")
    WebElement txtrsruccliente;

    @FindBy(xpath = "//input[@id='phoneClient']")
    WebElement phonecliente;

    @FindBy(id = "nombre_contacto")
    WebElement nombrecontacto;

    @FindBy(xpath = "//input[@data-qa='email_contacto']")
    WebElement emailcliente;

    @FindBy(xpath = "//input[@id='phoneContact']")
    WebElement phoneContact;

    @FindBy(xpath = "//a[normalize-space()='Guardar']")
    WebElement btnnguardar;

    @FindBy(xpath = "//button[normalize-space()='Aceptar']")
    WebElement btnnaceptar;

    @FindBy(xpath = "//a[normalize-space()='Continuar']")
    WebElement btncontinuar;

    @FindBy(xpath = "//div[@class='wct-input-datepicker']")
    WebElement selectfecha;

    @FindBy(xpath = "//span[@class='next']")
    WebElement nextfecha;

    @FindBy(xpath = "//span[normalize-space()='22']")
    WebElement fechadia;

    @FindBy(xpath = "//select[@placeholder='Selecciona moneda']")
    WebElement escogermoneda;

    ////option[@value='5fb5a0e69cf11dcf52f63f27']

    @FindBy(xpath = "//option[@value='5fb5a0e69cf11dcf52f63f27']")
    WebElement mondolares;

    @FindBy(xpath = "//div[@class='btn-upload']")
    WebElement subirfactura;


    WebDriver driver;

    public FactoringPageFC(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterlinkiniciarsesion() {
        linkiniciarsesion.click();
    }

    public void enterUsername(String username) {
        txt_user.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void enterclickiniciosesion() {
        btniniciarsesion.click();
    }

    public void linkvenderfact() {
        clickvenderfactura.click();
    }

    public void selectempre() {
        seleccionarempresa.click();
    }

    public void selectipe() {
        seleccionartipo.click();
    }

    public void relacionempresa() {

        relacionemp.click();

    }

    public void rruc(String rucc) {

        ruc.sendKeys(rucc);

    }

    public void rrazonsocial(String namebussiness) {

       razonsocial.sendKeys(namebussiness);

    }

    public void telfcontact(String phonecontact) {

        telfcontact.sendKeys(phonecontact);

    }

    public void chkaceptar() {

        chkaceptar.click();

    }

    public void btnguardar() {

        btnguardar.click();

    }

    public void rereguardar() {

        btnreguardar.click();

    }

    public void cliente() {

        cliente.click();

    }

    public void txtruccliente(String rrucliente) {

        txtruccliente.sendKeys(rrucliente);

    }

    public void  txtrsruccliente(String namecliente) {

        txtrsruccliente.sendKeys(namecliente);

    }

    public void phonecliente (String ofcliente) {

        phonecliente.sendKeys(ofcliente);

    }

    public void nombrecontacto (String contaccli) {

        nombrecontacto.sendKeys(contaccli);

    }

    public void emailcliente (String email) {

        emailcliente.sendKeys(email);

    }

    public void phoneContact (String phonnecliente) {

        phoneContact.sendKeys(phonnecliente);

    }

    public void btnnguardar () {

        btnnguardar.click();

    }

    public void btnnaceptart () {

        btnnaceptar.click();

    }


    public void selectbussiness() {

        selectbusiness.click();

    }

    public void xlog() {

        xlog.click();

    }

    public void electronics() {

        electronics.click();

    }

    public void btncontinuar() {

        btncontinuar.click();

    }

    public void selectfecha() {

        selectfecha.click();


    }

    public void nextfecha() {
        nextfecha.click();
    }

    public void fechadia() {
        fechadia.click();
    }

    public void escogermoneda() {
        escogermoneda.click();
    }


    public void mondolares() {
        mondolares.click();
    }

    public void btnsubirfactura(){
        subirfactura.click();
        //subirfactura.sendKeys("/Users/hd/IdeaProjects/testprestamype/src/test/resources/xml/factoring/centinela.XML");

    }

}


