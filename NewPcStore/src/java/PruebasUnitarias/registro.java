
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author edwin
 */
public class registro {
    
    WebDriver driver;
    By userName = By.name("nombre");
    By userLastName = By.name("apellido");
    By userMail = By.name("registrioEmail");
    By password = By.name("registroPassword");
    By confPassword = By.name("confirmarPassword");
    By crear = By.cssSelector("#formularioregistro > input[type=submit]:nth-child(12)");

    public registro (WebDriver driver){
        this.driver = driver;
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
    public void setConfPassword(String ConfPassword){
        driver.findElement(confPassword).sendKeys(ConfPassword);

    }

    public void clickCrear(){

            driver.findElement(crear).click();

    } 
    
    public void crearUsuario(String userName, String userLastName, String userMail, String password, String confPassword){
        

        this.setUserName(userName);
        this.setUserLastName(userLastName);
        this.setUserMail(userMail);
        this.setPassword(password);
        this.setConfPassword(confPassword);
        this.clickCrear();        
    }
    
}
