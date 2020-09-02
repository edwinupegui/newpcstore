function cargarUsuarios(){
    formulario = document.getElementById("form-admin");
    formulario.action = "AdminUsuarios";
    formulario.method = "post";
    formulario.elements["pagina"].value = "usuarios";
    formulario.submit();
}


