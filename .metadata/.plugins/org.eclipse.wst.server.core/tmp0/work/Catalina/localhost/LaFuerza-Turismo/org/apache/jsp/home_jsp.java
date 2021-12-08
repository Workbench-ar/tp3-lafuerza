/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.13
 * Generated at: 2021-12-08 20:59:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "partials/head.jsp", out, false);
      out.write("\n");
      out.write("<!-- MDB -->\n");
      out.write("<link\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\"\n");
      out.write("	rel=\"stylesheet\" />\n");
      out.write("<link href=\"/LaFuerza-Turismo/assets/css/home.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"/LaFuerza-Turismo/assets/css/login3.css\" rel=\"stylesheet\" />\n");
      out.write("<script defer type=\"text/javascript\"\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div id=\"back\" class=\"bg-image\">\n");
      out.write("\n");
      out.write("		<div id=\"botones\">\n");
      out.write("\n");
      out.write("\n");
      out.write("			<div class=\"d-flex justify-content-center bd-highlight mb-3\">\n");
      out.write("\n");
      out.write("				<div class=\"p-2\">\n");
      out.write("					<div class=\"mb-3 p-3 rounded fondoTransparente\">\n");
      out.write("						<h3>¿DE QUE LADO ESTAS?</h3>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div\n");
      out.write("				class=\"d-flex justify-content-around bd-highlight example-parent \">\n");
      out.write("				<div class=\"p-2 d-flex flex-column align-items-center\">\n");
      out.write("					<div class=\"fondoTransparente  rounded iconos text-center\">\n");
      out.write("						<img class=\"m-3 logos\"\n");
      out.write("							src=\"/LaFuerza-Turismo/assets/img/home/light.png\">\n");
      out.write("					</div>\n");
      out.write("					<div class=\"mt-2\">\n");
      out.write("						<form method=\"get\" action=\"guest\">\n");
      out.write("							<button type=\"submit\"\n");
      out.write("								class=\"btn fondoTransparente rounded btn-lg mt-2 iconos\"\n");
      out.write("								value=\"Lado Luminoso\" name=\"lado\">LUMINOSO</button>\n");
      out.write("						</form>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("				<div class=\"p-2 d-flex flex-column align-items-center\">\n");
      out.write("					<div class=\"fondoTransparente  rounded iconos text-center\">\n");
      out.write("						<img class=\"m-3 logos\"\n");
      out.write("							src=\"/LaFuerza-Turismo/assets/img/home/dark.png\">\n");
      out.write("					</div>\n");
      out.write("					<div class=\"mt-2\">\n");
      out.write("\n");
      out.write("						<form method=\"get\" action=\"guest\">\n");
      out.write("							<button type=\"submit\"\n");
      out.write("								class=\"btn fondoTransparente rounded btn-lg mt-2 iconos\"\n");
      out.write("								value=\"Lado Oscuro\" name=\"lado\">OSCURO</button>\n");
      out.write("						</form>\n");
      out.write("\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
