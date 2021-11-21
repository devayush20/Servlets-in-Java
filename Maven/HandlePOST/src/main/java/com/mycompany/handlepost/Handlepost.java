
package com.mycompany.handlepost;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Handlepost extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep)throws IOException, ServletException
    {
        String color=req.getParameter("color");
        rep.setContentType("text/html");
        try (PrintWriter pw = rep.getWriter()) {
            pw.println("The color is: "+color);
        }  
    }
}