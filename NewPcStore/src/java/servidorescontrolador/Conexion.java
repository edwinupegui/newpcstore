
package servidorescontrolador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static Connection con = null;
    private static String user="NEWPCSTORE";
    private static String pass="NEWPCSTORE";
    private static String url="jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(false);
            if(con!=null){
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Conexion Fallida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea");
        }
        return con;
    }
    
    public void desconexion(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error al Desconectar" + e.getMessage());
        }
        
    }
    
    public static void main(String[] args){
        Conexion c = new Conexion();
        c.getConnection();
    }

}
