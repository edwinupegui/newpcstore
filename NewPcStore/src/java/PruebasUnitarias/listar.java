package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class listar {
    
    WebDriver driver;
    By menuListar = By.cssSelector("#cart_items > div > div.table-responsive.cart_info > form > input:nth-child(1)");
    By botonListar = By.cssSelector("#cart_items > div > div.table-responsive.cart_info > form > input:nth-child(1)");
   
    
    public listar(WebDriver driver){

        this.driver = driver;

    }    

    //Click on menu button

    public void clickListar(){

            driver.findElement(menuListar).click();

    }    
    public String validarListar(){
         return driver.findElement(botonListar).getAttribute("value");
    }
    
    
    public void menuListar(){

        //Click menu button

        this.clickListar();          
    }
    
    
}