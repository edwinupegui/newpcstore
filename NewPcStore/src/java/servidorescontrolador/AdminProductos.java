
package servidorescontrolador;

import Modelo.Pedido;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminProductos extends HttpServlet {
    
    ProductoDAO dao = new ProductoDAO();
    Producto u = new Producto();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminProductos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminProductos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            ProductoDAO dao = new ProductoDAO();
            Producto u = new Producto();
            String accion=request.getParameter("accion");
            
            switch (accion) {
                case "Listar":
                    ArrayList<Producto> datos = dao.listarProductos();
                    request.setAttribute("datos", datos);
                    RequestDispatcher rd = request.getRequestDispatcher("admininventario.jsp");
                    rd.forward(request, response);
                    break;
                case "Crear":
                    request.getRequestDispatcher("agregarProducto.jsp").forward(request, response);
                    break;
                    
                case "Guardar":
                    System.out.println("entro");
                        
                    try {
                        registrar(request,response);
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    break;
                case "Editar":
                    String ide = request.getParameter("id");
                    Pedido p = dao.ListarID(ide);
                    request.setAttribute("producto", p);
                    request.getRequestDispatcher("editar.jsp").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
        }
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        try {
            
        
        Producto p = new Producto(Integer.parseInt(request.getParameter("txtId")), 
                                   request.getParameter("txtReferencia"),request.getParameter("txtSerial"),
                                    request.getParameter("txtPerfil"), Integer.parseInt(request.getParameter("txtPrecio")),
                                    Integer.parseInt(request.getParameter("txtCantidad")));
        dao.agregar(p);
        request.getRequestDispatcher("AdminProductos?accion=Listar").forward(request,response);
        } catch (Exception e) {
            System.out.println("Error en servlet "+ e.getMessage());
        }
    }

}
