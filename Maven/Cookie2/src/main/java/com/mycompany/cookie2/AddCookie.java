package com.mycompany.cookie2;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;
public class AddCookie extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("text/html");
        try(PrintWriter pw=response.getWriter())
        {
            Enumeration<String> e=request.getParameterNames();
            while(e.hasMoreElements())
            {
                String name=e.nextElement();
                String value=request.getParameter(name);
                pw.println(name+": "+value+"<br>");
                Cookie cookie=new Cookie("Cookie",name);
                response.addCookie(cookie);
            }
           /* String user_name=request.getParameter("Username");
            String password=request.getParameter("Password");
            Cookie name=new Cookie("Username",user_name);
            Cookie pass=new Cookie("Passowrd",password);
            response.addCookie(name);
            response.addCookie(pass);*/
        }
    }
}