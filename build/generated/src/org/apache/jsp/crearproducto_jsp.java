package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/main.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Nuevo Producto</h1>\n");
      out.write("        <form action=\"crearproducto\" name=\"frmnuevo\"  enctype=\"multipart/form-data\" id=\"frm_nuevo\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Nombre:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nombre\" id=\"nombre\"></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Descripcion:</td>\n");
      out.write("                    <td><textarea  cols=\"30\" rows=\"6\" name=\"descripcion\" id=\"descripcion\"></textarea></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Precio:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"precio\" id=\"precio\"></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Categoria:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"categoria\" id=\"categoria\"></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Detalles:</td>\n");
      out.write("                    <td><textarea  cols=\"30\" rows=\"6\" name=\"detalles\" id=\"detalles\"></textarea></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Reviews:</td>\n");
      out.write("                    <td><textarea  cols=\"30\" rows=\"6\" name=\"reviews\" id=\"reviews\"></textarea></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Size:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"size\" id=\"size\">\n");
      out.write("                            <option value=\"Seleccione una opcion\">Seleccione una opcion</option>\n");
      out.write("\n");
      out.write("                            ");


                                for (int i = 1; i <= 20; i++) {
      out.write("\n");
      out.write("\n");
      out.write("                            <option value='");
      out.print(i);
      out.write('\'');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Color:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"color\" id=\"color\"></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"\">Imagenes:</td>\n");
      out.write("                    <td><input type=\"file\" name=\"file[]\" id=\"archivos\" multiple></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                     <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"crear Producto\" id=\"btncrearproducto\"></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
}
