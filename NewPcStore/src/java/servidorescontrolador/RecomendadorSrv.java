
package servidorescontrolador;

import Modelo.Recomendacion;
import Modelo.RecomendacionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RecomendadorSrv extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RecomendadorSrv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RecomendadorSrv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    RecomendacionDAO dao = new RecomendacionDAO();
    Recomendacion r = new Recomendacion();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String BtnRecomendador = request.getParameter("BtnRecomendador");
        if(BtnRecomendador.equals("Buscar")){
           String cliente = request.getParameter("cliente");
           String equipo = request.getParameter("equipo");
           String uso = request.getParameter("uso");
           
            System.out.println(cliente);
            System.out.println(equipo);
            System.out.println(uso);
            
            ArrayList<Recomendacion> datos = dao.listarRecomendacion(cliente, equipo, uso);
            request.setAttribute("datos", datos);
            request.getRequestDispatcher("recomendador.jsp").forward(request, response);
            
        }
        
        }
         
        
    


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
