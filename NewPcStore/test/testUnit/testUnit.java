/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testUnit;


import PruebasUnitarias.crear;
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
import PruebasUnitarias.usuarios;

/**
 *
 * @author edwin
 */
public class testUnit {
    private static WebDriver driver = null;
    login ingreso;
    menu menu;
    listar listar;
    ingresoCrear crear;
    crear registrar;
    usuarios usuarios;
    
    public testUnit() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {
        String userName = "edwin100@gmail.com";
        String passWord = "123456789";
        ingreso = new login (driver);
        ingreso.loginApplication(userName, passWord);
        
        
        menu = new menu(driver);
        assertEquals("Validar botón administrar", "ADMINISTRAR", menu.validarAdministrar());
        menu.clickUsuarios();
        
        
        listar = new listar (driver);
        assertEquals("Validar botón listar", "Listar", listar.validarListar());
        listar.clickListar();
        
        
        crear = new ingresoCrear (driver);
        crear.clickCrear();
        

        String userId = "12";
        String userNamaN = "camila";
        String userLastName = "rua";
        String userMail = "cr@gmail.com";
        String password = "123456789";
        String rol = "2";
        registrar = new crear (driver);
        registrar.crearUsuario(userId, userNamaN, userLastName, userMail, password, rol);
        
        usuarios = new usuarios (driver);
        assertEquals("Validar usuario creado", "camila", usuarios.usuarioCreado());
        
       
   }


    
    ///uso de varios @test
    
    
}
