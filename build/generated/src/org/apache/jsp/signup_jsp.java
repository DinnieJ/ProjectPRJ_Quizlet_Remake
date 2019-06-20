package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/login.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/common.css\">\n");
      out.write("        <link rel=\"icon\" href=\"icons/favicon.ico\" type=\"image/gif\" sizes=\"16x16\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <form action=\"SignUpServer\" method=\"post\">\n");
      out.write("                <h1 class=\"title\">Sign Up</h1>\n");
      out.write("                ");

                    if(request.getAttribute("message")!=null){
                
      out.write("\n");
      out.write("                <h4 class=\"warning shadow-box\">");
      out.print(request.getAttribute("message"));
      out.write("</h4>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"User name\">\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Email\">\n");
      out.write("                <input type=\"submit\" value=\"Sign Up\" class=\"border-btn\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
