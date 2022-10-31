package java.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpresarioPageFC {

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

    @FindBy(xpath = "//p[normalize-space()='Financiamiento']")
    WebElement opcfinanciamiento;

    @FindBy(xpath= "//p[normalize-space()='Factoring']")
    WebElement clfactoring;

    @FindBy(xpath = "//a[normalize-space()='Empresario']")
    WebElement clempresario;

    @FindBy(xpath = "//ul[@class='list']//a[normalize-space()='Vender facturas']")
    WebElement linkvenderfacturas;

    @FindBy(xpath = "//div//div//a[normalize-space()='Completar mis datos']")
    WebElement completardatos;

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

    @FindBy(css = "a[href='/app/empresario/completar-datos']")
    WebElement datosaqui;

    @FindBy(xpath = "//ul[@class='list']//a[normalize-space()='Vender facturas']")
    WebElement clickvenderfactura;

    @FindBy(xpath = "//a[normalize-space()='Completar mis datos']")
    WebElement completardatosempresarial;


    WebDriver driver;

    public EmpresarioPageFC(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void clickiniciasesion(){linkiniciarsesion.click();}
    public void enterUsername(String username) {
        txt_user.sendKeys(username);
    }
    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }
    public void clickiniciosesion(){btniniciarsesion.click();}
    public void clickfinannciamiento(){opcfinanciamiento.click();}
    public void clickfactoring(){clfactoring.click();}
    public void clickempresario(){clempresario.click();}
    public void venderfactura(){linkvenderfacturas.click();}
    public void completar(){completardatos.click();}
    public void ocupation(String ocupacion){txtocupacion.sendKeys(ocupacion);}
    public void ingresardepa(){departamento.click();}
    public void seleccdepart(){amazadepart.click();}
    public void ingresarprovin(){provincia.click();}
    public void seleccprov(){prov.click();}
    public void ingresardistrit(){distrito.click();}
    public void seleccdis(){dis.click();}
    public void ingresardireccion(String direccion){txtdireccion.sendKeys(direccion);}
    public void clickguardar(){btnguardar.click();}
    public void clickaceptar(){btnaceptar.click();}
    public void datosaqui(){datosaqui.click();}
    public void compldatos(){completardatosempresarial.click();}
    public void factura(){clickvenderfactura.click();}





}
