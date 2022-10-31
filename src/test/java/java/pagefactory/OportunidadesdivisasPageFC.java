package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OportunidadesdivisasPageFC {

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
    WebElement btninversionista;

    @FindBy(xpath = "//a[normalize-space()='Oportunidades']")
    WebElement btnoportunidades;

    @FindBy(xpath = "//div[normalize-space()='Cliente']")
    WebElement lblcliente;

    @FindBy(xpath = "//div[normalize-space()='Código']")
    WebElement lblcodigo;

    @FindBy(xpath = "//span[normalize-space()='Riesgo']")
    WebElement lblriesgo;

    @FindBy(xpath = "//div[normalize-space()='Monto total']")
    WebElement lbmontototal;

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[@class='application']/div[@class='application--wrap']/main[@class='main']/div[@class='main__wrap']/div[@class='container']/div[@class='empresas body']/section[@class='content']/div[@class='table-content']/div[@class='wct-grid-table mt8']/div/div[@class='grid-table-head']/div[1]")
    WebElement lblrendimiento;

    @FindBy(xpath = "//div[normalize-space()='Modelo']")
    WebElement lblmodelo;

    @FindBy(xpath = "//div[normalize-space()='Cierre de subasta']")
    WebElement lblcierredesubasta;

    @FindBy(xpath = "//div[normalize-space()='Fecha de pago']")
    WebElement lblfechadepago;

    @FindBy(xpath = "//button[normalize-space()='Cambiar a dólares']")
    WebElement btndolaresasoles;

    @FindBy(xpath = "//input[@id='montoEnviar']")
    WebElement txtmontodesad;

    @FindBy(xpath = "//input[@id='montoEnviar']")
    WebElement txtmontoenviar;

    @FindBy(xpath = "//button[normalize-space()='Cambiar a sóles']")
    WebElement btnsolesadolares;

    @FindBy(xpath = "//div[@class='nav-bar']//img[@class='profile__arrow']")
    WebElement clickabrirmenu;

    @FindBy(xpath = "//a[normalize-space()='Vitor Larco S.A.']")
    WebElement clickempresainsitucional;

    @FindBy(xpath = "//a[normalize-space()='Resumen general']")
    WebElement clickresumengeneral;

    @FindBy(xpath = "//span[normalize-space()='Fanny Ysabel']")
    WebElement clickpersonanatural;

    @FindBy(xpath = "//a[normalize-space()='Mis Inversiones']")
    WebElement clickinversionista;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/nav/div/div[3]/a[3]")
    WebElement btnninvertir;

    @FindBy(xpath = "//span[contains(text(),'en préstamos con garantía hipotecaria y obtén hast')]")
    WebElement actualprimerpage;

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@class='grid-table-body']//div//div//div[1]//div[1]//div[10]")
    WebElement btninvertir;

    @FindBy(className = "//*[@id=\"__layout\"]/div/div/main/div/div/div/section/div/div[1]/div[2]/div[1]/div/div[1]/div/div[3]")
    WebElement txtsubasta;

    @FindBy(xpath = "//div[@class='nav-bar']//div[@class='profile']")
    WebElement perfilfondo;

    WebDriver driver;

    public OportunidadesdivisasPageFC(WebDriver driver) {

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

    public void enterbtninversionista() {
        btninversionista.click();
    }
    public void entervalidarurl() {
        String ActualTitle = "https://public.test.prestamype.com/app/inversionista/dashboard?t=1664081708058";
        String ExpectedTitle = "https://public.test.prestamype.com/app/inversionista/dashboard?t=1664081708058";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    public void entervalidarurlempresarial() {
        String ActualTitle = "https://public.test.prestamype.com/app/inversionista/dashboard?t=1664084722123";
        String ExpectedTitle = "https://public.test.prestamype.com/app/inversionista/dashboard?t=1664084722123";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        driver.navigate().refresh();
    }

    public void enterbtnoportunidades() {
        btnoportunidades.click();
    }

    public void enterbtndolaresasoles() {
        btndolaresasoles.click();
    }
    public void entertxtmontodesad(String montodesad) {
        txtmontodesad.sendKeys(montodesad);
    }

    public void entertxtmontoenviar(String montoenviar) {
        txtmontoenviar.sendKeys(montoenviar);
    }

    public void enterbtnsolesadolares() {
        btnsolesadolares.click();
    }


    @Test
    public void enterlblcliente() {
        lblcliente.click();
        Assert.assertEquals(lblcliente.getText(), "Cliente");
        System.out.println("El primer campo:" + lblcliente.getText());
    }

    @Test
    public void enterlblcodigo() {

        lblcodigo.click();
        Assert.assertEquals(lblcodigo.getText(), "Código");
        System.out.println("El segundo campo:" + lblcodigo.getText());
    }
    @Test
    public void enterlblriesgo() {

        lblriesgo.click();
        Assert.assertEquals(lblriesgo.getText(), "Riesgo");
        System.out.println("El tercer campo:" + lblriesgo.getText());
    }
    @Test
    public void enterlbmontototal() {
        lbmontototal.click();
        Assert.assertEquals(lbmontototal.getText(), "Monto total");
        System.out.println("El cuarto campo:" + lbmontototal.getText());
    }
    @Test
    public void enterlblrendimiento() {
        lblrendimiento.click();
        Assert.assertEquals(lblrendimiento.getText(), "Rendimiento/TIR");
        System.out.println("El quinto campo:" + lblrendimiento.getText());
    }
    @Test
    public void enterlblmodelo() {
        lblmodelo.click();
        Assert.assertEquals(lblmodelo.getText(), "Modelo");
        System.out.println("El sexto campo:" + lblmodelo.getText());
    }
    @Test
    public void enterlblcierredesubasta() {
        lblcierredesubasta.click();
        Assert.assertEquals(lblcierredesubasta.getText(), "Cierre de subasta");
        System.out.println("El septimo campo:" + lblcierredesubasta.getText());
    }
    @Test
    public void enterlblfechadepago() {
        lblfechadepago.click();
        Assert.assertEquals(lblfechadepago.getText(), "Fecha de pago\n");
        System.out.println("El octavo campo:" + lblfechadepago.getText());
    }
    public void enterclickabrirmenu(){
        clickabrirmenu.click();
    }
    public void enterclickempresainsitucional(){
        clickempresainsitucional.click();
    }
    public void enterclickresumengeneral(){
        clickresumengeneral.click();
    }

    public void enterclickpersonanatural(){
        clickpersonanatural.click();
    }

    public void enterclickinversionista(){
        clickinversionista.click();
    }

    public void btninvertir(){

        btninvertir.click();
    }

    public void entertxtsubasta(String nosubasta) {
        txtsubasta.sendKeys(nosubasta);
    }

    public void enterperfilfondo(){

        perfilfondo.click();
    }





}
