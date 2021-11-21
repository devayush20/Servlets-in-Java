
package com.mycompany.handleget;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Handleget extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep)throws IOException,ServletException
    {
        String color=req.getParameter("color");
        rep.setContentType("text/html");
        try (PrintWriter pw = rep.getWriter()) {
            pw.println("<B>The chosen color is: "+color);
        }
    }
}