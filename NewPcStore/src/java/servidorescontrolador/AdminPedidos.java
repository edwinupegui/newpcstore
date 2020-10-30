
package servidorescontrolador;

import Modelo.Pedido;
import Modelo.PedidoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminPedidos extends HttpServlet {
            PedidoDAO dao = new PedidoDAO();
            Pedido p = new Pedido();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminPedidos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminPedidos at " + request.getContextPath() + "</h1>");
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
            PedidoDAO dao = new PedidoDAO();
            Pedido p = new Pedido();
            String accion=request.getParameter("accion");
            
            switch (accion) {
                case "Listar":
                    ArrayList<Pedido> datos = dao.listarPedidos();
                    request.setAttribute("datos", datos);
                    RequestDispatcher rd = request.getRequestDispatcher("pedido.jsp");
                    rd.forward(request, response);
                case "Crear":
                    request.getRequestDispatcher("agregarPedido.jsp").forward(request, response);
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
                    Pedido u = dao.ListarID(ide);
                    request.setAttribute("pedido", u);
                    request.getRequestDispatcher("editar.jsp").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
        }
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        try {
            
        
        Pedido p = new Pedido(Integer.parseInt(request.getParameter("txtId")), 
                                   Integer.parseInt(request.getParameter("txtUsuario_id")),Integer.parseInt(request.getParameter("txtProducto_id")),
                                    Integer.parseInt(request.getParameter("txtCantidad")), Integer.parseInt(request.getParameter("txtPrecio")));
        dao.agregar(p);
        request.getRequestDispatcher("AdminPedidos?accion=Listar").forward(request,response);
        } catch (Exception e) {
            System.out.println("Error en servlet "+ e.getMessage());
        }
    }

}
