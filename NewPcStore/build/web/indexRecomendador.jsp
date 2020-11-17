<%-- 
    Document   : index
    Created on : 20/05/2020, 09:47:58 PM
    Author     : edwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="Edwin Upegui"><!--meta dato que define el autor-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!--meta dato que hace responsive la pagina-->
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
				<a href="indexRecomendador.jsp"><img src="images/home/logo.png" alt="logo de la tienda NewPCStore" /></a>
                            </div>
			</div>
			<div class="col-sm-8">
                            <div class="shop-menu pull-right">
				<ul class="nav navbar-nav">
                                    <!---<li><a href="404.jsp"><i class="fa fa-user"></i> Contactenos</a></li>--->
                                     <!--<li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Carrito</a></li>-->
                                    <li><a value="iconoSalida" href="index.jsp" ><img src="images/home/logout.png"/></a></li>
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
                                    <li><a href="indexRecomendador.jsp" class="active">INICIO</a></li>
                                
                                    <li class="dropdown"><a href="#">TIENDA<i class="fa fa-angle-down"></i></a> 
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="computadoresLogueado.jsp">Computadores</a></li>
                                            <li><a href="accesoriosLogueado.jsp">Accesorios</a></li> 
                                            
                                        </ul>
                                    
                                    <li><a href="recomendador.jsp">RECOMENDADOR</a></li>
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

	<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>New</span>PCStore</h1>
									<h2>Recomendación del día</h2>
									<p>Portátil gaming de altas prestaciones con gran potencial gráfico y de procesamiento de datos. </p>
									<button type="button" class="btn btn-default get">Consiguelo ahora</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/l4.PNG" class="girl img-responsive" alt="" />
									<!--<img src="images/home/new.png"  class="pricing" alt="" />-->
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1><span>New</span>PCStore</h1>
									<h2>Para los que disfrutan de la mejor resolución</h2>
									<p>La mejor calidad en la imagen que jamás hayas visto en una pantalla full HD de 15’’. </p>
									<button type="button" class="btn btn-default get">Consiguelo ahora</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/l8.PNG" class="girl img-responsive" alt="" />
									<!--<img src="images/home/pricing.png"  class="pricing" alt="" />-->
								</div>
							</div>
							
							<div class="item">
								<div class="col-sm-6">
									<h1><span>New</span>PCStore</h1>
									<h2>Lo mejor para el regreso a clases</h2>
									<p>Los más coloridos y versátiles portátiles listo para ir a clase contigo. </p>
									<button type="button" class="btn btn-default get">Consiguelo ahora</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/l14.png" class="girl img-responsive" alt="" />
									<!--<img src="images/home/pricing.png"  class="pricing" alt="" />-->
								</div>
							</div>
							
						</div>
						
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</section><!--/slider-->

	<section>
            <div class="container">
		<div class="row">
                    <div class="col-sm-3">
			<div class="left-sidebar">
                            <h2>equipos</h2>
                            <div class="panel-group category-products" id="accordian"><!--category-productsr-->
				<div class="panel panel-default">
                                    <div class="panel-heading">
					<h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
                                                <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                    Equipos de mesa
                                            </a>
					</h4>
                                    </div>
                                    <div id="sportswear" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <ul>
						<li><a href="#">ThinkCentre</a></li>
                                                <li><a href="#">IdeaCentre</a></li>
						<li><a href="#">Lenovo</a></li>
						<li><a href="#">Legion</a></li>
                                            </ul>
					</div>
                                    </div>
                                </div>
				<div class="panel panel-default">
                                    <div class="panel-heading">
					<h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordian" href="#mens">
						<span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                    Portatiles
                                            </a>
					</h4>
                                    </div>
                                    <div id="mens" class="panel-collapse collapse">
                                        <div class="panel-body">
                                            <ul>
						<li><a href="#">Think </a></li>
						<li><a href="#">Legion </a></li>
						<li><a href="#">Yoga </a></li>
						<li><a href="#">Ideapad</a></li>
						<li><a href="#">Lenovo</a></li>
                                            </ul>
					</div>
                                    </div>
                                </div>
				<div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordian" href="#womens">
						<span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                    ACCESORIOS
                                            </a>
					</h4>
                                    </div>
                                    <div id="womens" class="panel-collapse collapse">
					<div class="panel-body">
                                            <ul>
						<li><a href="#">Diademas</a></li>
						<li><a href="#">Mouses</a></li>
						<li><a href="#">Almacenamiento</a></li>
						<li><a href="#">Camaras</a></li>
						<li><a href="#">Soportes ergonómicos</a></li>
                                            </ul>
					</div>
                                    </div>
				</div>
                            </div><!--/category-products-->
                            <div class="brands_products"><!--brands_products-->
				<h2>CATEGORIAS</h2>
                                    <div class="brands-name">
					<ul class="nav nav-pills nav-stacked">
                                            <li><a href="#"> <span class="pull-right">(50)</span>Diseño</a></li>
                                            <li><a href="#"> <span class="pull-right">(56)</span>Estudio</a></li>
                                            <li><a href="#"> <span class="pull-right">(27)</span>Procesos</a></li>
                                            <li><a href="#"> <span class="pull-right">(32)</span>Videojuegos</a></li>
                                            <li><a href="#"> <span class="pull-right">(25)</span>Hogar</a></li>
					</ul>
                                    </div>
                            </div><!--/brands_products-->
                            <div class="price-range"><!--price-range-->
                                    <h2>Rango de precios</h2>
                                            <div class="well text-center">
                                                <input type="text" class="span2" value="" data-slider-min="700" data-slider-max="5000" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                                                    <b class="pull-left">$ 700.000</b> <b class="pull-right">$ 5'000.000</b>
                                            </div>
                            </div><!--/price-range-->
                            <div class="shipping text-center"><!--shipping-->
				<img src="images/home/shipping.jpg" alt="" />
                            </div><!--/shipping-->
                        </div>
                    </div>
                    <div class="col-sm-9 padding-right">
                        <div class="features_items"><!--features_items-->
                            <h2 class="title text-center">NUEVOS EQUIPOS</h2>
                            <div class="col-sm-4">
                                <div class="product-image-wrapper">
                                    <div class="single-products">
                                        <div class="productinfo text-center">
                                            <img src="images/home/l15.png" alt="" />
                                            <h2>$ 1'700.000</h2>
                                            <p>Lenovo Yoga</p>
                                            <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
					</div>
                                        <div class="product-overlay">
                                            <div class="overlay-content">	
                                                <h2>$ 1'700.000</h2>
                                                <p>Lenovo Yoga</p>
                                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="choose">
                                        <ul class="nav nav-pills nav-justified">
                                            <li><a href="#"><i class="fa fa-plus-square"></i>Caracteristicas</a></li>
					</ul>
                                    </div>
				</div>
                                    <img src="images/home/new.png" class="new" alt="" />
				</div>
				<div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
						<img src="images/home/l10.PNG" alt="" />
						<h2>$ 1'800.000</h2>
						<p>Lenovo Thinkpad</p>
						<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                            </div>
                                            <div class="product-overlay">
                                                <div class="overlay-content">
                                                    <h2>$ 1'800.000</h2>
                                                    <p>Lenovo Thinkpad</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                                </div>
                                            </div>
                                        </div>
					<div class="choose">
                                            <ul class="nav nav-pills nav-justified">
						<li><a href="#"><i class="fa fa-plus-square"></i>Caracteristicas</a></li>
                                            </ul>
					</div>
                                    </div>
                                    <img src="images/home/new.png" class="new" alt="" />
				</div>
				<div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
						<img src="images/home/l21.jpg" alt="" />
						<h2>$ 1'300.000</h2>
						<p>ThinkCentre</p>
						<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                            </div>
                                            <div class="product-overlay">
						<div class="overlay-content">
                                                    <h2>$ 1'300.000</h2>
                                                    <p>ThinkCentre</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                                </div>
                                            </div>
					</div>
					<div class="choose">
                                            <ul class="nav nav-pills nav-justified">
                                                <li><a href="#"><i class="fa fa-plus-square"></i>Caracteristicas</a></li>
                                            </ul>
					</div>
                                    </div>
                                    <img src="images/home/new.png" class="new" alt="" />
				</div>
				<div class="col-sm-4">
                                    <div class="product-image-wrapper">
					<div class="single-products">
                                            <div class="productinfo text-center">
						<img src="images/home/l11.png" alt="" />
						<h2>$ 1'300.000</h2>
						<p>Legion</p>
						<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                            </div>
                                            <div class="product-overlay">
						<div class="overlay-content">
                                                    <h2>$ 1'300.000</h2>
                                                    <p>Legion</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
                                            <img src="images/home/new.png" class="new" alt="" />
					</div>
					<div class="choose">
                                            <ul class="nav nav-pills nav-justified">
						<li><a href="#"><i class="fa fa-plus-square"></i>Caracteristicas</a></li>
                                            </ul>
					</div>
                                    </div>
				</div>
				<div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img src="images/home/l20.png" alt="" />
                                                <h2>$ 1'500.000</h2>
                                                <p>ThinkCentre</p>
                                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carritot</a>
                                            </div>
                                            <div class="product-overlay">
                                                <div class="overlay-content">
                                                    <h2>$ 1'500.000</h2>
                                                    <p>ThinkCentre</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                                </div>
                                            </div>
                                            <img src="images/home/new.png" class="new" alt="" />
                                        </div>
                                        <div class="choose">
                                            <ul class="nav nav-pills nav-justified">
                                                <li><a href="#"><i class="fa fa-plus-square"></i>Caracteristicas</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img src="images/home/l22.jpg" alt="" />
                                                <h2>$ 1'950.000</h2>
                                                <p>IdealCentre</p>
                                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                            </div>
                                            <div class="product-overlay">
                                                <div class="overlay-content">
                                                    <h2>$ 1'950.000</h2>
                                                    <p>IdealCentre</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="choose">
                                            <ul class="nav nav-pills nav-justified">
                                                <li><a href="#"><i class="fa fa-plus-square"></i>Caracteristicas</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <img src="images/home/new.png" class="new" alt="" />
                                </div>
			</div><!--features_items-->
			<div class="category-tab"><!--category-tab-->
                            <div class="col-sm-12">
				<ul class="nav nav-tabs">
                                    <li class="active"><a href="#tshirt" data-toggle="tab">DISEÑO</a></li>
                                    <li><a href="#blazers" data-toggle="tab">ESTUDIO</a></li>
                                    <li><a href="#sunglass" data-toggle="tab">PROCESOS</a></li>
                                    <li><a href="#kids" data-toggle="tab">VIDEOJUEGOS</a></li>
                                    <li><a href="#poloshirt" data-toggle="tab">HOGAR</a></li>
				</ul>
                            </div>
                            <div class="tab-content">
				<div class="tab-pane fade active in" id="tshirt" >
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
						<div class="productinfo text-center">
                                                    <img src="images/home/l22.jpg" alt="" />
							<h2>$ 1'950.000</h2>
							<p>Lenovo Yoga</p>
							<a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
						<div class="productinfo text-center">
                                                    <img src="images/home/l15.png" alt="" />
                                                    <h2>$ 1'750.000</h2>
                                                    <p>Lenovo Yoga</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
                                </div> 
				<div class="tab-pane fade" id="blazers" >
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
						<div class="productinfo text-center">
                                                    <img src="images/home/l18.png" alt="" />
                                                    <h2>$ 1'670.000</h2>
                                                    <p>Ideapad</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
						<div class="productinfo text-center">
                                                    <img src="images/home/l6.PNG" alt="" />
                                                    <h2>$ 1'430.000</h2>
                                                    <p>Ideapad</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
				</div>
				<div class="tab-pane fade" id="sunglass" >
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
						<div class="productinfo text-center">
                                                    <img src="images/home/l1.PNG" alt="" />
                                                    <h2>$ 2'950.000</h2>
                                                    <p>Thinkpad</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <img src="images/home/l20.png" alt="" />
                                                    <h2>$ 1'980.000</h2>
                                                    <p>ThinkCentre</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carritot</a>
						</div>
                                            </div>
					</div>
                                    </div>
				</div>
				<div class="tab-pane fade" id="kids" >
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
						<div class="productinfo text-center">
                                                    <img src="images/home/l11.png" alt="" />
                                                    <h2>$ 1'650.000</h2>
                                                    <p>Legion</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
				</div>
				<div class="tab-pane fade" id="poloshirt" >
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <img src="images/home/l21.jpg" alt="" />
                                                    <h2>$ 2'120.000</h2>
                                                    <p>Lenovo</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
                                    <div class="col-sm-3">
					<div class="product-image-wrapper">
                                            <div class="single-products">
                                                <div class="productinfo text-center">
                                                    <img src="images/home/l13.png" alt="" />
                                                    <h2>$ 1'350.000</h2>
                                                    <p>Lenovo</p>
                                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Agregar al carrito</a>
						</div>
                                            </div>
					</div>
                                    </div>
				</div>
                            </div>
			</div><!--/category-tab-->
                    </div>
		</div>
            </div>
	</section>	


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
