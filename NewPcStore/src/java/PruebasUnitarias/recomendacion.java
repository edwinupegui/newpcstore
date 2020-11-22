
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class recomendacion {
    WebDriver driver;
    By recomendacion = By.cssSelector("#form > div > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)");
    
    public recomendacion(WebDriver driver){
        this.driver = driver;
    }

   
    public String equipoRecomendado(){
         return driver.findElement(recomendacion).getAttribute("value");
    }

         
}