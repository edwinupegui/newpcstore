	
package servidorescontrolador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ingreso extends HttpServlet {

 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        String pagina = request.getParameter("pagina");
        
        if(pagina.equals("login")){
            
            String ParametroEmail = request.getParameter("email");
            String ParametroPassword = request.getParameter("password");
            
            
            if(ValidarUsuario(ParametroEmail, ParametroPassword) == true){
                
                if(ValidarTipoUsuario(ParametroEmail, ParametroPassword) == true){
                    RequestDispatcher despachador = request.getRequestDispatcher("administrador.jsp");
                    despachador.forward(request, response);
                    
                }else if(ValidarTipoUsuario(ParametroEmail, ParametroPassword) == false){
                    
                    RequestDispatcher despachador = request.getRequestDispatcher("indexRecomendador.jsp");
                    despachador.forward(request, response);   
                }
                 
            }else{
                    
                RequestDispatcher despachador = request.getRequestDispatcher("login.jsp");
                despachador.forward(request, response);
            }
            
            
            
        }
    }

    
    private boolean ValidarUsuario(String ParametroEmail, String ParametroPassword) {
        
        System.out.println("ingreso al metodo acceder");
        boolean validar = false;  

        try {
            Conexion obj = new Conexion();
            Connection con = obj.getConnection();
            Statement consulta = con.createStatement();
                     
            
            consulta = Conexion.getConnection().createStatement();
            
            ResultSet resultado = consulta.executeQuery("SELECT CORREO, CONTRASEÑA FROM USUARIOS WHERE "+
                    "CORREO = '" + ParametroEmail + "' AND CONTRASEÑA = '" + ParametroPassword + "' ");
            
            if(resultado.next() == true){
                System.out.println("Ingreso exitoso");
                validar = true;
                
                                
            }else{
                System.out.println("USUARIO Y/O CONTRASEÑA INVALIDA");
                validar = false;
                
            }
            resultado.close();
            con.close();
          
        } catch (SQLException ex) {
            System.out.println("ocurrio un error al ingresar");
            
        }
        
        return validar;
    }
    
    
    private boolean ValidarTipoUsuario(String ParametroEmail, String ParametroPassword) {
        
        System.out.println("ingreso al metodo tipo de usuario");
        boolean validar = false;  

        try {
            Conexion obj = new Conexion();
            Connection con = obj.getConnection();
            Statement consulta = con.createStatement();
                     
            
            consulta = Conexion.getConnection().createStatement();
            
            ResultSet resultadoRolAdmin = consulta.executeQuery("SELECT CORREO, ROL_ID FROM USUARIOS WHERE "+
                    "CORREO = '" + ParametroEmail + "' AND ROL_ID = '" + "1'");
            
            if(resultadoRolAdmin.next() == true){
                System.out.println("Ingreso exitoso del admin");
                validar = true;
                
                                
            }else{
                System.out.println("Ingreso exitoso del invitado");
                validar = false;
                
            }
            resultadoRolAdmin.close();
            con.close();
          
        } catch (SQLException ex) {
            System.out.println("ocurrio un error al ingresar al tipo de usuario");
            
        }
        
        return validar;
    }



}
