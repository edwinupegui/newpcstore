
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author edwin
 */
public class crearProducto {
    WebDriver driver;
    By userId = By.name("txtId");
    By referencia = By.name("txtReferencia");
    By serial = By.name("txtSerial");
    By perfil = By.name("txtPerfil");
    By precio = By.name("txtPrecio");
    By cantidad = By.name("txtCantidad");
    By crear = By.cssSelector("#form > div > div > div > div > div > form > input[type=submit]:nth-child(7)");

    public crearProducto (WebDriver driver){
        this.driver = driver;
    }
    public void setUserId(String strUserId){
        driver.findElement(userId).sendKeys(strUserId);

    }
    
    public void setReferencia(String strReferencia){
        driver.findElement(referencia).sendKeys(strReferencia);

    }
    
    public void setSerial(String strSerial){
        driver.findElement(serial).sendKeys(strSerial);

    }
    
    public void setPerfil(String strPerfil){
        driver.findElement(perfil).sendKeys(strPerfil);

    }
    
    public void setPrecio(String strPrecio){
        driver.findElement(precio).sendKeys(strPrecio);

    }
    public void setCantidad(String strCantidad){
        driver.findElement(cantidad).sendKeys(strCantidad);

    }

    public void clickCrear(){

            driver.findElement(crear).click();

    } 
    
    public void crearProducto(String userId, String referencia, String serial, String perfil, String precio, String cantidad){
        
        this.setUserId(userId);
        this.setReferencia(referencia);
        this.setSerial(serial);
        this.setPerfil(perfil);
        this.setPrecio(precio);
        this.setCantidad(cantidad);
        this.clickCrear();        
    }

    
}
