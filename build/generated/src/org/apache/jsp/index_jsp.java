package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lora|Montserrat&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/estilos.css\">\n");
      out.write("        <title>Cooperativa Ancash</title>\n");
      out.write("        <style>\n");
      out.write("            .slider{\n");
      out.write("                background: url(\"img/bus.png\");\n");
      out.write("                height: 100vh;\n");
      out.write("                width: 100% ;\n");
      out.write("                background-size: cover;\n");
      out.write("                padding-top: 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            footer{\n");
      out.write("\n");
      out.write("                width: 100%;\n");
      out.write("                height: 230px;\n");
      out.write("                background-color:black;\n");
      out.write("                color: white; \n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-light\" style=\"background-color: white;\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                <img class=\"img-fluid\"src=\"img/logo.PNG\" alt=\"\">\n");
      out.write("            </a> \n");
      out.write("            <ul class=\"nav\">\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"index.jsp\">INICIO</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">SERVICIOS</a>\n");
      out.write("                    <div class=\"dropdown-menu\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"ser_trans.jsp\">SERVICIO DE TRANSPORTE</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"contacto.jsp\">CONTACTO</a>\n");
      out.write("                </li>\n");
      out.write("                <div class=\"nav-item\">\n");
      out.write("                    <a href=\"registro.jsp\" class=\"btn btn-success\">REGISTRARSE</a>\n");
      out.write("                    <a href=\"iniciosesion.jsp\"  class=\"btn btn-success\">INICIAR SESION</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <section class=\"conteiner-fluid slider d-flex justify-content-center align-items-baseline\">\n");
      out.write("            <h1 class=\"display-3\">Tu mejor opcion para viajar</h1>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"section\">\n");
      out.write("            <h3 style=\"color: green;\">Cooperativa Ancash tiene mucha experiencia ofreciendo servicios de autobús \n");
      out.write("                en varias ciudades del Perú. La empresa de transporte terrestre tiene \n");
      out.write("                como objetivo lograr altos estándares de calidad con un servicio rápido y\n");
      out.write("                puntual. Para lograrlo cuenta con autobuses de primera y personal cordial\n");
      out.write("                que asiste a los pasajeros en todo momento. Así que viaja con Cooperativa \n");
      out.write("                Ancash ya que sus autobuses cumplen el horario establecido y ofrecen una \n");
      out.write("                experiencia muy agradable de viaje.</h3>  \n");
      out.write("        </section>\n");
      out.write("        <SECTION class=\"contenedor\">\n");
      out.write("            <h3>NUESTROS DESTINOS</h3>\n");
      out.write("            <div class=\"conte1\">\n");
      out.write("                <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <div class=\"carousel-inner \" role=\"listbox\">\n");
      out.write("                        <div class=\"carousel-item active\" style=\"height:100vh\">\n");
      out.write("                            <img src=\"img/lima.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                            <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                                <h1>LIMA</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item \" style=\"height:100vh\">\n");
      out.write("                            <img src=\"img/huaraz.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                            <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                                <h1>HUARAZ</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-item\" style=\"height:100vh\">\n");
      out.write("                            <img src=\"img/carhuaz.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                            <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                                <h1>CARHUAZ</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                        <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </SECTION>\n");
      out.write("\n");
      out.write("        <footer class=\"page-footer font-small blue pt-4\">\n");
      out.write("            <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 mt-md-0 mt-3\">\n");
      out.write("                        <h5 class=\"text-uppercase\">Cooperativa de Transporte Ancash</h5>\n");
      out.write("                        <p>Tu mejor opción para viajar.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <hr class=\"clearfix w-100 d-md-none pb-3\">\n");
      out.write("                    <div class=\"col-md-3 mb-md-0 mb-3\">\n");
      out.write("                        <h5 class=\"text-uppercase\">Redes Sociales</h5>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"https://www.facebook.com/\">Facebook</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"https://twitter.com/?lang=es\">Twitter</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"https://www.instagram.com/\">Instagram</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"https://web.whatsapp.com/\">WhatsApp</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright text-center py-3\">© 2019 Copyright: COOPERATIVA DE TRANSPORTES ANCASH </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"dist/js/bootstrap.js\"></script>\n");
      out.write("</html>\n");
      out.write("\n");
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
}
