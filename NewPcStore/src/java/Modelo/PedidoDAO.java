/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author edwin
 */
public class PedidoDAO {
    
    Conexion c = new Conexion();
    Connection con = c.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    private String mensaje="";
    
    public String resgistrarPedido(Connection con , Usuario usu){
        PreparedStatement pst = null;
        String sql = "INSERT INTO USUARIOS (ID_USUARIO, NOMBRE, APELLIDO, CORREO, CONTRASEÑA, FECHA_INSCRIPCION, ROL_ID) "
                + "VALUES (USUARIO_SEQ.NEXTVAL,?,?,?,?,sysdate,?)";
        
        try {
            pst= con.prepareStatement(sql);
            pst.setString(1, usu.getNombre());
            pst.setString(2, usu.getApellido());
            pst.setString(3, usu.getCorreo());
            pst.setString(4, usu.getContrasena());
            pst.setInt(5, 2);
            mensaje = "Guardado correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo Guardar \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String modificarPedido(Connection con , Usuario usu){
        PreparedStatement pst = null;
        String sql = "UPDATE USUARIOS SET NOMBRE = ?, APELLIDO = ?, CORREO = ?, CONTRASEÑA = ?, ROL_ID = ?"+
                "WHERE ID_USUARIO = ?";
        
        try {
            pst= con.prepareStatement(sql);
            pst.setString(1, usu.getNombre());
            pst.setString(2, usu.getApellido());
            pst.setString(3, usu.getCorreo());
            pst.setString(4, usu.getContrasena());
            pst.setInt(5, 2);
            pst.setInt(6, usu.getId_usuario());
            mensaje = "Modificado correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo Modificar \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarPedido(Connection con , int id){
        PreparedStatement pst = null;
        String sql = "DELETE FROM USUARIOS WHERE ID_USUARIO = ?";
        
        try {
            pst= con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "Eliminado correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo eliminar \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public ArrayList<Pedido> listarPedidos(){
    System.out.println("si ingreso al metodo");

        ArrayList<Pedido>listarPedidos = new ArrayList<Pedido>();
        String sql = "SELECT ID_PEDIDO, USUARIO_ID, PRODUCTO_ID, CANTIDAD, PRECIO"
                + " FROM PEDIDOS" + " ORDER BY ID_PEDIDO";
            try {
                Conexion obj = new Conexion();
                Connection con = obj.getConnection();
                Statement consulta = con.createStatement();
                ResultSet rs = consulta.executeQuery(sql);   
            
                System.out.println(rs);
                while(rs.next()){
                    int id_pedido = (rs.getInt("ID_PEDIDO"));
                    int usuario_id =(rs.getInt("USUARIO_ID"));
                    int producto_id = (rs.getInt("PRODUCTO_ID"));
                    int cantidad = (rs.getInt("CANTIDAD"));
                    int precio = (rs.getInt("PRECIO"));
                    Pedido p = new Pedido(id_pedido, usuario_id, producto_id, cantidad, precio);
                    listarPedidos.add(p);
                    System.out.println(listarPedidos);
                }
            } catch (SQLException ex) {
                System.out.println("error " + ex.getMessage());
            }
            return listarPedidos;
            
        }
    public boolean agregar(Pedido P) throws SQLException {
        boolean resp = false;
        String sql="INSERT INTO PEDIDOS(ID_PEDIDO, USUARIO_ID, PRODUCTO_ID, CANTIDAD, PRECIO)"
                + "VALUES (?, ?, ?, ?, ?)";
         try {
            

            Conexion c = new Conexion();
            Connection con = c.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, P.getId_pedido());
            ps.setInt(2, P.getUsuario_id());
            ps.setInt(3, P.getProducto_id());
            ps.setInt(4, P.getCantidad());
            ps.setInt(5, P.getPrecio());
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
