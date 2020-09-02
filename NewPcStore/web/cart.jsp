<%-- 
    Document   : cart
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
        <title>Carrito | NewPCStore</title>
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
                                    <li><a href="index.jsp" class="active">INICIO</a></li>
                                
                                    <li class="dropdown"><a href="#">TIENDA<i class="fa fa-angle-down"></i></a> 
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="#">Computadores</a></li>
                                            <li><a href="#">Periféricos</a></li> 
                                            <li><a href="#">Carrito</a></li>
                                        </ul>
                                    
                                    <li><a href="#">RECOMENDADOR</a></li>
                                </ul>
                            </div>
                        </div>
			<div class="col-sm-3">
                            <div class="search_box pull-right">
				<input type="text" placeholder="Buscar"/>
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
			<li><a href="#">Inicio</a></li>
			<li class="active">NewPCStore Carrito</li>
                    </ol>
		</div>
		<div class="table-responsive cart_info">
                    <table class="table table-condensed">
			<thead>
                            <tr class="cart_menu">
				<td class="image">Producto</td>
				<td class="description">Descripción</td>
				<td class="price">Precio</td>
				<td class="quantity">Cantidad</td>
				<td class="total">Total</td>
				<td></td>
                            </tr>
			</thead>
			<tbody>
                            <tr>
				<td class="cart_product">
                                    <a href=""><img src="images/cart/l4.png" alt=""></a>
				</td>
				<td class="cart_description">
                                    <h4><a href="">Thinkpad Diseño gráfico</a></h4>
                                    <p>ID del producto: 1089772</p>
				</td>
				<td class="cart_price">
                                    <p>$$$</p>
				</td>
				<td class="cart_quantity">
                                    <div class="cart_quantity_button">
					<a class="cart_quantity_up" href=""> + </a>
					<input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2">
					<a class="cart_quantity_down" href=""> - </a>
                                    </div>
				</td>
				<td class="cart_total">
                                    <p class="cart_total_price">$$$</p>
				</td>
				<td class="cart_delete">
                                    <a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
				</td>
                            </tr>
                            <tr>
				<td class="cart_product">
                                    <a href=""><img src="images/cart/l11.png" alt=""></a>
				</td>
				<td class="cart_description">
                                    <h4><a href="">Portatil Gaming Legion</a></h4>
                                    <p>ID del producto: 1089772</p>
				</td>
				<td class="cart_price">
                                    <p>$$$</p>
				</td>
				<td class="cart_quantity">
                                    <div class="cart_quantity_button">
					<a class="cart_quantity_up" href=""> + </a>
					<input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2">
					<a class="cart_quantity_down" href=""> - </a>
                                    </div>
				</td>
				<td class="cart_total">
                                    <p class="cart_total_price">$$$</p>
				</td>
				<td class="cart_delete">
                                    <a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
				</td>
                            </tr>
                            <tr>
				<td class="cart_product">
                                    <a href=""><img src="images/cart/l3.png" alt=""></a>
				</td>
				<td class="cart_description">
                                    <h4><a href="">IdealCentre</a></h4>
                                    <p>ID del producto: 1089772</p>
                                </td>
				<td class="cart_price">
                                    <p>$$$</p>
				</td>
				<td class="cart_quantity">
                                    <div class="cart_quantity_button">
					<a class="cart_quantity_up" href=""> + </a>
					<input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2">
					<a class="cart_quantity_down" href=""> - </a>
                                    </div>
				</td>
				<td class="cart_total">
                                    <p class="cart_total_price">$$$</p>
				</td>
                                <td class="cart_delete">
                                    <a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
				</td>
                            </tr>
                        </tbody>
                    </table>
		</div>
            </div>
        </section> <!--/#cart_items-->
        <section id="do_action">
            <div class="container">
		<div class="heading">
                    <h3>Tienes algún descuento?</h3>
                    <p>Si es así podras hacer uso de este en la siguiente sección.</p>
                </div>
                <div class="row">
                    <div class="col-sm-6">
                        <div class="chose_area">
                            <ul class="user_option">
				<li>
                                    <input type="checkbox">
                                    <label>Usar cupon de descuento</label>
				</li>
				<li>
                                    <input type="checkbox">
                                    <label>Usar tarjeta de regalo</label>
                                </li>
				<li>
                                    <input type="checkbox">
                                    <label>Eres cliente recurrente de NewPCStore?</label>
				</li>
                            </ul>
                            <ul class="user_info">
				<li class="single_field">
                                    <label>Departamento:</label>
                                    <select>
					<option>Antioquia</option>
					<option>Atlático</option>
					<option>Cundinamarca</option>
					<option>Tolima</option>
                                    </select>
				</li>
				<li class="single_field">
                                    <label>Ciudad:</label>
                                    <select>
                                        <option>Medellín</option>
					<option>Barranquilla</option>
					<option>Bogotá</option>
					<option>Ibagué</option>
                                    </select>
				</li>
				<li class="single_field zip-field">
                                    <label>Código:</label>
                                    <input type="text">
				</li>
                            </ul>
                            <a class="btn btn-default update" href="">Aplicar descuento</a>
                        </div>
                    </div>
                    <div class="col-sm-6">
			<div class="total_area">
                            <ul>
				<li>Sub total en el Carrito <span>$$$</span></li>
				<li>Descuento <span>$$$</span></li>
				<li>Iva <span>$$$</span></li>
				<li>Total <span>$$$</span></li>
                            </ul>
                            <a class="btn btn-default update" href="pago.html">Comprar</a>
			</div>
                    </div>
		</div>
            </div>
        </section><!--/#do_action-->
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
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>