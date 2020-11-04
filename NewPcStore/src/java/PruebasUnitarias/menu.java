package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class menu {
    
    WebDriver driver;
    By menuUsuarios = By.cssSelector("#form-admin > ul > li:nth-child(3) > a");
    
   
    
    public menu(WebDriver driver){

        this.driver = driver;

    }    

    //Click on menu button

    public void clickUsuarios(){

            driver.findElement(menuUsuarios).click();

    }    
    public void menuUsuarios(){

        //Click menu button

        this.clickUsuarios();          
    }
    
    
}