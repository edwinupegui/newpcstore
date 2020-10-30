<%-- 
    Document   : login
    Created on : 20/05/2020, 10:03:54 PM
    Author     : edwin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <!--meta dato que permite el manejo del teclado en espaÃ±ol-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!--meta dato que hace responsive la pagina-->
        <meta name="author" content="Edwin Upegui"><!--meta dato que define el autor-->
        <meta name="description" content="Pagina web para la tienda NewPCStore">
        <title>Login | NewPCStore</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    </head>
    <body>
        
        <header id="header"><!--header-->
            <div class="header_top"><!--header_superior-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="contactinfo">
                                <ul class="nav nav-pills">
                                    <li><a href="#"><i class="fa fa-phone"></i> +57 311 3634309</a></li>
                                    <li><a href="#"><i class="fa fa-envelope"></i> newpcstoresas@gmail.com</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="social-icons pull-right">
                                <ul class="nav navbar-nav">
                                    <li><a target="_blank" href="https://www.facebook.com/Newpcstore-SAS-106480394292396/"> <i class="fa fa-facebook"></i></a></li>
                                    <li><a target="_blank" href="https://twitter.com/home"><i class="fa fa-twitter"></i></a></li>
                                    <li><a target="_blank" href="https://www.linkedin.com/feed/?trk=onboarding-landing"><i class="fa fa-linkedin"></i></a></li>
                                    <li><a target="_blank" href="https://www.instagram.com/?hl=es-la"><i class="fa fa-instagram"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header_superior-->
            <div class="header-middle"><!--header-intermedio-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="logo pull-left">
                                <a href="index.jsp"><img src="images/home/logo.png" alt="logo de la tienda NewPCStore" /></a>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="shop-menu pull-right">
                                <ul class="nav navbar-nav">
                                    <!---<li><a href="404.jsp"><i class="fa fa-user"></i> Contactenos</a></li>--->
                                    <li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Carrito</a></li>
                                    <li><a href="login.jsp"><i class="fa fa-lock"></i> Login</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-intermedio-->
        </header><!--/header-->

        <section id="form"><!--form-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-4 col-sm-offset-1">
                        <div class="login-form"><!--login form-->
                            <h2>Ingrese a su cuenta!</h2>
                            <form id="formularioingreso" method="POST" action="Ingreso" onsubmit="return validar()">

                                <input type="email" name="email" placeholder="Correo electrónico" />
                                <span id="email" class="errores">texto</span>

                                <input type="password" name="password" placeholder="Contraseña"/>
                                <span id="password" class="errores">texto</span>

                                <span>
                                    <input type="checkbox" class="checkbox"> Mantener la sesion abierta
                                </span>

                                <input type="submit" name="enviar" value="Iniciar sesión"/>
                                <input type="hidden" name="pagina" value="login"/>
                                
                                <span id="verificar" class="errores1">text</span>

                            </form>

                            <%
                                String respuesta = (String) request.getAttribute("respuesta");

                                if (respuesta != null) {
                            %>
                            <script>

                                function validarLogin(respuesta) {
                                    e = document.getElementById('verificar');
                                    e.style.visibility = 'visible';
                                    e.style.height = 100 + 'px';
                                    e.style.width = 320 + 'px';

                                    if (respuesta === 'Incorrecto') {
                                        e.innerHTML = " Contraseña Invalida </br> \n\ Usuario Invalido </br> \n\ Intente de nuevo !";
                                         
                                    }else if(respuesta === 'usuario-incorrecto' ){
                                        e.innerHTML = " Usuario invalido </br> intente de nuevo! ";
                                        
                                    }else if(respuesta === 'password-incorrecto' ){
                                        e.innerHTML = " Contraseña invalida </br> intente de nuevo! ";
                                        
                                    }
                                    ;

                                    setTimeout(function () {e.style.visibility = 'hidden';}, 4000);
                                }
                                ;
                                
                                validarLogin('<%=respuesta%>')
                            </script>
                            <%                                }
                            %>
                        </div><!--/login form-->
                    </div>
                    <div class="col-sm-1">
                        <h2 class="or">O</h2>
                    </div>
                    <div class="col-sm-4">
                        <div class="signup-form"><!--sign up form-->
                            <h2>Registrarse!</h2>

                            <form id="formularioregistro" method="post" action="Registro" onsubmit="return validarRegistro()">

                                <input type="text" name="nombre" placeholder="Nombre"/>
                                <span id="nombre" class="errores">texto</span>

                                <input type="text" name="apellido" placeholder="Apellido"/>
                                <span id="apellido" class="errores">texto</span>

                                <input type="email" name="registrioEmail" placeholder="Correo electronico"/>
                                <span id="registrioEmail" class="errores">texto</span>

                                <input type="password" name ="registroPassword" placeholder="Contraseña"/>
                                <span id="registroPassword" class="errores">texto</span>

                                <input type="password" name="confirmarPassword" placeholder="Confirmar contraseña"/>
                                <span id="confirmarPassword" class="errores">texto</span>

                                <span>
                                    <input type="checkbox" class="checkbox"> 
                                    Acepto recibir comunicaciones de NewPCStore y entiendo que mis datos no se compartirán.
                                </span>

                                <input type="submit" name="enviar" value="Registrar">
                                <input type="reset" name="reset" value="Reiniciar">
                                <input type="hidden" name="pagina" value="login">

                                <span id="validar" class="errores">text</span>

                            </form>
                        </div><!--/sign up form-->
                    </div>
                </div>
            </div>
        </section><!--/form-->
        <footer id="footer"><!--Footer-->
            <div class="footer-top">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-2">
                            <div class="companyinfo">
                                <h2><span>New</span>PCStore</h2>
                                <p>Tienda de equipos de computo especializada en productos de la marca lenovo.</p>
                            </div>
                        </div>
                        <div class="footer-widget">
                            <div class="container">
                                <div class="row">
                                    <div class="col-sm-2">
                                        <div class="single-widget">
                                            <h2>Servicios</h2>
                                            <ul class="nav nav-pills nav-stacked">
                                                <li><a href="#">Ayuda online</a></li>
                                                <li><a href="#">Contactanos</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="col-sm-2">
                                        <div class="single-widget">
                                            <h2>Qué comprar?</h2>
                                            <ul class="nav nav-pills nav-stacked">
                                                <li><a href="#">Portatiles</a></li>
                                                <li><a href="#">Equipos de mesa</a></li>
                                                <li><a href="#">accesorios</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="col-sm-2">
                                        <div class="single-widget">
                                            <h2>Politicas</h2>
                                            <ul class="nav nav-pills nav-stacked">
                                                <li><a href="#">Politicas de privacidad</a></li>
                                                <li><a href="#">Politicas de uso</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer><!--/Footer-->
        <div class="footer-bottom">
            <div class="container">
                <div class="row">
                    <p class="pull-left">Copyright © 2020 NewPCStore S.A.S Todos los derechos reservados.</p>
                    <p class="pull-right">Se toma como referencia las imagenes de la pagina oficial de: <span><a target="_blank" href="https://www.lenovo.com"> LENOVO</a></span></p>
                </div>
            </div>
        </div>

        <script src="js/jquery.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
        <script src="js/validaciones.js"></script>


    </body>
</html>