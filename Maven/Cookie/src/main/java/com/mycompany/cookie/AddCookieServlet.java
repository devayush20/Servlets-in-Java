
package com.mycompany.cookie;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddCookieServlet extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException
    {
        String data=req.getParameter("data");
        Cookie cookie=new Cookie("MyCookie",data);
        response.addCookie(cookie);
        response.setContentType("text/html");
        try (PrintWriter pw = response.getWriter()) {
            pw.println("<B>Cookie has been set to");
            pw.println(" "+data);
        }
    }
}

