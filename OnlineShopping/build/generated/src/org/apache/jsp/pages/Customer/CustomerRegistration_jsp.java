package org.apache.jsp.pages.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String str = (String) request.getAttribute("msg");
            if (str != null) {
        
      out.write("\n");
      out.write("        ");
      out.print(str);
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <form action=\"/OnlineShopping/CustomerController\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Username</td>\n");
      out.write("                    <td><input type=\"text\" autofocus=\"\" autocomplete=\"off\" placeholder=\"enter Username\" title=\"a-z\"  name=\"uname\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pwd\" placeholder=\"enter Password\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" placeholder=\"enter name\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Emailid</td>\n");
      out.write("                    <td><input type=\"text\" name=\"emailid\" placeholder=\"enter email\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mobile Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mno\" placeholder=\"enter Mobile number\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City</td>\n");
      out.write("                    <td><input type=\"text\" name=\"city\" placeholder=\"enter City\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>State</td>\n");
      out.write("                    <td><input type=\"text\" name=\"state\" placeholder=\"enter State\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Country</td>\n");
      out.write("                    <td><input type=\"text\" name=\"country\" placeholder=\"enter Country\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Idtype</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"idtype\">\n");
      out.write("                            <option value=\"voterid\">voterid</option>\n");
      out.write("                            <option value=\"aadharcard\">adhaarcard</option>\n");
      out.write("                            <option value=\"pancard\">pancard</option>\n");
      out.write("                            <option value=\"license\">license</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Idno</td>\n");
      out.write("                    <td><input type=\"text\" name=\"idno\" placeholder=\"enter id number\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"opn\" value=\"REGISTER\"></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
