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
            <h1>Actualizar Personas</h1>
            
        </div>
        <div>
            <form action="AdminUsuarios" method="POST">
                ID:<br>
                <input type="text" name="txtId" value="${usuario.id_usuario}"<br><br>
                NOMBRE:<br>
                <input type="text" name="txtNombre" value="${usuario.nombre}"<br><br>
                APELLIDO:<br>
                <input type="text" name="txtApellido" value="${usuario.apellido}"<br><br>
                CORREO:<br>
                <input type="text" name="txtCorreo" value="${usuario.correo}"<br><br>
                CONTRASEÑA:<br>
                <input type="text" name="txtContrasena" value="${usuario.contrasena}"<br><br>
                ROL_ID:<br>
                <input type="text" name="txtRol" value="${usuario.rol}"<br><br>
                <input type="submit" name="accion" value="Guardar">
            </form>
        </div>
    </center>
    </body>
</html>
