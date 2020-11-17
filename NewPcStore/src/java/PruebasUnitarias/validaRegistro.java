
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class validaRegistro {
    WebDriver driver;
    By usuario = By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > ul > li > a");
    
    public validaRegistro(WebDriver driver){

        this.driver = driver;

    }

   
    public String usuarioCreado(){
         return driver.findElement(usuario).getAttribute("value");
    }
    
}
