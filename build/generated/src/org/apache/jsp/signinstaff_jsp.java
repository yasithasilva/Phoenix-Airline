package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signinstaff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>Sign in </title>\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/images/icon.png\" >\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"asse/ts/css/templatemo-woox-travel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assetscss/owl.css\">\n");
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
      out.write("                        <li><a href=\"checkflight.jsp\">Check Flight</a></li>\n");
      out.write("                        <li><a href=\"ticketbook.jsp\">Book Tickets</a></li>\n");
      out.write("                        <li><a href=\"stafflogin.jsp\" class=\"active\">Staff Login</a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About</a></li>\n");
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
      out.write("          <h2>Sign in now to access our premium features</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"more-info reservation-info\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("          <div class=\"info-item\">\n");
      out.write("            <i class=\"fa fa-phone\"></i>\n");
      out.write("            <h4>Make a Phone Call</h4>\n");
      out.write("            <a href=\"#\">+123 456 789 (0)</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("          <div class=\"info-item\">\n");
      out.write("            <i class=\"fa fa-envelope\"></i>\n");
      out.write("            <h4>Contact Us via Email</h4>\n");
      out.write("            <a href=\"#\">company@email.com</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("          <div class=\"info-item\">\n");
      out.write("            <i class=\"fa fa-map-marker\"></i>\n");
      out.write("            <h4>Visit Our Offices</h4>\n");
      out.write("            <a href=\"#\">24th Street North Avenue London, UK</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"reservation-form\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"topic\">\n");
      out.write("        <h4>Sign in</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <tabel>\n");
      out.write("          <div class=\"col-lg-12\">\n");
      out.write("          <form id=\"reservation-form\" name=\"gs\" method=\"submit\" role=\"search\" action=\"#\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"table1\">\n");
      out.write("                <table>\n");
      out.write("                    <th>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                          <label for=\"Name\" class=\"form-label\">User Name or ID</label>\n");
      out.write("                          <input class=\"box\" type=\"text\" name=\"Name\" class=\"Name\" placeholder=\"example@123\" autocomplete=\"on\" required>\n");
      out.write("                     </td>\n");
      out.write("                      </tr>\n");
      out.write("                    </th>\n");
      out.write("                    <tr>\n");
      out.write("                      <td>\n");
      out.write("                        <label for=\"Name\" class=\"form-label\">Your Password</label>\n");
      out.write("                        <input class=\"box\" type=\"password\" name=\"password\" class=\"name\" placeholder=\"1XXX3#4\" autocomplete=\"on\" required>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                    \n");
      out.write("              </div>                       \n");
      out.write("\n");
      out.write("                     <button class=\"sign\"><a href=\"staffdash.jsp\"></a> Sign in </button>\n");
      out.write(" \n");
      out.write("                    \n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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
