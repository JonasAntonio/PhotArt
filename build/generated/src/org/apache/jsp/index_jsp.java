package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Avaliacao;

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
      out.write("        <title> Photart</title>\n");
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
      out.write("                        <div class=\"pull-right\">\n");
      out.write("                            <h3><span class=\"glyphicon glyphicon-camera\" aria-hidden=\"true\"></span> Simetria <small> por @yuanzhangliang</small></h3>\n");
      out.write("                        </div>\n");
      out.write("                        <img src=\"img/pic.jpg\" alt=\"...\" class=\"img-thumbnail\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <a id=\"addcomment\" href=\"add-comment.jsp\" class=\"btn btn-lg btn-success\" > <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span> Adicionar Avaliação </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3 col-sm-offset-6\">\n");
      out.write("                            <div>\n");
      out.write("                                <h2> <small style=\"color: black\">Avaliação </small> 4.3 <small>/ 5</small></h2>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-warning btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-warning btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-warning btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-default btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <h2>Avaliações</h2>\n");
      out.write("                        <hr />\n");
      out.write("                        <div>\n");
      out.write("                            ");
 List<Avaliacao> avaliacoes = (List<Avaliacao>) session.getAttribute("avaliacoes");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"media\">\n");
      out.write("                                <div class=\"media-left\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img alt=\"64x64\" class=\"media-object\" data-src=\"holder.js/64x64\" src=\"data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/PjxzdmcgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB3aWR0aD0iNjQiIGhlaWdodD0iNjQiIHZpZXdCb3g9IjAgMCA2NCA2NCIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+PCEtLQpTb3VyY2UgVVJMOiBob2xkZXIuanMvNjR4NjQKQ3JlYXRlZCB3aXRoIEhvbGRlci5qcyAyLjYuMC4KTGVhcm4gbW9yZSBhdCBodHRwOi8vaG9sZGVyanMuY29tCihjKSAyMDEyLTIwMTUgSXZhbiBNYWxvcGluc2t5IC0gaHR0cDovL2ltc2t5LmNvCi0tPjxkZWZzPjxzdHlsZSB0eXBlPSJ0ZXh0L2NzcyI+PCFbQ0RBVEFbI2hvbGRlcl8xNWRiYTEwYTc2ZCB0ZXh0IHsgZmlsbDojQUFBQUFBO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1mYW1pbHk6QXJpYWwsIEhlbHZldGljYSwgT3BlbiBTYW5zLCBzYW5zLXNlcmlmLCBtb25vc3BhY2U7Zm9udC1zaXplOjEwcHQgfSBdXT48L3N0eWxlPjwvZGVmcz48ZyBpZD0iaG9sZGVyXzE1ZGJhMTBhNzZkIj48cmVjdCB3aWR0aD0iNjQiIGhlaWdodD0iNjQiIGZpbGw9IiNFRUVFRUUiLz48Zz48dGV4dCB4PSIxMi41NDY4NzUiIHk9IjM2LjUiPjY0eDY0PC90ZXh0PjwvZz48L2c+PC9zdmc+\" data-holder-rendered=\"true\" style=\"width: 64px; height: 64px;\">\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    <h3 class=\"media-heading\">Top aligned media <small>por @</small></h3>\n");
      out.write("                                    <p class=\"comment\"></p>\n");
      out.write("                                    <div >\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-warning btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-warning btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-warning btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-warning  btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default btn-sm\" aria-label=\"Left Align\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-star\" aria-hidden=\"true\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                    <br>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
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
