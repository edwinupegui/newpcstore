
package Modelo;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import servidorescontrolador.Conexion;

public class ProductoDAO {
    
    Conexion c = new Conexion();
    Connection con = c.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    private String mensaje="";
    

    
    public ArrayList<Producto> listarProductos(){
    System.out.println("si ingreso al metodo");

        ArrayList<Producto>listarProductos = new ArrayList<Producto>();
        String sql = "SELECT ID_PRODUCTO, REFERENCIA, SERIAL, PERFIL, PRECIO, CANTIDAD"
                + " FROM PRODUCTOS" + " ORDER BY ID_PRODUCTO";
            try {
                Conexion obj = new Conexion();
                Connection con = obj.getConnection();
                Statement consulta = con.createStatement();
                ResultSet rs = consulta.executeQuery(sql);   
            
//            consulta = Conexion.getConnection().createStatement();
            
                System.out.println(rs);
                while(rs.next()){
                    int id_producto = (rs.getInt("ID_PRODUCTO"));
                    String referencia =(rs.getString("REFERENCIA"));
                    String serial= (rs.getString("SERIAL"));
                    String perfil = (rs.getString("PERFIL"));
                    int precio = (rs.getInt("PRECIO"));
                    int cantidad = (rs.getInt("CANTIDAD"));
                    Producto p = new Producto(id_producto, referencia, serial, perfil, precio, cantidad);
                    listarProductos.add(p);
                    System.out.println(listarProductos);
                }
            } catch (SQLException ex) {
                System.out.println("error " + ex.getMessage());
            }
            return listarProductos;
            
        }
    
    
    public boolean agregar(Producto p) throws SQLException {
        boolean resp = false;
        String sql="INSERT INTO PRODUCTOS(ID_PRODUCTO, REFERENCIA, SERIAL, PERFIL, PRECIO, CANTIDAD)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
         try {
            

            Conexion c = new Conexion();
            Connection con = c.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, p.getId_producto());
            ps.setString(2, p.getReferencia());
            ps.setString(3, p.getSerial());
            ps.setString(4, p.getPerfil());
            ps.setInt(5, p.getPrecio());
            ps.setInt(6, p.getCantidad());
            resp=ps.executeUpdate()>0;
            ps.close();
            con.close();
            System.out.println(ps);
            System.out.println(resp);
            
            } catch (Exception e) {
            System.out.println("error en metodo "+e.getMessage());
        }   
        
       return resp;
    }

    public Pedido ListarID(String ide) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    


    
}
