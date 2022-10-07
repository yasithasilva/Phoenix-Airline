package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admindash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <head>\n");
      out.write("        \n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>Staff Dashboard</title>\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/images/icon.png\" >\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-woox-travel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("    <link rel=\"stylesheet\"href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  <!-- ***** Preloader Start ***** -->\n");
      out.write("  <div id=\"js-preloader\" class=\"js-preloader\">\n");
      out.write("    <div class=\"preloader-inner\">\n");
      out.write("      <span class=\"dot\"></span>\n");
      out.write("      <div class=\"dots\">\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("        <span></span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- ***** Preloader End ***** -->\n");
      out.write("\n");
      out.write("  <!-- ***** Header Area Start ***** -->\n");
      out.write("  <header class=\"header-area header-sticky\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <nav class=\"main-nav\">\n");
      out.write("                    <!-- ***** Logo Start ***** -->\n");
      out.write("                    <a href=\"index.html\" class=\"logo\">\n");
      out.write("                        <img src=\"assets/images/logoup.png\" alt=\"\">\n");
      out.write("                    </a>\n");
      out.write("                    <!-- ***** Logo End ***** -->\n");
      out.write("                    <!-- ***** Menu Start ***** -->\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"admindash.jsp\" class=\"active\">Dashboard</a></li>\n");
      out.write("                        <li><a href=\"flightm.jsp\">Flight Menu</a></li>\n");
      out.write("                        <li><a href=\"ticketm.jsp\">Ticket Menu</a></li>\n");
      out.write("                        <li><a href=\"userm.jsp\">User Menu</a></li>\n");
      out.write("                        <li><a href=\"staffreq.jsp\">Staff Requests</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>   \n");
      out.write("                    <a class='menu-trigger'>\n");
      out.write("                        <span>Menu</span>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- ***** Menu End ***** -->\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <!-- ***** Header Area End ***** -->\n");
      out.write("\n");
      out.write("  <div class=\"second-page-heading\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("          <h4>Staff Member Dashboard</h4>\n");
      out.write("          <h2>Acess Manging Portals Below</h2>\n");
      out.write("          \n");
      out.write("          <div class=\"main-button\"><a href=\"flightm.jsp\">  Manage Flights   </a></div>\n");
      out.write("          <div class=\"main-button\"><a href=\"ticketm.jsp\">  Manage Tickets  </a></div>\n");
      out.write("          <div class=\"main-button\"><a href=\"userm.jsp\">    Manage Users    </a></div>\n");
      out.write("          <div class=\"main-button\"><a href=\"staffreq.jsp\">    Staff Requests    </a></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("          <p>Copyright © 2022 <a href=\"#\">Phoenix Airlines</a> Company. All rights reserved. \n");
      out.write("          <br>Design: <a href=\"\" target=\"_blank\" title=\"\">NSBM Green University</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Scripts -->\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"assets/js/isotope.min.js\"></script>\n");
      out.write("  <script src=\"assets/js/owl-carousel.js\"></script>\n");
      out.write("  <script src=\"assets/js/wow.js\"></script>\n");
      out.write("  <script src=\"assets/js/tabs.js\"></script>\n");
      out.write("  <script src=\"assets/js/popup.js\"></script>\n");
      out.write("  <script src=\"assets/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    $(\".option\").click(function(){\n");
      out.write("      $(\".option\").removeClass(\"active\");\n");
      out.write("      $(this).addClass(\"active\"); \n");
      out.write("    });\n");
      out.write("  </script>\n");
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
