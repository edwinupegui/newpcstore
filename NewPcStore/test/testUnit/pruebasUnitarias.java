/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testUnit;

import Modelo.Usuario;
import servidorescontrolador.Ingreso;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edwin
 */
public class pruebasUnitarias {
    Ingreso userIng;
    Ingreso userAdmin;
    Ingreso userCliente;
    
    
    public pruebasUnitarias() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void validacionUsuario() {
        
        userIng = new Ingreso();
        
        String Email = "edwin100@gmail.com";
        String Password = "123456789";

        
        boolean esperado = true;
        boolean resultado = userIng.ValidarUsuario(Email, Password);
        assertEquals(esperado, resultado);
  
    }
    @Test
    public void validacionRolAdmin() {
        
        userAdmin = new Ingreso();
        
        String Email = "edwin100@gmail.com";
        String Password = "123456789";

        
        boolean esperado = true;
        boolean resultado = userAdmin.ValidarTipoUsuario(Email, Password);
        assertEquals(esperado, resultado);
  
    }
    @Test
    public void validacionRolCliente() {
        
        userCliente = new Ingreso();
        
        String Email = "pp@gmail.com";
        String Password = "123456789";

        
        boolean esperado = false;
        boolean resultado = userCliente.ValidarTipoUsuario(Email, Password);
        assertEquals(esperado, resultado);
    }
}
