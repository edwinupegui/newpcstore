package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.util.List;

public final class admininventario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <!--meta dato que permite el manejo del teclado en espaÃ±ol-->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> <!--meta dato que hace responsive la pagina-->\r\n");
      out.write("        <meta name=\"author\" content=\"Edwin Upegui\"><!--meta dato que define el autor-->\r\n");
      out.write("        <meta name=\"description\" content=\"Pagina web para la tienda NewPCStore\">\r\n");
      out.write("        <title>Home | NewPCStore</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header id=\"header\"><!--header-->\r\n");
      out.write("            <div class=\"header_top\"><!--header_superior-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"contactinfo\">\r\n");
      out.write("                                <ul class=\"nav nav-pills\">\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +57 311 3634309</a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> newpcstoresas@gmail.com</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"social-icons pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://www.facebook.com/Newpcstore-SAS-106480394292396/\"> <i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://twitter.com/home\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://www.linkedin.com/feed/?trk=onboarding-landing\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://www.instagram.com/?hl=es-la\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header_superior-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-middle\"><!--header-intermedio-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"logo pull-left\">\r\n");
      out.write("                                <a href=\"administrador.jsp\"><img src=\"images/home/logo.png\" alt=\"logo de la tienda NewPCStore\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <div class=\"shop-menu pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <!--<li><a href=\"cart.jsp\"><i class=\"fa fa-shopping-cart\"></i> Carrito</a></li>-->\r\n");
      out.write("                                    <li><a href=\"index.jsp\"><img src=\"images/home/logout.png\"/></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-intermedio-->\r\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-9\">\r\n");
      out.write("                            <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button> \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mainmenu pull-left\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav collapse navbar-collapse\">\r\n");
      out.write("                                    <li><a href=\"administrador.jsp\" class=\"active\">INICIO</a></li>\r\n");
      out.write("                                    <!---<li class=\"dropdown\"><a href=\"#\">TIENDA<i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                        <ul role=\"menu\" class=\"sub-menu\">\r\n");
      out.write("                                            <li><a href=\"shop.html\">Computadores</a></li>\r\n");
      out.write("                                            <li><a href=\"product-details.html\">PerifÃ©ricos</a></li> \r\n");
      out.write("                                            <li><a href=\"cart.html\">Carrito</a></li>\r\n");
      out.write("                                        </ul>--->\r\n");
      out.write("                                    </li> \r\n");
      out.write("                                    <li class=\"dropdown\"><a href=\"#\">ADMINISTRADOR<i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                        <ul role=\"menu\" class=\"sub-menu\">\r\n");
      out.write("                                            <li><a href=\"adminusuarios.jsp\">Usuarios</a></li>\r\n");
      out.write("                                            <li><a href=\"admininventario.jsp\">Inventario</a></li>\r\n");
      out.write("                                            <li><a href=\"pedido.jsp\">Pedidos</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <!---<li><a href=\"404.html\">RECOMENDADOR</a></li>--->\r\n");
      out.write("                                    <!---<li><a href=\"contact-us.html\">QUIENES SOMOS</a></li>--->\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"search_box pull-right\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"buscar\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-bottom-->\r\n");
      out.write("        </header><!--/header-->\r\n");
      out.write("        <section id=\"cart_items\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"breadcrumbs\">\r\n");
      out.write("                    <ol class=\"breadcrumb\">\r\n");
      out.write("                        <li><a href=\"administrador.jsp\">Inicio</a></li>\r\n");
      out.write("                        <li class=\"active\">NewPCStore Admin Inventario</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table-responsive cart_info\">\r\n");
      out.write("\r\n");
      out.write("                    <form method=\"POST\" action=\"AdminProductos\">\r\n");
      out.write("                        <input class =\"btn btn-default update\" type=\"submit\" name=\"accion\" value=\"Listar\">\r\n");
      out.write("                        <input class =\"btn btn-default update\" type=\"submit\" name=\"accion\" value=\"Crear\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <table class=\"table table-condensed\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr class=\"cart_menu\">\r\n");
      out.write("                                <td class=\"total\">ID PRODUCTO</td>\r\n");
      out.write("                                <td class=\"total\">REFERENCIA</td>\r\n");
      out.write("                                <td class=\"total\">SERIAL</td>\r\n");
      out.write("                                <td class=\"total\">PERFIL</td>\r\n");
      out.write("                                <td class=\"total\">PRECIO</td>\r\n");
      out.write("                                <td class=\"total\">CANTIDAD</td>\r\n");
      out.write("                                <td class=\"total\">ACCIONES</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
ArrayList<Producto> datos = (ArrayList<Producto>) request.getAttribute("datos");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </section> <!--/#cart_items-->\r\n");
      out.write("        <footer id=\"footer\"><!--Footer-->\r\n");
      out.write("            <div class=\"footer-top\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <div class=\"companyinfo\">\r\n");
      out.write("                                <h2><span>New</span>PCStore</h2>\r\n");
      out.write("                                <p>Tienda de equipos de computo especializada en productos de la marca lenovo.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"footer-widget\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                        <div class=\"single-widget\">\r\n");
      out.write("                                            <h2>Servicios</h2>\r\n");
      out.write("                                            <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                                <li><a href=\"#\">Ayuda online</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">Contactanos</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                        <div class=\"single-widget\">\r\n");
      out.write("                                            <h2>QuÃ© comprar?</h2>\r\n");
      out.write("                                            <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                                <li><a href=\"#\">Portatiles</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">Equipos de mesa</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">accesorios</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                        <div class=\"single-widget\">\r\n");
      out.write("                                            <h2>Politicas</h2>\r\n");
      out.write("                                            <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                                                <li><a href=\"#\">Politicas de privacidad</a></li>\r\n");
      out.write("                                                <li><a href=\"#\">Politicas de uso</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </footer><!--/Footer-->\r\n");
      out.write("                        <div class=\"footer-bottom\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <p class=\"pull-left\">Copyright Â© 2020 NewPCStore S.A.S Todos los derechos reservados.</p>\r\n");
      out.write("                                    <p class=\"pull-right\">Se toma como referencia las imagenes de la pagina oficial de: <span><a target=\"_blank\" href=\"https://www.lenovo.com\"> LENOVO</a></span></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <script src=\"js/jquery.js\"></script>\r\n");
      out.write("                        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("                        <script src=\"js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("                        <script src=\"js/price-range.js\"></script>\r\n");
      out.write("                        <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("                        <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                        </body>\r\n");
      out.write("                        </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("dato");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr> \r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.id_producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getReferencia()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getSerial()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getPerfil()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>\r\n");
          out.write("                                        <form action=\"AdminUsuarios\" method=\"post\">\r\n");
          out.write("                                            <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto.id_producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <input type=\"submit\" class =\"btn btn-default update\" name=\"accion\" value=\"Editar\">\r\n");
          out.write("                                            <input type=\"submit\" class =\"btn btn-default update\" name=\"accion\" value=\"Eliminar\">\r\n");
          out.write("                                        </form>  \r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
