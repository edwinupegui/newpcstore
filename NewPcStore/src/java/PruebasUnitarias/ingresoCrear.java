package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class ingresoCrear {
    
    WebDriver driver;
    By menuCrear = By.cssSelector("#cart_items > div > div.table-responsive.cart_info > form > input:nth-child(2)");
    
   
    
    public ingresoCrear(WebDriver driver){

        this.driver = driver;

    }    

    //Click on menu button

    public void clickCrear(){

            driver.findElement(menuCrear).click();

    }    
    public void menuCrear(){

        //Click menu button

        this.clickCrear();          
    }
    
    
}