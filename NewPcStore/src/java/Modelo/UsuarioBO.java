
package Modelo;

import java.sql.Connection;
import servidorescontrolador.Conexion;


public class UsuarioBO {
    
    private String mensaje = "";
    private UsuarioDAO edao = new UsuarioDAO();
    
    
    public String resgistrarUsuario(Usuario usu){
        Connection con = Conexion.getConnection();
        try {
            mensaje = edao.resgistrarUsuario(con, usu);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    
    public String eliminarUsuario(int id){
        Connection con = Conexion.getConnection();
        try {
            mensaje = edao.eliminarUsuario(con, id);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(con!=null){
                    con.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
  

    
    public void listarUsuario(){
    }
    
}
