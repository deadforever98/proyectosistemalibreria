package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class libros_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/jspf/scripts.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/styles.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/nav.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/carrusel.jspf");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/Menu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <script src=\"js/Sesion.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Libros</title>\n");
      out.write("\n");
      out.write("        ");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://kit.fontawesome.com/9003691c5f.js\"></script>");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav>\n");
      out.write("    <p class=\"logo\">Proyecto Estudiantil WEB </p>\n");
      out.write("    <ul class=\"navigation\">\n");
      out.write("        <li> <a href=\"#\"></a></li>\n");
      out.write("        <li class=\"menu\"> <a href=\"#\">LIBROS</a>\n");
      out.write("            <ul class=\"submenu\">\n");
      out.write("                <li> <a href=\"Frm_Usuario.html\" target=\"zona\">Historia</a></li>\n");
      out.write("                <li> <a href=\"Frm_Pacientes.html\" target=\"zona\">Sociedad</a></li>\n");
      out.write("                <li> <a href=\"Frm_Pacientes.html\" target=\"zona\">Filosofía</a></li>\n");
      out.write("                <li> <a href=\"Frm_Pacientes.html\" target=\"zona\">Cine</a></li>\n");
      out.write("                <li> <a href=\"Frm_Pacientes.html\" target=\"zona\">Educación</a></li>\n");
      out.write("                <li> <a href=\"Frm_Pacientes.html\" target=\"zona\">Bibliografia</a></li>\n");
      out.write("                  <li> <a href=\"Frm_Pacientes.html\" target=\"zona\">Crítica Literaria</a></li>\n");
      out.write("            \n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu\"> <a href=\"#\">COLECCIONES</a>\n");
      out.write("            <ul class=\"submenu\">\n");
      out.write("                <li> <a href=\"Frm_Usuario.html\" target=\"zona\">nuevo Ensayo</a></li>\n");
      out.write("                <li> <a href=\"Frm_Usuario.html\" target=\"zona\">Comunicación y Sociedad</a></li>\n");
      out.write("                <li> <a href=\"Frm_Usuario.html\" target=\"zona\">Raíces de Europa</a></li>}\n");
      out.write("                <li> <a href=\"Frm_Usuario.html\" target=\"zona\">Política </a></li>\n");
      out.write("              <li> <a href=\"Frm_Usuario.html\" target=\"zona\">Esenciales </a></li>\n");
      out.write("             \n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu\"> <a href=\"#\">AUTORES</a>\n");
      out.write("            <ul class=\"submenu\">\n");
      out.write("                <li> <a href=\"Frm_Medicamentos.html\" target=\"zona\">MIGUEL DE CERVANTES (1547 - 1616)</a></li>\n");
      out.write("                <li> <a href=\"Frm_Medicamentos.html\"  target=\"zona\">MARQUÉS DE SADE (1740 - 1814)</a></li>\n");
      out.write("                <li> <a href=\"Frm_Medicamentos.html\" target=\"zona\">GOETHE (1749 - 1832)</a></li>\n");
      out.write("                <li> <a href=\"Frm_Medicamentos.html\" target=\"zona\">MARY SHELLEY (1797 - 1851)</a></li>\n");
      out.write("                <li> <a href=\"Frm_Medicamentos.html\" target=\"zona\">VICTOR HUGO (1802 - 1885)</a></li>\n");
      out.write("                <li> <a href=\"Frm_Medicamentos.html\" target=\"zona\">CHARLES DICKENS (1812-1870)</a></li>\n");
      out.write("                <li> <a href=\"Frm_Medicamentos.html\" target=\"zona\">HERMAN MELVILLE (1819 - 1891)</a></li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu\"> <a href=\"#\">CONTACTOS</a>\n");
      out.write("            <ul class=\"submenu\">\n");
      out.write("                <li> <a  href=\"Frm_Insumos.html\" target=\"zona\">Registrar Cita</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menu\"> <a href=\"#\">ENSAYOS Y HUMANIDADES</a></li>\n");
      out.write("\n");
      out.write("        <li class=\"menu\"> <a href=\"index.jsp\" onclick=\"return ValidarSesion()\">CERRAR SESION</a></li>\n");
      out.write("        <li class=\"menu\"><a href=\"ControlllerContacto?opcion=MostrarCita\" class=\"btn btn-outline-success btnlogin\" style=\"display: none; text-align: left; margin-top: 15px;\">Registrar Cita</a></li>\n");
      out.write("        <li class=\"menu\"><a href=\"login.jsp\" class=\"btn btn-outline-success\" style=\"text-align: left; margin-top: 15px; margin-left: 10px;\">Login</a></li>\n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"bd-example\">\n");
      out.write("    <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"2\"></li>\n");
      out.write("        </ol> \n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"carousel-item active\">\n");
      out.write("                <img src=\"img/banner(1).jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img src=\"img/banner(2).jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-item\">\n");
      out.write("                <img src=\"img/banner(3).jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("             <div class=\"carousel-item\">\n");
      out.write("                <img src=\"img/banner(4).jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"carousel-control-prev\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"carousel-control-next\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\"><br><br>\n");
      out.write("            <form style=\"margin: auto;width: 800px;\" action=\"ControlllerContacto\" method=\"post\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <h2 style=\"color: #3D3FD3;\">Generar Contacto</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <input type=\"text\"  class=\"form-control col-lg-5\" placeholder=\"Nombre\" required=\"\" name=\"nombre\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <input type=\"email\"  class=\"form-control col-lg-5\" placeholder=\"Correo Electronico\" required=\"\" name=\"correo\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <input type=\"text\"  class=\"form-control col-lg-5\" placeholder=\"Celular\" required=\"\" name=\"celular\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <textarea  rows=\"4\"  class=\"form-control col-lg-5\" placeholder=\"Hola Estoy interesado(a) solicito más informacion\" name=\"comentario\">\n");
      out.write("                        \n");
      out.write("                    </textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <input type=\"submit\" value=\"Solicito Informacion\" class=\"btn btn-success col-lg-5\" name=\"opcion\">\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row g-0 border rounded overflow-hidden flex-md-row mb-4 shadow-sm h-md-250 position-relative\">\n");
      out.write("        <div class=\"col p-4 d-flex flex-column position-static\">\n");
      out.write("          <strong class=\"d-inline-block mb-2 text-success\">Design</strong>\n");
      out.write("          <h3 class=\"mb-0\">Post title</h3>\n");
      out.write("          <div class=\"mb-1 text-muted\">Nov 11</div>\n");
      out.write("          <p class=\"mb-auto\">This is a wider card with supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("          <a href=\"#\" class=\"stretched-link\">Continue reading</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-auto d-none d-lg-block\">\n");
      out.write("          <svg class=\"bd-placeholder-img\" width=\"200\" height=\"250\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"></rect><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
}
