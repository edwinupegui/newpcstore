/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testUnit;


import PruebasUnitarias.crear;
import PruebasUnitarias.crearRecomendacion;
import PruebasUnitarias.ingresoCrear;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


import PruebasUnitarias.login;
import PruebasUnitarias.menu;
import PruebasUnitarias.listar;
import PruebasUnitarias.recomendacion;
import PruebasUnitarias.usuarios;

/**
 *
 * @author edwin
 */
public class testRecomendador {
    private static WebDriver driver = null;
    login ingreso;
    menu menu;
    crearRecomendacion recomendar;
    recomendacion equipoRecomendado;
    
    public testRecomendador() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        driver.get("http://localhost:8084/NewPcStore/login.jsp"); 
                
                
    }
    
    @After
    public void tearDown() {
       // driver.quit()
    }

    
    @Test
    public void test() {
        
        // pruebas ingreso de los usuarios
        String userName = "pp@gmail.com";
        String passWord = "123456789";
        ingreso = new login (driver);
        ingreso.loginApplication(userName, passWord);
        
        // pruebas ingreso al menu de recomendador
        menu = new menu(driver);
        assertEquals("Validar botón recomendador", "RECOMENDADOR", menu.validarRecomedador());
        menu.clickRecomendador();

        
        // buscar recomendacion    
        
        String perfilCliente = "EMPRESARIO";
        String tipoPc = "PORTATIL";
        String perfilPc = "CORPORATIVO";

        recomendar = new crearRecomendacion (driver);
        recomendar.crearRecomendacion(perfilCliente, tipoPc, perfilPc);
        
        equipoRecomendado = new recomendacion (driver);
        assertEquals("Validar usuario creado", "resultadoRecomendacion", equipoRecomendado.equipoRecomendado());
             
   }
   
}
