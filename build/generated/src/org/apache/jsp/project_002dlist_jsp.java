package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Project List</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/common.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/topnav.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/project.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/left-column.css\">\n");
      out.write("    <link rel=\"icon\" href=\"icons/favicon.ico\" type=\"image/gif\" sizes=\"16x16\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <div class=\"main topnav\">\n");
      out.write("      <section class=\"nav-section\">\n");
      out.write("        <a href=\"#\" class=\"\">\n");
      out.write("          <img src=\"icons/favicon.ico\" class=\"icon\">Questions\n");
      out.write("        </a>\n");
      out.write("      </section>\n");
      out.write("      <section class=\"nav-section\">\n");
      out.write("        <a href=\"#\" class=\"\">\n");
      out.write("          <img src=\"icons/search-icon.png\" class=\"icon\">Search\n");
      out.write("        </a>\n");
      out.write("      </section>\n");
      out.write("      <section class=\"nav-section account\">\n");
      out.write("        <a href=\"#\" class=\"\">\n");
      out.write("          duyddhe130239@fpt.edu.vn\n");
      out.write("        </a>\n");
      out.write("      </section>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <aside class=\"left-col shadow-box\">\n");
      out.write("        <ul class=\"aside-menu\">\n");
      out.write("          <li class=\"aside-menu__item border-btn\">\n");
      out.write("            <a href=\"\">Đỗ Đức Duy</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <h4 class=\"aside-menu__caption\">action</h4>\n");
      out.write("\n");
      out.write("        <ul class=\"aside-menu\">\n");
      out.write("          <li class=\"aside-menu__item border-btn\">\n");
      out.write("            <a href=\"\">\n");
      out.write("              Create Project\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <h4 class=\"aside-menu__caption\">subjects list</h4>\n");
      out.write("\n");
      out.write("        <ul class=\"aside-menu\">\n");
      out.write("          <li class=\"aside-menu__item border-btn\">\n");
      out.write("            <a href=\"\">\n");
      out.write("              subjects 1\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"aside-menu__item border-btn\">\n");
      out.write("            <a href=\"\">\n");
      out.write("              subjects 2\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"aside-menu__item border-btn\">\n");
      out.write("            <a href=\"\">\n");
      out.write("              subjects 3\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"aside-menu__item border-btn\">\n");
      out.write("            <a href=\"\">\n");
      out.write("              subjects 4\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"aside-menu__item border-btn\">\n");
      out.write("            <a href=\"\">\n");
      out.write("              subjects 5\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </aside>\n");
      out.write("      <div class=\"list\">\n");
      out.write("        <article class=\"post\">\n");
      out.write("          <header class=\"post__header\">\n");
      out.write("            <a class=\"post__header-name\" href=\"\">Application Layer</a>\n");
      out.write("            <time class=\"post__header-time\">\n");
      out.write("              Đỗ Đức Duy\n");
      out.write("            </time>\n");
      out.write("          </header>\n");
      out.write("          <div class=\"post__text\">\n");
      out.write("            <p>Practive chapter 2</p>\n");
      out.write("            <p>Number of questions : 10</p>\n");
      out.write("          </div>\n");
      out.write("          <footer class=\"post__footer\">\n");
      out.write("            <span class=\"post__footer-button\">\n");
      out.write("              Learn\n");
      out.write("            </span>\n");
      out.write("            <span class=\"post__footer-button\">\n");
      out.write("              Like\n");
      out.write("            </span>\n");
      out.write("            <span class=\"post__footer-button\">\n");
      out.write("              Delete\n");
      out.write("            </span>\n");
      out.write("          </footer>\n");
      out.write("        </article>\n");
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
