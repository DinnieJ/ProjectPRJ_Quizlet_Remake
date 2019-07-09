package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.User;

public final class questionlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <title>Question List</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/common.css?v=1.1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/topnav.css?v=1.1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/project.css?v=1.1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/left-column.css?v=1.1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/question.css?v=1.1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/checkbox.css?v=1.1\">\n");
      out.write("        <link rel=\"icon\" href=\"icons/favicon.ico\" type=\"image/gif\" sizes=\"16x16\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            User      u = (User)session.getAttribute("user");
            String    setId = request.getParameter("id");
        
      out.write("\n");
      out.write("        <div class=\"main topnav\">\n");
      out.write("            <section class=\"nav-section\">\n");
      out.write("                <a href=\"project-list.jsp\" class=\"\">\n");
      out.write("                    <img src=\"icons/favicon.ico\" class=\"icon\">Questions\n");
      out.write("                </a>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"nav-section\">\n");
      out.write("                <a href=\"#\" class=\"\">\n");
      out.write("                    <img src=\"icons/search-icon.png\" class=\"icon\">Search\n");
      out.write("                </a>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"nav-section account\">\n");
      out.write("                <a href=\"login.jsp\" class=\"\">\n");
      out.write("                    ");
      out.print(u.getName());
      out.write("(Sign Out)\n");
      out.write("                </a>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <aside class=\"left-col\">\n");
      out.write("                <ul class=\"aside-menu\">\n");
      out.write("                    <li class=\"aside-menu__item border-btn\">\n");
      out.write("                        <a href=\"\">?? ??c Duy</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <h4 class=\"aside-menu__caption\">project</h4>\n");
      out.write("                <ul class=\"aside-menu\">\n");
      out.write("                    <li class=\"aside-menu__item border-btn\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            Application Layer\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <h4 class=\"aside-menu__caption\">Practice</h4>\n");
      out.write("                <ul class=\"aside-menu\">\n");
      out.write("                    <li class=\"aside-menu__item border-btn\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            Learn\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"aside-menu__item border-btn\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            Test\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <h4 class=\"aside-menu__caption\">action</h4>\n");
      out.write("                <ul class=\"aside-menu\">\n");
      out.write("                    <li class=\"aside-menu__item border-btn\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            Create Question\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <div class=\"question-list\">\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"question-post\">\n");
      out.write("                    <h1 class=\"question-content \">\n");
      out.write("                        Http stands for ...\n");
      out.write("                    </h1>\n");
      out.write("                    <hr style=\"width: 90%\">\n");
      out.write("                    <div class=\"checkbox rounded-22\">\n");
      out.write("                        <div class=\"checkbox-container\">\n");
      out.write("                            <input id=\"checkbox-rounded-22\" type=\"checkbox\" checked disabled/>\n");
      out.write("                            <div class=\"checkbox-checkmark\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"checkbox-rounded-22\">Answer A</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"checkbox rounded-22 disabled\">\n");
      out.write("                        <div class=\"checkbox-container\">\n");
      out.write("                            <input id=\"checkbox-rounded-22\" type=\"checkbox\" />\n");
      out.write("                            <div class=\"checkbox-checkmark\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"checkbox-rounded-22\">Answer B</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"checkbox rounded-22 disabled\">\n");
      out.write("                        <div class=\"checkbox-container\">\n");
      out.write("                            <input id=\"checkbox-rounded-22\" type=\"checkbox\" />\n");
      out.write("                            <div class=\"checkbox-checkmark\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"checkbox-rounded-22\">Answer C</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"checkbox rounded-22 disabled\">\n");
      out.write("                        <div class=\"checkbox-container\">\n");
      out.write("                            <input id=\"checkbox-rounded-22\" type=\"checkbox\" />\n");
      out.write("                            <div class=\"checkbox-checkmark\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <label for=\"checkbox-rounded-22\">Answer D</label>\n");
      out.write("                    </div>\n");
      out.write("                    <footer class=\"post__footer question-footer\">\n");
      out.write("                        <a class=\"post__footer-button\">\n");
      out.write("                            Delete\n");
      out.write("                        </a>\n");
      out.write("                    </footer>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>");
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
