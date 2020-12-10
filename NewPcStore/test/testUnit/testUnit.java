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

    
    @Test
    public void test() {
        
        // pruebas ingreso de los usuarios
        String userName = "edwin100@gmail.com";
        String passWord = "123456789";
        ingreso = new login (driver);
        ingreso.loginApplication(userName, passWord);
        
        // pruebas ingreso al menu de administracion de usuarios
        menu = new menu(driver);
        assertEquals("Validar botón administrar", "USUARIOS", menu.validarUsuarios());
        menu.clickUsuarios();
        
        // pruebas ingreso de listar los usuarios registrados
        listar = new listar (driver);
        assertEquals("Validar botón listar", "Listar", listar.validarListar());
        listar.clickListar();
        
        // pruebas ingreso de ingreso a la opción de crear
        crear = new ingresoCrear (driver);
        crear.clickCrear();
        
        // prueba crear usuario
        String userId = "82";
        String userNamaN = "Manuela";
        String userLastName = "yepes";
        String userMail = "my@gmail.com";
        String password = "123456789";
        String rol = "1";
        registrar = new crear (driver);
        registrar.crearUsuario(userId, userNamaN, userLastName, userMail, password, rol);
        
        usuarios = new usuarios (driver);
        assertEquals("Validar usuario creado", "nombre", usuarios.usuarioCreado());
             
   }
   
}
