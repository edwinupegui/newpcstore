

function esVacio(str){
    return (!str || str.length === 0);   
}

function stringVacio(str){
    return(!str || /^\s*$/.test(str));   
}

function validar(){
    
    var estado = true;
    
    var tiempo = 2000;
    
    //validar ingreso
    
    var email = document.querySelector('[name=email]').value;
    if(esVacio(email) || stringVacio(email)){
        
        e = document.getElementById('email');
        e.style.visibility = 'visible';
        e.innerHTML = "Ingrese el Email!";
        e.style.left = 190+'px';
        e.style.top= 80+'px';
        setTimeout(function(){e.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    var password = document.querySelector('[name=password]').value;
    if(esVacio(password) || stringVacio(password)){
        
        e1 = document.getElementById('password');
        e1.style.visibility = 'visible';
        e1.innerHTML = "Ingrese la contraseña!";
        e1.style.left = 190+'px';
        e1.style.top= 130+'px';
        setTimeout(function(){
            e1.style.visibility = 'hidden'
        },tiempo);
        estado = false;
    }
    if(!esVacio(password) && password.length < 8){
        
        e2 = document.getElementById('password');
        e2.style.visibility = 'visible';
        e2.innerHTML = "min 8 caracteres!";
        e2.style.left = 190+'px';
        e2.style.top= 130+'px';
        setTimeout(function(){e2.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    return estado;
    
    
}

function validarRegistro(){
    
    var estado = true;
    
    var tiempo = 2000;
    
    // validar registrop
    var nombre = document.querySelector('[name=nombre]').value;
    if(esVacio(nombre) || stringVacio(nombre)){
        
        e3 = document.getElementById('nombre');
        e3.style.visibility = 'visible';
        e3.innerHTML = "Ingrese el nombre!";
        e3.style.left = 190+'px';
        e3.style.top= 80+'px';
        setTimeout(function(){e3.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    var apellido = document.querySelector('[name=apellido]').value;
    if(esVacio(apellido) || stringVacio(apellido)){
        
        e4 = document.getElementById('apellido');
        e4.style.visibility = 'visible';
        e4.innerHTML = "Ingrese el apellido!";
        e4.style.left = 190+'px';
        e4.style.top= 130+'px';
        setTimeout(function(){e4.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    var registrioEmail = document.querySelector('[name=registrioEmail]').value;
    if(esVacio(registrioEmail) || stringVacio(registrioEmail)){
        
        e5 = document.getElementById('registrioEmail');
        e5.style.visibility = 'visible';
        e5.innerHTML = "Ingrese el Email!";
        e5.style.left = 190+'px';
        e5.style.top= 180+'px';
        setTimeout(function(){e5.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    var registroPassword = document.querySelector('[name=registroPassword]').value;
    if(esVacio(registroPassword) || stringVacio(registroPassword)){
        
        e6 = document.getElementById('registroPassword');
        e6.style.visibility = 'visible';
        e6.innerHTML = "Ingrese la contraseña!";
        e6.style.left = 190+'px';
        e6.style.top= 230+'px';
        setTimeout(function(){e6.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    if(!esVacio(registroPassword) && registroPassword.length < 8){
        
        e7 = document.getElementById('registroPassword');
        e7.style.visibility = 'visible';
        e7.innerHTML = "min 8 caracteres!";
        e7.style.left = 190+'px';
        e7.style.top= 230+'px';
        setTimeout(function(){e7.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    var confirmarPassword = document.querySelector('[name=confirmarPassword]').value;
    if(esVacio(confirmarPassword) || stringVacio(confirmarPassword)){
        
        e8 = document.getElementById('confirmarPassword');
        e8.style.visibility = 'visible';
        e8.innerHTML = "Confirmar contraseña!";
        e8.style.left = 190+'px';
        e8.style.top= 280+'px';
        setTimeout(function(){e8.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    if(registroPassword !== confirmarPassword){
        
        e9 = document.getElementById('validar');
        e9.style.visibility = 'visible';
        e9.innerHTML = "Clave no coincide!";
        e9.style.left = 190+'px';
        e9.style.top= 280+'px';
        setTimeout(function(){e9.style.visibility = 'hidden'},tiempo);
        estado = false;
    }
    
    if(estado){
        
        e10 = document.getElementById('verificar');
        e10.style.visibility = 'visible';
        e10.style.height = 100 + 'px';
        e10.style.width = 320 + 'px';
        e10.innerHTML = " Ingreso correcto! ";
        setTimeout(function () {e10.style.visibility = 'hidden';}, 4000);
    }
    
    
    return estado;
    
}



