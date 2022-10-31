package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InversionistaPageFC
{

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
    WebElement enlaceinversionista;

    @FindBy(xpath = "//a[normalize-space()='Oportunidades']")
    WebElement enlaceoportunidades;

    @FindBy(xpath = "//a[normalize-space()='Completar mis datos']")
    WebElement enlacecompletardatos;

    @FindBy(xpath = "//input[@data-qa='ocupation']")
    WebElement txtocupacion;

    @FindBy(xpath = "//select[@placeholder='Selecciona el departamento']")
    WebElement departamento;

    @FindBy(xpath = "//option[normalize-space()='AMAZONAS']")
    WebElement amazadepart;

    @FindBy(xpath = "//select[@placeholder='Selecciona la provincia']")
    WebElement provincia;

    @FindBy(xpath = "//select[@placeholder='Selecciona la provincia']//option[@value='01'][normalize-space()='CHACHAPOYAS']")
    WebElement prov;

    @FindBy(xpath = "//select[@placeholder='Selecciona el distrito']")
    WebElement distrito;

    @FindBy(xpath = "//select[@placeholder='Selecciona el distrito']//option[@value='01'][normalize-space()='CHACHAPOYAS']")
    WebElement dis;

    @FindBy(xpath = "//input[@data-qa='address']")
    WebElement txtdireccion;

    @FindBy(xpath = "//a[normalize-space()='Guardar']")
    WebElement btnguardar;

    @FindBy(xpath = "//button[normalize-space()='Aceptar']")
    WebElement btnaceptar;

    @FindBy(xpath = "//a[@data-qa='button-show-panel-invest']")
    WebElement btninvertir;

    @FindBy(xpath = "//input[@data-qa='address']")
    WebElement txtdirec;

    @FindBy(xpath = "//a[@data-qa='button-step-one']")
    WebElement btnccontinuar;

    @FindBy(xpath = "//input[@aria-label='Subir imagen']")
    WebElement btnsubirimagen;

    @FindBy(xpath = "(//input[@aria-label='Subir imagen'])[2]")
    WebElement btnsubirimagen2;

    @FindBy(xpath = "//input[@id='aceptContract']")
    WebElement checkaceptar;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/main/div/div/div/div[2]/div/div[3]/div/div[5]/div[1]/a")
    WebElement btnpaso2;

    @FindBy(xpath = "//a[@data-qa='button-step-two']")
    WebElement btnccontinuar2;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/main/div/div/div/div[2]/div/div[3]/div/div[5]/div[2]/a")
    WebElement btnatras;

    @FindBy(xpath = "//div[normalize-space()='4,051']")
    WebElement montosoles;


    WebDriver driver;


    public InversionistaPageFC(WebDriver driver){

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

    public void enterbtniciosesion(){
        btniniciarsesion.click();
    }

    public void linkinversionista(){
        enlaceinversionista.click();
    }

    public void linkoportunidades(){
        enlaceoportunidades.click();
    }

    public void linkcompletardatos(){
        enlacecompletardatos.click();
    }

    public void ocupation(String ocupacion){txtocupacion.sendKeys(ocupacion);}
    public void ingresardepa(){departamento.click();}
    public void seleccdepart(){amazadepart.click();}
    public void ingresarprovin(){provincia.click();}
    public void seleccprov(){prov.click();}
    public void ingresardistrit(){distrito.click();}
    public void seleccdis(){dis.click();}
    public void ingresardireccion(String direccion){txtdireccion.sendKeys(direccion);}
    public void clickguardar(){btnguardar.click();}
    public void clickbtninvertir(){btninvertir.click();}
    public void clicktxtdirec(){txtdirec.click();}
    public void clicbtnccontinuar(){btnccontinuar.click();}
    public void enterbtnsubirimagen(){
        btnsubirimagen.sendKeys("/Users/hd/Documents/Prestapyme/imagenpng.jpg");
    }
    public void enterbtnsubirimagen2(){
        btnsubirimagen2.sendKeys("/Users/hd/Documents/Prestapyme/imagenpng.jpg");
    }
    public void enterbtnaceptar(){checkaceptar.click();}
    //public void enterbtnpaso2(){btnpaso2.click();}
    public void clicbtnccontinuar2(){btnccontinuar2.click();}
    public void enterbtnatras(){btnatras.click();}

    public void entermontosoles(){montosoles.click();}
}
