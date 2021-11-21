
package com.mycompany.mavenproject4;
import java.util.*;
import java.io.*;
import javax.servlet.*;
public class Form_new extends GenericServlet
{
    @Override
    public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        Enumeration<String> e=request.getParameterNames();
        while(e.hasMoreElements())
        {
            String name=e.nextElement();
            String value=request.getParameter(name);
            pw.println(name+" : "+value+"<br>");
        }
        pw.close();
    }
}