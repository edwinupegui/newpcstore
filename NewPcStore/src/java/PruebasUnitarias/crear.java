
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author edwin
 */
public class crear {
    WebDriver driver;
    By userId = By.name("txtId");
    By userName = By.name("txtNombre");
    By userLastName = By.name("txtApellido");
    By userMail = By.name("txtCorreo");
    By password = By.name("txtContrasena");
    By rol = By.name("txtRol");
    By crear = By.cssSelector("#form > div > div > div > div > div > form > input[type=submit]:nth-child(11)");

    public crear (WebDriver driver){
        this.driver = driver;
    }
    public void setUserId(String strUserId){
        driver.findElement(userId).sendKeys(strUserId);

    }
    
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);

    }
    
    public void setUserLastName(String strUserLastName){
        driver.findElement(userLastName).sendKeys(strUserLastName);

    }
    
    public void setUserMail(String strUserMail){
        driver.findElement(userMail).sendKeys(strUserMail);

    }
    
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);

    }
    public void setRol(String strRol){
        driver.findElement(rol).sendKeys(strRol);

    }

    public void clickCrear(){

            driver.findElement(crear).click();

    } 
    
    public void crearUsuario(String userId, String userName, String userLastName, String userMail, String password, String rol){
        
        this.setUserId(userId);
        this.setUserName(userName);
        this.setUserLastName(userLastName);
        this.setUserMail(userMail);
        this.setPassword(password);
        this.setRol(rol);
        this.clickCrear();        
    }








    
    
}
