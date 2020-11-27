/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testUnit;

import PruebasUnitarias.crear;
import PruebasUnitarias.ingresoCrear;
import PruebasUnitarias.registro;
import PruebasUnitarias.usuarios;
import PruebasUnitarias.validaRegistro;
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
import okio.Timeout;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author edwin
 */
public class testRegistro {
    private static WebDriver driver = null;
    registro registrar;
    validaRegistro validar;
    
    public testRegistro() {
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
    }

    @Test
    public void test() {
        
        // pruebas registro de los usuarios

        String userNama = "olga";
        String userLastName = "luz";
        String userMail = "cl@gmail.com";
        String password = "123456789";
        String ConfPassword = "123456789";
        registrar = new registro (driver);
        registrar.crearUsuario(userNama, userLastName, userMail, password, ConfPassword);
        
        
        validar = new validaRegistro (driver);
        assertEquals("Validar usuario creado", "iconoSalida", validar.usuarioCreado());
        
   }
}
