package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dcomment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Photart</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/jumbotron-narrow.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header clearfix\">\n");
      out.write("                <nav>\n");
      out.write("                    <ul class=\"nav nav-pills pull-right\">\n");
      out.write("                        <li role=\"presentation\" ><a href=\"#\">Início</a></li>\n");
      out.write("                        <li role=\"presentation\" ><a href=\"#\">Buscar Imagens</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#\">Sobre</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <h1 class=\"text-muted\"><img src=\"img/camera.png\" width=\"48\" alt=\"...\" /> PhotArt</h1>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"pull-right\">\n");
      out.write("                                <h5><span class=\"glyphicon glyphicon-camera\" aria-hidden=\"true\"></span> Simetria <small> por @yuanzhangliang</small></h5>\n");
      out.write("                            </div>\n");
      out.write("                            <img src=\"img/pic.jpg\" alt=\"...\" class=\"img-thumbnail\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <h2>Escreva sua avaliação</h2>\n");
      out.write("                            <br />\n");
      out.write("                            <form class=\"form-horizontal\" action=\"index.html\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">Título</label>\n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"inputEmail3\" placeholder=\"Muito bom!\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail4\" class=\"col-sm-2 control-label\">Usuário</label>\n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"@johndoe\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail5\" class=\"col-sm-2 control-label\">Avaliação</label>\n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                        <textarea class=\"form-control\" id=\"inputEmail5\" rows=\"3\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"inputEmail5\" class=\"col-sm-2 control-label\">Nota final</label>\n");
      out.write("                                    <div class=\"col-sm-10\">\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio1\" value=\"option1\"> 1\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"option2\"> 2\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio3\" value=\"option3\"> 3\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio4\" value=\"option2\"> 4\n");
      out.write("                                        </label>\n");
      out.write("                                        <label class=\"radio-inline\">\n");
      out.write("                                            <input type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadio5\" value=\"option3\"> 5\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-lg pull-right\"><span class=\"glyphicon glyphicon-send\" aria-hidden=\"true\"></span> Publicar Avaliação</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <p>&copy; 2018 Laborátorio de Web Sites Dinâmicos - CES JF.</p>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div> <!-- /container -->\n");
      out.write("\n");
      out.write("        <script src=\"https://use.fontawesome.com/45e03a14ce.js\"></script>\n");
      out.write("        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("        <script src=\"js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    </body>\n");
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
