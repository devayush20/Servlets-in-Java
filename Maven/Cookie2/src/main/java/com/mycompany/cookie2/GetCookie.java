/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.cookie2;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class GetCookie extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
    {
        Cookie cookies[]=request.getCookies();
        response.setContentType("text/html");
        try (PrintWriter pw=response.getWriter())
        {
            //pw.println("<B>");
            for(int i=0;i<cookies.length;i++)
            {
                String name=cookies[i].getName();
                String value=cookies[i].getValue();
                pw.println(name+": ");
                pw.println("<B>"+value+"</B><br>");
            }
        }
    }
}