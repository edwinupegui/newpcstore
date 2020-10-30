
package servidorescontrolador;

import Modelo.Usuario;
import Modelo.UsuarioBO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registro extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Registro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String pagina = request.getParameter("pagina");
        
        if(pagina.equals("login")){
            
                
            String ParametroNombre = request.getParameter("nombre");
            String ParametroApellido= request.getParameter("apellido");
            String ParametroEmail= request.getParameter("registrioEmail");
            String ParametroPassword= request.getParameter("registroPassword");
            
            insertarDatos(ParametroNombre,ParametroApellido, ParametroEmail, ParametroPassword);
            
            
            
            RequestDispatcher despachador = request.getRequestDispatcher("indexRecomendador.jsp");
            despachador.forward(request, response);
            
        }else{
            processRequest(request, response);
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    

    UsuarioBO ebo = new UsuarioBO();
    Usuario usu = new Usuario();
    String mensaje = "";


    private void insertarDatos(String ParametroNombre, String ParametroApellido, String ParametroEmail, String ParametroPassword) {
        usu.setNombre(ParametroNombre);
        usu.setApellido(ParametroApellido);
        usu.setCorreo(ParametroEmail);
        usu.setContrasena(ParametroPassword);
        mensaje = ebo.resgistrarUsuario(usu);
        System.out.println(mensaje);
        
    }

    
}
