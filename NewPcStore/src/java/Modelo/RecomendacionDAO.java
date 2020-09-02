
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servidorescontrolador.Conexion;


public class RecomendacionDAO {
    
    
    Conexion c = new Conexion();
    Connection con = c.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    public ArrayList<Recomendacion> listarRecomendacion(String cliente, String equipo, String uso){
    System.out.println("si ingreso al metodo");

        ArrayList<Recomendacion>listarRecomendacion = new ArrayList<Recomendacion>();
        String sql ="SELECT EQUI.MODELO, EQUI.PERFIL_EQUIPO, EQUI.TIPO_EQUIPO, PER.PERFIL, EQUI.CARACTERISTICAS, EQUI.PRECIO\n" +
                    "FROM EQUIPOS EQUI INNER JOIN PERFIL_CLIENTES PER\n" +
                    "ON EQUI.PERFIL_CLIENTE_ID = PER.ID_PERFIL_CLIENTE\n" +
                    "WHERE EQUI.PERFIL_EQUIPO = ?  AND EQUI.TIPO_EQUIPO = ? AND PER.PERFIL = ?";
        
        
            try {
                Conexion obj = new Conexion();
                Connection con = obj.getConnection();
                PreparedStatement ps=null;
                
                ps=con.prepareStatement(sql);
                ps.setString(1, uso);
                ps.setString(2, equipo);
                ps.setString(3, cliente);
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    String  modelo = (rs.getString("MODELO"));
                    String  perfil_equipo = (rs.getString("PERFIL_EQUIPO"));
                    String tipo_equipo =(rs.getString("TIPO_EQUIPO"));
                    String  perfil_cliente = (rs.getString("PERFIL"));
                    String  caracteristicas = (rs.getString("CARACTERISTICAS"));
                    String precio =(rs.getString("PRECIO"));
                    System.out.println(modelo);
                    Recomendacion r = new Recomendacion(tipo_equipo, perfil_equipo, modelo, caracteristicas, perfil_cliente, precio);
                    listarRecomendacion.add(r);
                    System.out.println(listarRecomendacion);
                }
            } catch (SQLException ex) {
                System.out.println("error " + ex.getMessage());
            }
            return listarRecomendacion;
            
        }
    
}
