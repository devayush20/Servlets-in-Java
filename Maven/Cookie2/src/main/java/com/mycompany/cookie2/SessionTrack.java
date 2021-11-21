package com.mycompany.cookie2;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
    
public class SessionTrack extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        HttpSession hs=request.getSession(true);
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        pw.print("<B>");
        Date date=(Date)hs.getAttribute("date");
        if(date!=null)
        {
            pw.print("Last Access: "+date+"<br>");
        }
        date=new Date();
        hs.setAttribute("date",date);
        pw.println("Current date: "+date);
    }
}
