package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Recomendacion;
import java.util.ArrayList;

public final class recomendador_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"author\" content=\"Edwin Upegui\"><!--meta dato que define el autor-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> <!--meta dato que hace responsive la pagina-->\n");
      out.write("        <meta name=\"description\" content=\"Pagina web para la tienda NewPCStore\">\n");
      out.write("        <title>Home | NewPCStore</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\"><!--header-->\n");
      out.write("            <div class=\"header_top\"><!--header_superior-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"contactinfo\">\n");
      out.write("                                <ul class=\"nav nav-pills\">\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +57 311 3634309</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> newpcstoresas@gmail.com</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"social-icons pull-right\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://www.facebook.com/Newpcstore-SAS-106480394292396/\"> <i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://twitter.com/home\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://www.linkedin.com/feed/?trk=onboarding-landing\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                    <li><a target=\"_blank\" href=\"https://www.instagram.com/?hl=es-la\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header_superior-->\n");
      out.write("            <div class=\"header-middle\"><!--header-intermedio-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"logo pull-left\">\n");
      out.write("                                <a href=\"indexRecomendador.jsp\"><img src=\"images/home/logo.png\" alt=\"logo de la tienda NewPCStore\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <div class=\"shop-menu pull-right\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <!---<li><a href=\"404.jsp\"><i class=\"fa fa-user\"></i> Contactenos</a></li>--->\n");
      out.write("                                    <!--<li><a href=\"cart.jsp\"><i class=\"fa fa-shopping-cart\"></i> Carrito</a></li>-->\n");
      out.write("                                    <li><a href=\"index.jsp\"><img src=\"images/home/logout.png\"/></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header-intermedio-->\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mainmenu pull-left\">\n");
      out.write("                                <ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("                                    <li><a href=\"indexRecomendador.jsp\" class=\"active\">INICIO</a></li>\n");
      out.write("\n");
      out.write("                                    <li class=\"dropdown\"><a href=\"#\">TIENDA<i class=\"fa fa-angle-down\"></i></a> \n");
      out.write("                                        <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                            <li><a href=\"computadoresLogueado.jsp\">Computadores</a></li>\n");
      out.write("                                            <li><a href=\"accesoriosLogueado.jsp\">Accesorios</a></li> \n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"recomendador.jsp\">RECOMENDADOR</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"search_box pull-right\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Buscar\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header-bottom-->\n");
      out.write("        </header><!--/header-->\n");
      out.write("\n");
      out.write("        <section id=\"form\"><!--form-->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4 col-sm-offset-1\">\n");
      out.write("                        <div class=\"login-form\"><!--login form-->\n");
      out.write("                            <top>\n");
      out.write("                                <form method=\"POST\" action=\"RecomendadorSrv\">\n");
      out.write("                                <h4>PERFIL CLIENTE</h4>\n");
      out.write("                                    <input list=\"clientes\" name=\"cliente\" id=\"cliente\">\n");
      out.write("                                    <datalist id=\"clientes\">\n");
      out.write("                                        <option value=\"EMPRESARIO\">\n");
      out.write("                                        <option value=\"JUGADOR\">\n");
      out.write("                                        <option value=\"ESTUDIANTE\">\n");
      out.write("                                        <option value=\"DISEÑADOR\">\n");
      out.write("                                        <option value=\"HOGARES\">\n");
      out.write("                                    </datalist>\n");
      out.write("                                \n");
      out.write("                                <h4>TIPO PC</h4>\n");
      out.write("                                    <input list=\"equipos\" name=\"equipo\" id=\"equipo\">\n");
      out.write("                                    <datalist id=\"equipos\">\n");
      out.write("                                        <option value=\"PORTATIL\">\n");
      out.write("                                        <option value=\"ESCRITORIO\">\n");
      out.write("                                        <option value=\"TODO EN UNO\">\n");
      out.write("                                        <option value=\"HIBRIDO\">\n");
      out.write("                                    </datalist>\n");
      out.write("                              \n");
      out.write("                                <h4>PERFIL PC</h4>\n");
      out.write("                                    <input list=\"usos\" name=\"uso\" id=\"uso\">\n");
      out.write("                                    <datalist id=\"usos\">\n");
      out.write("                                        <option value=\"CORPORATIVO\">\n");
      out.write("                                        <option value=\"HOGAR\">\n");
      out.write("                                        <option value=\"DISEÑO\">\n");
      out.write("                                        <option value=\"ESTUDIO\">\n");
      out.write("                                        <option value=\"GAMER\">\n");
      out.write("                                    </datalist>\n");
      out.write("                                    \n");
      out.write("                                    <hr>\n");
      out.write("                                    <input type=\"submit\" name=\"BtnRecomendador\" value=\"Buscar\">\n");
      out.write("                                </form>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </top>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section> <!--/#cart_items--> \n");
      out.write("        <section id=\"form\"><!--form-->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("        <div class=\"login-form\"><!--login form-->\n");
      out.write("            <table class=\"table table-condensed\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr class=\"cart_menu\">\n");
      out.write("                        <td class=\"total\">MODELO</td>\n");
      out.write("                        <td class=\"total\">PERFIL EQUIPO</td>\n");
      out.write("                        <td class=\"total\">TIPO EQUIPO</td>\n");
      out.write("                        <td class=\"total\">PERFIL CLIENTE</td>\n");
      out.write("                        <td class=\"total\">CARACTERISTICAS</td>\n");
      out.write("                        <td class=\"total\">PRECIO</td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
ArrayList<Recomendacion> datos = (ArrayList<Recomendacion>) request.getAttribute("datos");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                </div>\n");
      out.write("                    </div>\n");
      out.write("        </section>\n");
      out.write("                    <hr>\n");
      out.write("        <footer id=\"footer\"><!--Footer-->\n");
      out.write("            <div class=\"footer-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <div class=\"companyinfo\">\n");
      out.write("                                <h2><span>New</span>PCStore</h2>\n");
      out.write("                                <p>Tienda de equipos de computo especializada en productos de la marca lenovo.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer-widget\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <div class=\"single-widget\">\n");
      out.write("                                            <h2>Servicios</h2>\n");
      out.write("                                            <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                                <li><a href=\"#\">Ayuda online</a></li>\n");
      out.write("                                                <li><a href=\"#\">Contactanos</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <div class=\"single-widget\">\n");
      out.write("                                            <h2>Qué comprar?</h2>\n");
      out.write("                                            <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                                <li><a href=\"#\">Portatiles</a></li>\n");
      out.write("                                                <li><a href=\"#\">Equipos de mesa</a></li>\n");
      out.write("                                                <li><a href=\"#\">accesorios</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-2\">\n");
      out.write("                                        <div class=\"single-widget\">\n");
      out.write("                                            <h2>Politicas</h2>\n");
      out.write("                                            <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                                <li><a href=\"#\">Politicas de privacidad</a></li>\n");
      out.write("                                                <li><a href=\"#\">Politicas de uso</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer><!--/Footer-->\n");
      out.write("        <div class=\"footer-bottom\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <p class=\"pull-left\">Copyright © 2020 NewPCStore S.A.S Todos los derechos reservados.</p>\n");
      out.write("                    <p class=\"pull-right\">Se toma como referencia las imagenes de la pagina oficial de: <span><a target=\"_blank\" href=\"https://www.lenovo.com\"> LENOVO</a></span></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
          out.write("\n");
          out.write("                        <tr> \n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.modelo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getPerfil_equipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getTipo_equipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getPerfil_cliente()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getCaracteristicas()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
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
