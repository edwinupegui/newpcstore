package servidorescontrolador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
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

/**
 *
 * @author Kevin Torres
 */
public class AdminUsuarios extends HttpServlet {

    UsuarioDAO dao = new UsuarioDAO();
    Usuario u = new Usuario();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminUsuarios</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminUsuarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");

        switch (accion) {
            case "Listar":
                ArrayList<Usuario> datos = dao.listarUsuarios();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("adminusuarios.jsp").forward(request, response);
                break;
            case "Crear":
                request.getRequestDispatcher("agregar.jsp").forward(request, response);
                break;
            case "Guardar":
                System.out.println("entro");

                try {
                    registrar(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            case "Editar":
                String ide = request.getParameter("id");
                Usuario u = dao.ListarID(ide);
                request.setAttribute("usuario", u);
                request.getRequestDispatcher("editar.jsp").forward(request, response);

                break;

            case "Eliminar":
                System.out.println("entro a eliminar ");
                request.getRequestDispatcher("eliminar.jsp").forward(request, response);

                break;

            case "Borrar":
                System.out.println("entro a Borrar");
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

            Usuario u = new Usuario(Integer.parseInt(request.getParameter("txtId")),
                    request.getParameter("txtNombre"), request.getParameter("txtApellido"),
                    request.getParameter("txtCorreo"), request.getParameter("txtContrasena"),
                    Integer.parseInt(request.getParameter("txtRol")));
            dao.agregar(u);
            request.getRequestDispatcher("AdminUsuarios?accion=Listar").forward(request, response);
        } catch (Exception e) {
            System.out.println("Error en servlet " + e.getMessage());
        }
    }

    private void buscarId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        Usuario u = dao.obtenerId(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("usuario", u);

        RequestDispatcher dispatcher = request.getRequestDispatcher("editar.jsp");
        dispatcher.forward(request, response);
    }

    private void editar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        Usuario u = new Usuario(Integer.parseInt(request.getParameter("txtId")),
                request.getParameter("txtNombre"), request.getParameter("txtApellido"),
                request.getParameter("txtCorreo"), request.getParameter("txtContrasena"),
                Integer.parseInt(request.getParameter("txtRol")));
        dao.actualizar(u);
        editar(request, response);
    }

}

    
