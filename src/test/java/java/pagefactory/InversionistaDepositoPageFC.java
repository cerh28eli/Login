package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InversionistaDepositoPageFC {

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

    @FindBy(xpath = "//a[normalize-space()='Inversionista']")
    WebElement txtinversionista;

    @FindBy(xpath = "//a[normalize-space()='Estados de Cuenta']")
    WebElement btnestadodecuenta;

    @FindBy(xpath = "//button[normalize-space()='+ Depósito']")
    WebElement realizardeposito;

    @FindBy(xpath = "//input[@id='nOperacion']")
    WebElement txtnooperacion;

    @FindBy(xpath = "//input[@id='monto-deposit']")
    WebElement txtmontodeposit;

    @FindBy(xpath = "//input[@aria-label='Subir imagen']")
    WebElement subirimagen;

    @FindBy(id = "aceptTerms")
    WebElement checkaceptar;
    //*[@id="__layout"]/div/div/main/div/div/div/div[1]/div/div[2]/button[1]



    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/main/div/div/div/header/div/div[1]/ul/li[2]")
    WebElement secciomdolares;

    @FindBy(xpath = "//a[normalize-space()='Registrar depósito']")
    WebElement checkdeppsito;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/main/div/div/div/div[1]/div/div[2]/button[1]")
    WebElement depositodolares;

    @FindBy(xpath = "//span[normalize-space()='Depósitos y retiros']")
    WebElement depositosyretirps;

    @FindBy(xpath = "//button[normalize-space()='- Retiro']")
    WebElement btnretiros;

    @FindBy(xpath = "//input[@id='amount']")
    WebElement campoamount;

    @FindBy(xpath = "//a[normalize-space()='Solicitar retiro']")
    WebElement solicitarretiro;

    @FindBy(xpath = "//a[normalize-space()='Solicitar retiro']")
    WebElement btnsolicitarretiro;


    WebDriver driver;

    public InversionistaDepositoPageFC(WebDriver driver){

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
    public void entertxtinversionista(){
        txtinversionista.click();
    }
    public void enterclickbtnestadodecuenta(){
        btnestadodecuenta.click();
    }
    public void realizardeposito(){
        realizardeposito.click();

    }
    public void realizardeposito(String operacion){
        txtnooperacion.sendKeys(operacion);

    }
    public void entertxtmontodeposit(String monto){
        txtmontodeposit.sendKeys(monto);
    }
    public void entersubirimagen(){
        subirimagen.sendKeys("/Users/hd/Documents/Prestapyme/imagenpng.jpg");
    }
    public void clickcheckaceptar(){
        checkaceptar.click();

    }
    public void clickcheckdeppsito(){
        checkdeppsito.click();

    }

    public void clicksecciomdolares(){
        secciomdolares.click();

    }

    public void clickdepositodolares(){
        depositodolares.click();

    }

    public void clicdepositosyretirps(){
        depositosyretirps.click();

    }

    public void clicbtnretiros(){
        btnretiros.click();

    }

    public void entercampoamount(String montosoles){
        campoamount.sendKeys(montosoles);
    }


    public void entersolicitarretiro(String montosoles) {
        solicitarretiro.sendKeys(montosoles);
    }

    public void enterbtnsolicitarretiro() {
        btnsolicitarretiro.click();
    }






}
