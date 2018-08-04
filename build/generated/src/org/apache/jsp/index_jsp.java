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

      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <!DOCTYPE html>\r\n");
      out.write("        <html>\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta charset=\"UTF-8\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n");
      out.write("                crossorigin=\"anonymous\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("            <title>Tic Tac Toe</title>\r\n");
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row mt-5\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <h1 class=\"text-center\">Tic Tac Toe</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row my-5\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <table class=\"table text-center myTable\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td id=\"R1_C1\"></td>\r\n");
      out.write("                                <td id=\"R1_C2\"></td>\r\n");
      out.write("                                <td id=\"R1_C3\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td id=\"R2_C1\"></td>\r\n");
      out.write("                                <td id=\"R2_C2\"></td>\r\n");
      out.write("                                <td id=\"R2_C3\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td id=\"R3_C1\"></td>\r\n");
      out.write("                                <td id=\"R3_C2\"></td>\r\n");
      out.write("                                <td id=\"R3_C3\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col text-center\">\r\n");
      out.write("                        <h3>Player1 (X) Score</h3>\r\n");
      out.write("                        <h4 id=\"player1Score\" class=\"mt-3\">0</h4>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col text-center\">\r\n");
      out.write("                        <h3>Tie Score</h3>\r\n");
      out.write("                        <h4 id=\"tieScore\" class=\"mt-3\">0</h4>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col text-center\">\r\n");
      out.write("                        <h3>Player2 (O) Score</h3>\r\n");
      out.write("                        <h4 id=\"player2Score\" class=\"mt-3\">0</h4>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </body>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        </html>");
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
