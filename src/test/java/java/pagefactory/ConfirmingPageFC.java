package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmingPageFC {

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

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[3]/div[2]/ul[1]/li[1]")
    WebElement opcconfirming;

    @FindBy(xpath = "//label[normalize-space()='Agregar empresa']")
    WebElement btnagregarempresa;

    @FindBy(xpath = "//select[@placeholder='Selecciona el tipo']")
    WebElement selectipeempresa;

    @FindBy(xpath = "//option[@value='5fbb2d636bb2106227967fa2']")
    WebElement btnempresa;

    @FindBy(xpath = "//input[@data-qa='businessName']")
    WebElement txtbusinessName;

    @FindBy(id = "phoneProvider")
    WebElement txtphoneProvider;

    @FindBy(xpath = "//input[@id='idRuc']")
    WebElement txtidRuc;

    @FindBy(id = "terms_and_conditions")
    WebElement checkterminos;

    @FindBy(xpath = "//span[normalize-space()='Guardar']")
    WebElement checkguardar;
    //a[normalize-space()='Guardar']

    @FindBy(xpath = "//button[normalize-space()='Aceptar']")
    WebElement checkaceptar;

    @FindBy(xpath = "//label[normalize-space()='Agregar proveedor']")
    WebElement btnproovedor;

    @FindBy(xpath = "//input[@id='idRuc']")
    WebElement btnidRucpro;

    @FindBy(xpath = "//input[@data-qa='razon_social']")
    WebElement rzpro;

    @FindBy(xpath = "//input[@id='phoneClient']")
    WebElement txtpphone;

    @FindBy(xpath = "//input[@id='nombre_contacto']")
    WebElement txtnombreconntacto;

    @FindBy(xpath = "//input[@data-qa='email_contacto']")
    WebElement txtemailcontact;

    @FindBy(xpath = "(//input[@id='phoneContact'])[1]")
    WebElement txtphoneContact;

    @FindBy(xpath = "//a[normalize-space()='Guardar']")
    WebElement checkbtnguardar;

    @FindBy(xpath = "//select[@placeholder='Selecciona moneda']")
    WebElement selectmoneda;

    @FindBy(xpath = "//*[@id=\"panelEmpresa\"]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/select")
    WebElement selectipeempresadev;

    @FindBy(xpath = "//*[@id=\"panelEmpresa\"]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/select/option[2]")
    WebElement btnempresadev;



    WebDriver driver;


    public ConfirmingPageFC(WebDriver driver){

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

    public void enterclickbtnagregarempresa(){
        btnagregarempresa.click();
    }

    public void enteropcconfirming() {
        opcconfirming.click();
    }

    public void enterselectipeempresa() {
        selectipeempresa.click();
    }

    public void enterbtnempresa() {
        btnempresa.click();
    }
    public void entertxtidRuc(String rucc) {
        txtidRuc.sendKeys(rucc);
    }

    public void entertxtbusinessName(String rrz) {
        txtbusinessName.sendKeys(rrz);
    }

    public void entertxtphoneProvider(String phone) {
        txtphoneProvider.sendKeys(phone);
    }

    public void entercheckterminos() {
        checkterminos.click();
    }
    public void entercheckguardar() {
        checkguardar.click();
    }

    public void entercheckaceptar() {
        checkaceptar.click();
    }
    public void enterbtnproovedor() {
        btnproovedor.click();
    }

    public void enterbtnidRucpro(String rucpro) {
        btnidRucpro.sendKeys(rucpro);
    }

    public void enterrzpro(String praz) {
        rzpro.sendKeys(praz);
    }

    public void enterpphone(String pphone) {
        txtpphone.sendKeys(pphone);
    }

    public void entertxtnombreconntacto(String proname) {
        txtnombreconntacto.sendKeys(proname);
    }

    public void entertxtemailcontact(String pmail) {
        txtemailcontact.sendKeys(pmail);
    }

    public void entertxtphoneContact(String prophone) {
        txtphoneContact.sendKeys(prophone);
    }

    public void entercheckbtnguardar() {
        checkbtnguardar.click();
    }

    public void enterselectmoneda() {
        selectmoneda.click();
    }

    public void enterselectipeempresadev() {
        selectipeempresadev.click();
    }

    public void enterbtnempresadev() {
        btnempresadev.click();
    }








}
