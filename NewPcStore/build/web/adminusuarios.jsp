<%-- 
    Document   : adminusuarios
    Created on : 20/05/2020, 10:03:54 PM
    Author     : edwin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Usuario"%>
<%@page import="Modelo.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" 
          uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <!--meta dato que permite el manejo del teclado en espaÃ±ol-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!--meta dato que hace responsive la pagina-->
        <meta name="author" content="Edwin Upegui"><!--meta dato que define el autor-->
        <meta name="description" content="Pagina web para la tienda NewPCStore">
        <title>Home | NewPCStore</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
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
                                <a href="administrador.jsp"><img src="images/home/logo.png" alt="logo de la tienda NewPCStore" /></a>
                            </div>

                        </div>
                        <div class="col-sm-8">
                            <div class="shop-menu pull-right">
                                <ul class="nav navbar-nav">
                                    <!--<li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Carrito</a></li>-->
                                    <li><a href="index.jsp"><img src="images/home/logout.png"/></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-intermedio-->
            <div class="header-bottom"><!--header-bottom-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-9">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button> 
                            </div>
                            <div class="mainmenu pull-left">
                                <ul class="nav navbar-nav collapse navbar-collapse">
                                    <li><a href="administrador.jsp" class="active">INICIO</a></li>
                                    <!----<li class="dropdown"><a href="#">TIENDA<i class="fa fa-angle-down"></i></a>
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="shop.html">Computadores</a></li>
                                            <li><a href="product-details.html">PerifÃ©ricos</a></li> 
                                            <li><a href="cart.html">Carrito</a></li>
                                        </ul>--->
                                    </li> 
                                    <li class="dropdown"><a href="#">ADMINISTRADOR<i class="fa fa-angle-down"></i></a>
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="adminusuarios.jsp">Usuarios</a></li>
                                            <li><a href="admininventario.jsp">Inventario</a></li>
                                            <li><a href="pedido.jsp">Pedidos</a></li>
                                        </ul>
                                    </li>
                                    <!---<li><a href="404.html">RECOMENDADOR</a></li>--->
                                    <!---<li><a href="contact-us.html">QUIENES SOMOS</a></li>--->
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="search_box pull-right">
                                <input type="text" placeholder="buscar"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-bottom-->
        </header><!--/header-->
        <section id="cart_items">
            <div class="container">
                <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="administrador.jsp">Inicio</a></li>
                        <li class="active">NewPCStore Admin Usuarios</li>
                    </ol>
                </div>
                <div class="table-responsive cart_info">


                    <form method="POST" action="AdminUsuarios">
                        <input class ="btn btn-default update" type="submit" name="accion" value="Listar">
                        <input class ="btn btn-default update" type="submit" name="accion" value="Crear">
                    </form>
                    <table class="table table-condensed">
                        <thead>
                            <tr class="cart_menu">
                                <td class="total">ID USUARIO</td>
                                <td class="total">NOMBRES</td>
                                <td class="total">APELLIDO</td>
                                <td class="total">CORREO</td>
                                <td class="total">CONTRASEÑA</td>
                                <td class="total">ROL</td>
                                <td class="total">ACCIONES</td>
                                <td></td>
                            </tr>
                        </thead>
                        <tbody>
                            <%ArrayList<Usuario> datos = (ArrayList<Usuario>) request.getAttribute("datos");%>

                            <c:forEach var="dato" items="${datos}">
                                <tr> 
                                    <td>${dato.id_usuario}</td>
                                    <td>${dato.getNombre()}</td>
                                    <td>${dato.getApellido()}</td>
                                    <td>${dato.getCorreo()}</td>
                                    <td>${dato.getContrasena()}</td>
                                    <td>${dato.getrol()}</td>
                                    <td>
                                        <form action="AdminUsuarios" method="post">
                                            <input type="hidden" name="id" value="${usuario.id_usuario}">
                                            <input type="submit" class ="btn btn-default update" name="accion" value="Editar">
                                            <input type="submit" class ="btn btn-default update" name="accion" value="Eliminar">
                                        </form>  


                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>

        </section> <!--/#cart_items-->
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
                        <script src="js/bootstrap.min.js"></script>
                        <script src="js/jquery.scrollUp.min.js"></script>
                        <script src="js/price-range.js"></script>
                        <script src="js/jquery.prettyPhoto.js"></script>
                        <script src="js/main.js"></script>

                        </body>
                        </html>