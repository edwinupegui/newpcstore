
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author edwin
 */
public class crearRecomendacion {
    WebDriver driver;

    By perfilCliente = By.cssSelector("#cliente");
    By tipoPc = By.cssSelector("#equipo");
    By perfilPc = By.cssSelector("#uso");
    By buscar = By.cssSelector("#form > div > div > div > div > top > form > input[type=submit]:nth-child(11)");

    public crearRecomendacion (WebDriver driver){
        this.driver = driver;
    }

    public void setPerfilCliente(String strPerfilCliente){
        driver.findElement(perfilCliente).sendKeys(strPerfilCliente);

    }

    public void setTipoPc(String strTipoPc){
        driver.findElement(tipoPc).sendKeys(strTipoPc);

    }
    
    public void setPerfilPc(String strPerfilPc){
        driver.findElement(perfilPc).sendKeys(strPerfilPc);
    }
    
    public void clickBuscar(){
        driver.findElement(buscar).click();
    } 
    
    public void crearRecomendacion(String perfilCliente, String tipoPc, String perfilPc){
        

        this.setPerfilCliente(perfilCliente);
        this.setTipoPc(tipoPc);
        this.setPerfilPc(perfilPc);
        this.clickBuscar();        
    }
 
}
