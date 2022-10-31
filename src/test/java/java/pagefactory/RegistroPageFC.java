package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroPageFC {



    @FindBy(linkText = "Regístrate")
    WebElement registrate;

    @FindBy(id = "document")
    WebElement txtdocumento;

    @FindBy(id = "phone")
    WebElement txtphone;

    @FindBy(id = "email")
    WebElement txtemail;

    @FindBy(xpath = "//div//input[@type=\"password\"]")
    WebElement txtpass;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement txtrepass;

    @FindBy(id = "aceptTerms")
    WebElement aceptar;

    @FindBy(xpath = "//div//a[@class='send btn-primary-default']")
    WebElement btnregistrar;

    @FindBy(xpath = "//div[@id='__layout']//section[@class='registro']/div[@class='right']/div[@class='Formulario']/div[@class='container']//form[@class='admin-form register-form']//select/option[@value='ce']")
    WebElement txtce;

    WebDriver driver;

    public RegistroPageFC(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterlinkregistrate() {
        registrate.click();
    }

    public void enterseleccionarce() {
        registrate.click();
    }

    public void entertxtce() {
        txtce.click();
    }

    public void seleccionarce() {
        registrate.click();
    }

    public void enterDocumento(String documento) {
        txtdocumento.sendKeys(documento);
    }

    public void enterPhone(String fono) {
        txtphone.sendKeys(fono);
    }

    public void enterEmail(String mail) {
        txtemail.sendKeys(mail);
    }
    public void entertxtpass(String pass) {
        txtpass.sendKeys(pass);
    }
    public void entertxtrepass(String repass) {
        txtrepass.sendKeys(repass);
    }

    public void enteraceptar() {
        aceptar.click();
    }

    public void enterbtnregistrar() {
        btnregistrar.click();
    }

}
