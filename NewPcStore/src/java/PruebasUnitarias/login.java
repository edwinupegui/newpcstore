
package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author edwin
 */
public class login {
    WebDriver driver;
    By userName = By.name("email");
    By password = By.name("password");
    By signIn = By.name("enviar");

    public login (WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);

    }

    public void setPassword(String strPassWord){
        driver.findElement(password).sendKeys(strPassWord);

    }
    
    public void clickLogin(){

            driver.findElement(signIn).click();

    } 
    
    public void loginApplication(String userName, String password){

        //Fill user name

        this.setUserName(userName); // Paso 2

        //Fill password

        this.setPassword(password); // pase 3

        //Click Login button

        this.clickLogin();         // paso 4
    }





    
    
}
