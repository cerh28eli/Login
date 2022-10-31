package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InversionistacuentabancariaPageFC {


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


    @FindBy(xpath = "//a[normalize-space()='Empresario']")
    WebElement btnempresaria;

    @FindBy(xpath = "//a[normalize-space()='Inversionista']")
    WebElement btninversionista;

    @FindBy(xpath = "//a[normalize-space()='Mis cuentas bancarias']")
    WebElement listadonuevacuenta;

    @FindBy(xpath = "//button[normalize-space()='Nueva cuenta']")
    WebElement nuevacuenta;

    @FindBy(xpath = "//select[@placeholder='Selecciona el banco']")
    WebElement seleccionebanco;

    @FindBy(xpath = "//option[@value='5fbb148fc41714735242402a']")
    WebElement banco;

    @FindBy(xpath = "//select[@placeholder='Selecciona el tipo de cuenta']")
    WebElement selecttipocuenta;

    @FindBy(xpath = "//option[@value='5fb59ef592ca93bbf313a73a']")
    WebElement cuentahorros;

    @FindBy(xpath = "//option[@value='5fb59ee192ca93bbf313a727']")
    WebElement cuentacorriente;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/main/div/div/div/div/div[2]/div[2]/div/div[6]/div/div/select/option[2]")
    WebElement opctipocuenta;

    @FindBy(xpath = "//select[@placeholder='Selecciona la moneda']")
    WebElement selectmoneda;

    @FindBy(xpath = "//option[@value='5fb5a0e69cf11dcf52f63f27']")
    WebElement selmonedadolares;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/main/div/div/div/div/div[2]/div[2]/div/div[8]/div/div/select/option[3]")
    WebElement opcselectmoneda;

    @FindBy(id = "cc")
    WebElement opccc;

    @FindBy(id = "cci")
    WebElement opccci;

    @FindBy(xpath = "//a[normalize-space()='Guardar']")
    WebElement btninvguardar;

    @FindBy(xpath = "//button[normalize-space()='Aceptar']")
    WebElement btninvaceptarr;

    @FindBy(id = "alias")
    WebElement aliascc;

    @FindBy(xpath = "(//a[@class='actions__btn'][normalize-space()='Ver detalle'])[1]")
    WebElement verdetalle;

    @FindBy(xpath = "//a[normalize-space()='Eliminar registro']")
    WebElement eliminarcc;

    @FindBy(xpath = "//button[normalize-space()='Aceptar']")
    WebElement btnaceptar;

    @FindBy(xpath = "//option[@value='5fb5a0e69cf11dcf52f63f26']")
    WebElement selmonedasoles;

    @FindBy(id = "cc")
    WebElement solopccc;

    @FindBy(id = "cci")
    WebElement solopccci;




    WebDriver driver;


    public InversionistacuentabancariaPageFC(WebDriver driver) {

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

    public void enterbninversionista() {
        btninversionista.click();
    }

    public void enterbnempresario() {
        btnempresaria.click();
    }

    public void enterlistadonuevacuenta() {
        listadonuevacuenta.click();
    }

    public void enternuevacuenta() {
        nuevacuenta.click();
    }

    public void enterseleccionebanco() {
        seleccionebanco.click();
    }

    public void enterbanco() {
        banco.click();
    }

    public void enterselecttipocuenta() {
        selecttipocuenta.click();
    }

    public void enteropctipocuenta() {
        opctipocuenta.click();
    }

    public void enterenterselmonedadolares() {
        selmonedadolares.click();
    }

    public void enterselectmoneda() {
        selectmoneda.click();
    }

    public void enteropccc(String ccnrodolares) {
        opccc.sendKeys(ccnrodolares);
    }

    public void enteropccci(String ccinrodolares) {
        opccci.sendKeys(ccinrodolares);
    }

    public void btnbtninvguardar() {
        btninvguardar.click();
    }

    public void btnbtninvaceptarr() {
        btninvaceptarr.click();
    }

    public void txtaliascc(String alias) {
        aliascc.clear();
        aliascc.sendKeys(alias);
    }



    public void txtverdetalle() {
        verdetalle.click();
    }

    public void txteliminarcc() {
        eliminarcc.click();
    }

    public void btnbtnaceptar() {
        btnaceptar.click();
    }

    public void txtselmonedasoles() {
        selmonedasoles.click();
    }

    public void txtsolopccc(String  cccnrosoles) {
        solopccc.sendKeys(cccnrosoles);
    }

    public void txtsolopccci(String ccnrosoles) {
        solopccci.sendKeys(ccnrosoles);
    }

    public void txtcuentacorriente() {
        cuentacorriente.click();
    }

    public void txtcuentahorros() {
        cuentahorros.click();
    }


}
