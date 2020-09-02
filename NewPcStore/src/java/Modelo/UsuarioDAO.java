
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


public class UsuarioDAO {
    
    Conexion c = new Conexion();
    Connection con = c.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    private String mensaje="";
    
    public String resgistrarUsuario(Connection con , Usuario usu){
        String sql = "INSERT INTO USUARIOS (ID_USUARIO, NOMBRE, APELLIDO, CORREO, CONTRASEÑA, FECHA_INSCRIPCION, ROL_ID) "
                + "VALUES (USUARIO_SEQ.NEXTVAL,?,?,?,?,sysdate,?)";
        
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setString(3, usu.getCorreo());
            ps.setString(4, usu.getContrasena());
            ps.setInt(5, 2);
            mensaje = "Guardado correctamente";
            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo Guardar \n" + e.getMessage();
        }
        return mensaje;
    }
    
    public Usuario obtenerId(int id)throws SQLException{
        String sql = "SELECT ID_USUARIO, NOMBRE, APELLIDO, CORREO, CONTRASEÑA, ROL_ID"+
                "WHERE ID_USUARIO =?";
        Usuario u = new Usuario();
        
            con=c.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id );
            rs=ps.executeQuery(sql);
            if(rs.next()){
                u.setId_usuario(rs.getInt("ID_USUARIO"));
                u.setNombre(rs.getString("NOMBRE"));
                u.setApellido(rs.getString("APELLIDO"));
                u.setCorreo(rs.getString("CORREO"));
                u.setContrasena(rs.getString("CONTRASEÑA"));
                u.setrol(rs.getInt("ROL_ID"));
                System.out.println(u);
            }

            ps.execute();
            ps.close();
            return u;
    }
    
    public boolean actualizar(Usuario u) throws SQLException{
        boolean resp=false;
        String sql="UPDATE USUARIOS SET NOMBRE=?, APELLIDO=?, CORREO=?, CONTRASEÑA=?, ROL_ID=?"
                + "WHERE ID_USUARIO=?";
            con=c.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getCorreo());
            ps.setString(4, u.getCorreo());
            ps.setInt(5, u.getrol());
            resp=ps.executeUpdate()>0;
            ps.close();
            con.close();
            return resp;
    }
    
    public String eliminarUsuario(Connection con , int id){
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
    
    public ArrayList<Usuario> listarUsuarios(){
    System.out.println("si ingreso al metodo");

        ArrayList<Usuario>listarUsuarios = new ArrayList<Usuario>();
        String sql = "SELECT ID_USUARIO, NOMBRE, APELLIDO, CORREO, CONTRASEÑA, ROL_ID"
                + " FROM USUARIOS" + " ORDER BY ID_USUARIO";
            try {
                Conexion obj = new Conexion();
                Connection con = obj.getConnection();
                Statement consulta = con.createStatement();
                rs = consulta.executeQuery(sql);   
            
            
                System.out.println(rs);
                while(rs.next()){
                    int id_usuario = (rs.getInt("ID_USUARIO"));
                    String nombre =(rs.getString("NOMBRE"));
                    String apellido = (rs.getString("APELLIDO"));
                    String correo = (rs.getString("CORREO"));
                    String contrasena = (rs.getString("CONTRASEÑA"));
                    int rol = (rs.getInt("ROL_ID"));
                    Usuario u = new Usuario(id_usuario, nombre, apellido, correo, contrasena, rol);
                    listarUsuarios.add(u);
                    System.out.println(listarUsuarios);
                }
            } catch (SQLException ex) {
                System.out.println("error " + ex.getMessage());
            }
            return listarUsuarios;
            
        }
    
    public boolean agregar(Usuario u) throws SQLException {
        boolean resp = false;
        String sql="INSERT INTO USUARIOS(ID_USUARIO, NOMBRE, APELLIDO, CORREO, CONTRASEÑA, ROL_ID)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
         try {
            

            Conexion c = new Conexion();
            Connection con = c.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, u.getId_usuario());
            ps.setString(2, u.getNombre());
            ps.setString(3, u.getApellido());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getContrasena());
            ps.setInt(6, u.getrol());
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
    
    public Usuario ListarID(String id){
        String sql = "SELECT NOMBRE, APELLIDO, CORREO, CONTRASEÑA, ROL_ID FROM USUARIOS" +
                "WHERE ID_USUARIO ="+id;
        Usuario u = new Usuario();
        try {
            Conexion c = new Conexion();
            Connection con = c.getConnection();
            
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                u.setNombre(rs.getString("NOMBRE"));
                u.setApellido(rs.getString("APELLIDO"));
                u.setCorreo(rs.getString("CORREO"));
                u.setrol(rs.getInt("ROL_ID"));
            }
                    
        } catch (Exception e) {
        }
        return u;
    }
    
        public int act(Usuario u) throws SQLException{
        int resp=0;
        String sql="UPDATE USUARIOS SET NOMBRE=?, APELLIDO=?, CORREO=?, CONTRASEÑA=?, ROL_ID=?"
                + "WHERE ID_USUARIO=?";
            try {
                
            
                con=c.getConnection();
                ps=con.prepareStatement(sql);
                ps.setString(1, u.getNombre());
                ps.setString(2, u.getApellido());
                ps.setString(3, u.getCorreo());
                ps.setString(4, u.getCorreo());
                ps.setInt(5, u.getrol());
                ps.setInt(6, u.getId_usuario());
                resp=ps.executeUpdate();
                ps.close();
                con.close();
                if(resp==1){
                    resp=1;
                }else{
                    resp=0;
                }
            } catch (Exception e) {
                System.out.println("error en el metodo act "+e.getMessage());
            }
            
            return resp;
    }
    
        
}
