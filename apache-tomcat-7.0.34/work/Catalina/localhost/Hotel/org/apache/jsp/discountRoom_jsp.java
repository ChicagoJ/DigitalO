/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.34
 * Generated at: 2017-11-13 07:00:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import iit.*;

public final class discountRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Discount Rooms Information</title>\n");
      out.write("<link\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Open+Sans:600italic,700italic,800italic,400,300,600,700,800'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Pinyon+Script' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Quicksand:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/styles_login.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");

		User user = (User) session.getAttribute("user");
	
      out.write("\n");
      out.write("\n");
      out.write("\t<!--header starts-->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"top-header\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t<a href=\"./HomeServlet\"><font size=\"6\" color=\"yellow\">");
      out.print(Constant.NAME );
      out.write(" HOTELS</font></a>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span class=\"menu\"> </span>\n");
      out.write("\t\t\t\t<div class=\"m-clear\"></div>\n");
      out.write("\t\t\t\t<div class=\"top-menu\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"./HomeServlet\">START</a></li>\n");
      out.write("\t\t\t\t\t");

						if (user == null) {
					
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><a href=\"signin.jsp\">SIGN IN</a></li>\n");
      out.write("\t\t\t\t\t");

						} else {
							ShoppingCart cart = user.getCart();
							if(user.getLevel() == 1) {
					
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"scoll\"><a href=\"analytics.jsp\">ANALYTICS</a></li>\n");
      out.write("\t\t\t\t\t\t\t");

							}
							if(user.getLevel() == 2) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"scroll\"><a href=\"manage.jsp\">MANAGEMENT</a></li>\n");
      out.write("\t\t\t\t\t\t\t");

							}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<li class=\"scroll\"><a href=\"signout.jsp\">HI, ");
      out.print(user.getUsername());
      out.write("! SIGNOUT?</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"scroll\"><a href=\"cart.jsp\">CART ");
      out.print((cart != null && !cart.isEmpty() ? "(" + cart.getObjNumber() + ")" : ""));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"scroll\"><a href=\"reservations.jsp\">RESERVATIONS</a></li>\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"scroll\"><a href=\"register.jsp\">REGISTER</a></li>\n");
      out.write("\t\t\t\t\t\t<!-- <li class=\"scroll\"><a href=\"restaurant.jsp\">RESTAURANT</a></li> -->\n");
      out.write("\t\t\t\t\t</ul>\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t$(\"span.menu\").click(function() {\n");
      out.write("\t\t\t\t\t\t\t$(\".top-menu ul\").slideToggle(200);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");

		ArrayList<Room> roomList = RoomDAO.getRoomList();
	
      out.write("\n");
      out.write("\t<script src=\"js/jquery-ui.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\n");
      out.write("\t\t$(function() {\n");
      out.write("\n");
      out.write("\t\t\t$(\"#price\").change(function(){\n");
      out.write("\t\t\t\tvar priceVal = $.trim(this.value);\n");
      out.write("\t\t\t\tvar flag = false;\n");
      out.write("\t\t\t\tvar reg = /^[0-9]*(.[0-9]*)?([eE][-+][0-9]*)?$/;\n");
      out.write("\t\t\t\tvar price = -1;\n");
      out.write("\t\t\t\tif(reg.test(priceVal)){\n");
      out.write("\t\t\t\t\tprice = parseDouble(priceVal);\n");
      out.write("\t\t\t\t\tif(price > 0){\n");
      out.write("\t\t\t\t\t\tflag = true;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(!flag){\n");
      out.write("\t\t\t\t\talert(\"Invalid input\");\n");
      out.write("\t\t\t\t\t$(this).val($(this).attr(\"class\"));\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t//ajax change cartRoom quantity\n");
      out.write("\t\t\t$(\"#discount\").change(function(){\n");
      out.write("\t\t\t\tvar discountVal = $.trim(this.value);\n");
      out.write("\t\t\t\tvar flag = false;\n");
      out.write("\t\t\t\tvar reg = /^[0-9]*(.[0-9]*)?([eE][-+][0-9]*)?$/;\n");
      out.write("\t\t\t\tvar discount = -1;\n");
      out.write("\t\t\t\tif(reg.test(discountVal)){\n");
      out.write("\t\t\t\t\tdiscount = parseDouble(discountVal);\n");
      out.write("\t\t\t\t\tif(discount > 0){\n");
      out.write("\t\t\t\t\t\tflag = true;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(!flag){\n");
      out.write("\t\t\t\t\talert(\"Invalid input\");\n");
      out.write("\t\t\t\t\t$(this).val($(this).attr(\"class\"));\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<div id=\"body\" class=\"rooms text-center\">\n");
      out.write("\t\t<section id=\"content\">\n");
      out.write("\t\t\t<article>\n");
      out.write("\t\t\t\t<h3>Discount information for Rooms</h3>\n");
      out.write("\t\t\t\t<a href=\"#\" onclick=\"javascript:history.back(-1);\">Return</a>\n");
      out.write("\t\t\t\t<div id=\"error\"></div>\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<article>\n");
      out.write("\t\t\t\t<center><table style=\"border-collapse: separate; border-spacing: 30px 50px;\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>Hotel Name</td>\n");
      out.write("\t\t\t\t\t\t<td>City</td>\n");
      out.write("\t\t\t\t\t\t<!-- <td>room Id</td> -->\n");
      out.write("\t\t\t\t\t\t<td>room Type</td>\n");
      out.write("\t\t\t\t\t\t<!-- <td>Description</td> -->\n");
      out.write("\t\t\t\t\t\t<td>Price</td>\n");
      out.write("\t\t\t\t\t\t<td>Discount</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t");

						for(Room room: roomList) {
						if (room.getDiscount() != 1){
								String hid = room.getHid();
								String hname = HotelDAO.getHotelById(hid).getName();
								String roomId = room.getRoomId();
								String city = HotelDAO.getHotelById(hid).getCity();
								String roomType ="";
							if (room.getRoomType().equals("f")){
									roomType += "Family Room";
							} else if (room.getRoomType().equals("ld")){
									roomType += "Deluxe Double";
							} else if (room.getRoomType().equals("ls")){
									roomType += "Deluxe Single";
							} else if (room.getRoomType().equals("sd")){
									roomType += "Standard Double";
							} else if (room.getRoomType().equals("ss")){
									roomType += "Standard Single";
							}
					
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(hname );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(city );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <td>");
      out.print(roomId );
      out.write("</td> -->\n");
      out.write("\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(roomType );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(room.getDescp() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</td> -->\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(room.getPrice() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print(room.getDiscount() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");

						}
							}
					
      out.write("\n");
      out.write("\t\t\t\t</table></center>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t</section>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"fotter-info\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"hotel-info\">\n");
      out.write("\t\t\t\t<h4>Get to Know Us</h4>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Career</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">About</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=hotel-info>\n");
      out.write("\t\t\t\t<h4>Apps</h4>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">iOS</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Android</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=hotel-info>\n");
      out.write("\t\t\t\t<h4>Let Us Help You</h4>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Help</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"color: rgba(237, 237, 237, 0.87)\">Contact Us</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<h6>\n");
      out.write("\t\t\t<p>CSP 584 - Project</p>\n");
      out.write("\t\t</h6>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
