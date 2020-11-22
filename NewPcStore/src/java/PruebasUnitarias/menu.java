package PruebasUnitarias;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 *
 * @author edwin
 */
public class menu {
    
    WebDriver driver;
    By menuUsuarios = By.cssSelector("#form-admin > ul > li:nth-child(2) > a");
    By botonUsuarios = By.cssSelector("#form-admin > ul > li:nth-child(2) > a");
    By menuInventarios = By.cssSelector("#form-admin > ul > li:nth-child(3) > a");
    By botonInventario = By.cssSelector("#form-admin > ul > li:nth-child(3) > a");
    By menuRecomendador = By.cssSelector("#header > div.header-bottom > div > div > div.col-sm-9 > div.mainmenu.pull-left > ul > li:nth-child(3) > a");
    By botonRecomendador = By.cssSelector("#header > div.header-bottom > div > div > div.col-sm-9 > div.mainmenu.pull-left > ul > li:nth-child(3) > a");
    
   
    
    public menu(WebDriver driver){

        this.driver = driver;

    }    

    //Click on menu button

    public void clickUsuarios(){

            driver.findElement(menuUsuarios).click();
    } 
    public void clickInventario(){

            driver.findElement(menuInventarios).click();
    } 
    public void clickRecomendador(){

            driver.findElement(menuRecomendador).click();
    } 
    
    public String validarUsuarios(){
         return driver.findElement(botonUsuarios).getAttribute("value");
    }
    
    public String validarInventarios(){
         return driver.findElement(botonInventario).getAttribute("value");
    }
    
    public String validarRecomedador(){
         return driver.findElement(botonRecomendador).getAttribute("value");
    }
    
    public void menuUsuarios(){

        this.clickUsuarios();          
    }
    public void menuInventario(){

        this.clickInventario();          
    }
    public void menuRecomendador(){

        this.clickRecomendador();          
    }
    
    
}