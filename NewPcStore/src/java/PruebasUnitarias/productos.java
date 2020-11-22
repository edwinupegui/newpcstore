
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class productos {
    WebDriver driver;
    By producto = By.cssSelector("#cart_items > div > div.table-responsive.cart_info > table > tbody > tr:nth-child(52) > td:nth-child(2)");
    
    public productos(WebDriver driver){

        this.driver = driver;

    }

    public String productoCreado(){
         return driver.findElement(producto).getAttribute("value");
    }

         
}