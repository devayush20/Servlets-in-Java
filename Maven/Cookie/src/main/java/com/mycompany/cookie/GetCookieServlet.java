package com.mycompany.cookie;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class GetCookieServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
        Cookie[] cookies=request.getCookies();
        response.setContentType("text/html");
        try (PrintWriter pw = response.getWriter()) {
            pw.println("<B>");
            for(int i=0;i<cookies.length;i++)
            {
                String name=cookies[i].getName();
                String value=cookies[i].getValue();
                pw.println("Name= "+name);
                pw.println("Value= "+value);
            }
        }    
    }
}