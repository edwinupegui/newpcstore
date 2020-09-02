<%-- 
    Document   : agregar
    Created on : 2/07/2020, 08:29:05 PM
    Author     : Kevin Torres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <h1>Agregar Personas</h1>
            
        </div>
        <div>
            <form action="AdminUsuarios" method="POST">
                ID:<br>
                <input type="text" name="txtId"><br><br>
                
                <input type="submit" name="accion" value="Borrar">
            </form>
        </div>
    </center>
    </body>
</html>