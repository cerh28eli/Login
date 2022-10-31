package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerfilPageFC {

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
    WebElement opcinversionista;

    @FindBy(xpath = "//a[normalize-space()='Oportunidades']")
    WebElement opcoportunidades;

    @FindBy(xpath = "//a[normalize-space()='Perfiles institucionales']")
    WebElement opcperfil;


    @FindBy(xpath = "//button[normalize-space()='Nuevo perfil']")
    WebElement opcnuevoperfil;

    @FindBy(xpath = "//button[normalize-space()='Continuar']")
    WebElement btncontinuar;


    @FindBy(xpath = "//select[@placeholder='Selecciona el tipo']")
    WebElement tipoempresa;

    @FindBy(xpath = "//option[@value='5fbb2d636bb2106227967fa2']")
    WebElement selecttipoempresa;

    @FindBy(xpath = "//input[@id='ruc']")
    WebElement rucempresa;

    @FindBy(xpath = "//input[@id='razon']")
    WebElement razonoempresa;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailmpresa;

    @FindBy(xpath = "//input[@id='telefono']")
    WebElement fonompresa;

    @FindBy(xpath = "//textarea[@id='asociados']")
    WebElement commetempresa;

    @FindBy(xpath = "//button[@type='button']")
    WebElement btnempresa;

    @FindBy(xpath = "//button[normalize-space()='Aceptar']")
    WebElement aceptarempresa;

    @FindBy(xpath = "//a[normalize-space()='Pendientes']")
    WebElement seccionpendiente;

    @FindBy(xpath = "//a[normalize-space()='Aprobados']")
    WebElement seccionaprobado;

    @FindBy(xpath = "//a[normalize-space()='Rechazados']")
    WebElement seccioncancelado;

    @FindBy(xpath = "//a[normalize-space()='Rechazados']")
    WebElement linkverdetalleaprobado;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement okregistro;

    @FindBy(xpath = "(//a[contains(text(),'Ver detalle')])[1]")
    WebElement linkverdetallerpendiente;


    //button[normalize-space()='OK']
    ////button[normalize-space()='OK']

    WebDriver driver;


    public PerfilPageFC(WebDriver driver){

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

    public void enteopcinversionista(){
        opcinversionista.click();
    }

    public void enteopcoportunidades(){
        opcoportunidades.click();
    }

    public void enteopcperfil(){
        opcperfil.click();
    }

    public void enteopcnuevoperfil(){
        opcnuevoperfil.click();
    }

    public void entebtncontinuar(){
        btncontinuar.click();
    }

    public void entertipoempresa(){
        tipoempresa.click();
    }

    public void enterselecttipoempresa(){
        selecttipoempresa.click();
    }

    public void enterrucempresa(String rucempre){
        rucempresa.sendKeys(rucempre);
    }

    public void enterrazonoempresa(String rzempre){
        razonoempresa.sendKeys(rzempre);
    }

    public void enteremailmpresa(String emailempre){
        emailmpresa.sendKeys(emailempre);
    }

    public void enterfonompresa(String fonoempresa){
        fonompresa.sendKeys(fonoempresa);
    }

    public void entercommetempresa(String commet){
        commetempresa.sendKeys(commet);
    }

    public void btnempresa(){
        btnempresa.click();
    }
    public void aceptarempresa(){
        aceptarempresa.click();
    }

    public void seccionpendiente(){
        seccionpendiente.click();
    }
    public void seccionaprobado(){
        seccionaprobado.click();
    }

    public void okregistro(){
        okregistro.click();
    }

    public void linkverdetallerpendiente(){
        linkverdetallerpendiente.click();
    }



}
