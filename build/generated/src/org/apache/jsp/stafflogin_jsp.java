package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stafflogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <title>Staff Login</title>\r\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/images/icon.png\" >\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Additional CSS Files -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-woox-travel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\r\n");
      out.write("    <link rel=\"stylesheet\"href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("  <!-- ***** Preloader Start ***** -->\r\n");
      out.write("  <div id=\"js-preloader\" class=\"js-preloader\">\r\n");
      out.write("    <div class=\"preloader-inner\">\r\n");
      out.write("      <span class=\"dot\"></span>\r\n");
      out.write("      <div class=\"dots\">\r\n");
      out.write("        <span></span>\r\n");
      out.write("        <span></span>\r\n");
      out.write("        <span></span>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- ***** Preloader End ***** -->\r\n");
      out.write("\r\n");
      out.write("  <!-- ***** Header Area Start ***** -->\r\n");
      out.write("  <header class=\"header-area header-sticky\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <nav class=\"main-nav\">\r\n");
      out.write("                    <!-- ***** Logo Start ***** -->\r\n");
      out.write("                    <a href=\"index.html\" class=\"logo\">\r\n");
      out.write("                        <img src=\"assets/images/logoup.png\" alt=\"\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- ***** Logo End ***** -->\r\n");
      out.write("                    <!-- ***** Menu Start ***** -->\r\n");
      out.write("                    <ul class=\"nav\">\r\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"checkflight.jsp\">Check Flight</a></li>\r\n");
      out.write("                        <li><a href=\"ticketbook.jsp\">Book Tickets</a></li>\r\n");
      out.write("                        <li><a href=\"stafflogin.jsp\" class=\"active\">Staff Login</a></li>\r\n");
      out.write("                        <li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("                    </ul>   \r\n");
      out.write("                    <a class='menu-trigger'>\r\n");
      out.write("                        <span>Menu</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- ***** Menu End ***** -->\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("  <!-- ***** Header Area End ***** -->\r\n");
      out.write("\r\n");
      out.write("  <div class=\"second-page-heading\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-12\">\r\n");
      out.write("          <h4>Staff Member Login Portal</h4>\r\n");
      out.write("          <h2>Signin or Signup to Access</h2>\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt uttersi labore et dolore magna aliqua is ipsum suspendisse ultrices gravida</p>\r\n");
      out.write("          <div class=\"main-button\"><a href=\"signinstaff.jsp\">  Sign In   </a></div>\r\n");
      out.write("          <div class=\"main-button\"><a href=\"signupstaff.jsp\">  Sign Up  </a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <footer>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-12\">\r\n");
      out.write("          <p>Copyright © 2022 <a href=\"#\">Phoenix Airlines</a> Company. All rights reserved. \r\n");
      out.write("          <br>Design: <a href=\"\" target=\"_blank\" title=\"\">NSBM Green University</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Scripts -->\r\n");
      out.write("  <!-- Bootstrap core JavaScript -->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"assets/js/isotope.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/js/owl-carousel.js\"></script>\r\n");
      out.write("  <script src=\"assets/js/wow.js\"></script>\r\n");
      out.write("  <script src=\"assets/js/tabs.js\"></script>\r\n");
      out.write("  <script src=\"assets/js/popup.js\"></script>\r\n");
      out.write("  <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    $(\".option\").click(function(){\r\n");
      out.write("      $(\".option\").removeClass(\"active\");\r\n");
      out.write("      $(this).addClass(\"active\"); \r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
