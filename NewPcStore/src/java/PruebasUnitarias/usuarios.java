
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class usuarios {
    WebDriver driver;
    By usuario = By.cssSelector("#cart_items > div > div.table-responsive.cart_info > table > tbody > tr:nth-child(9) > td:nth-child(2)");
    
    public usuarios(WebDriver driver){

        this.driver = driver;

    }

   
    public String usuarioCreado(){
         return driver.findElement(usuario).getAttribute("value");
    }

         
}
