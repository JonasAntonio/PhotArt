package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"img/favicon.ico\">\n");
      out.write("\n");
      out.write("        <title> Photart</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/jumbotron-narrow.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header clearfix\">\n");
      out.write("\n");
      out.write("                <h1 class=\"text-muted\"><img src=\"img/camera.png\" width=\"48\" alt=\"...\" /> PhotArt</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <br />\n");
      out.write("                <div class=\"row vertical-offset-100\">\n");
      out.write("                    <div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h3 class=\"panel-title\">Autenticação</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <form accept-charset=\"UTF-8\" role=\"form\">\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"E-mail\" name=\"email\" type=\"text\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"checkbox\">\n");
      out.write("                                            <label>\n");
      out.write("                                                <input name=\"remember\" type=\"checkbox\" value=\"Remember Me\"> Lembrar senha\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Entrar\">\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <p>&copy; 2018 Laborátorio de Web Sites Dinâmicos - CES JF.</p>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://use.fontawesome.com/45e03a14ce.js\"></script>\n");
      out.write("        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("        <script src=\"js/ie10-viewport-bug-workaround.js\"></script>\n");
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
