/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testUnit;


import PruebasUnitarias.crear;
import PruebasUnitarias.crearProducto;
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
import PruebasUnitarias.productos;
import PruebasUnitarias.usuarios;

/**
 *
 * @author edwin
 */
public class testProductos {
    private static WebDriver driver = null;
    login ingreso;
    menu menu;
    listar listar;
    ingresoCrear crear;
    crearProducto registrar;
    productos producto;
    
    public testProductos() {
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
        assertEquals("Validar botón administrar", "INVENTARIO", menu.validarInventarios());
        menu.clickInventario();
        
        // pruebas ingreso de listar los usuarios registrados
        listar = new listar (driver);
        assertEquals("Validar botón listar", "Listar", listar.validarListar());
        listar.clickListar();
        
        // pruebas ingreso de ingreso a la opción de crear
        crear = new ingresoCrear (driver);
        crear.clickCrear();
        
        // prueba crear usuario
        String userId = "58";
        String referencia = "fx4323";
        String serial = "HDYS483998";
        String perfil = "Corporativo";
        String precio = "2300000";
        String cantidad = "10";
        registrar = new crearProducto (driver);
        registrar.crearProducto(userId, referencia, serial, perfil, precio, cantidad);
        
        producto = new productos (driver);
        assertEquals("Validar producto creado", "referencia", producto.productoCreado());
             
   }
   
}
