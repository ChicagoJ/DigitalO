/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.34
 * Generated at: 2017-11-11 20:50:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import iit.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Sign in</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Open+Sans:600italic,700italic,800italic,400,300,600,700,800'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Pinyon+Script' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Quicksand:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"css/styles_login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");

		User user = (User) session.getAttribute("user");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!--header starts-->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"top-header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"./HomeServlet\"><font size=\"6\" color=\"yellow\">");
      out.print(Constant.NAME );
      out.write(" HOTELS</font></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<span class=\"menu\"> </span>\r\n");
      out.write("\t\t\t\t<div class=\"m-clear\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"./HomeServlet\">START</a></li>\r\n");
      out.write("\t\t\t\t\t");

						if (user == null) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"signin.jsp\">SIGN IN</a></li>\r\n");
      out.write("\t\t\t\t\t");

						} else {
							if(user.getLevel() == 1) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"scoll\"><a href=\"analytics.jsp\">ANALYTICS</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"scroll\"><a href=\"signout.jsp\">HI, ");
      out.print(user.getUsername());
      out.write("SIGNOUT?</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"scroll\"><a href=\"reservations.jsp\">RESERVATIONS</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"register.jsp\">REGISTER</a></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- <li class=\"scroll\"><a href=\"restaurant.jsp\">RESTAURANT</a></li> -->\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t$(\"span.menu\").click(function() {\r\n");
      out.write("\t\t\t\t\t\t\t$(\".top-menu ul\").slideToggle(200);\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br><br><br>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"body\">\r\n");
      out.write("\t\t<section id=\"content\">\r\n");
      out.write("\t\t\t<article style=\"margin-left:35%\">\r\n");
      out.write("\t\t\t\t<div class=\"login-page\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<form class=\"login-form\" action=\"./SigninServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"username\" /> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" name=\"password\" placeholder=\"password\" />\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\">login</button>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t\tNot registered? <a href=\"./register.jsp\">Create an account</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"fotter-info\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"hotel-info\">\r\n");
      out.write("\t\t\t\t<h4>Get to Know Us</h4>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Career</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">About</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=hotel-info>\r\n");
      out.write("\t\t\t\t<h4>Apps</h4>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">iOS</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Android</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=hotel-info>\r\n");
      out.write("\t\t\t\t<h4>Let Us Help You</h4>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Help</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Contact Us</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<h6>\r\n");
      out.write("\t\t\t<p>CSP 584 - Project</p>\r\n");
      out.write("\t\t</h6>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
