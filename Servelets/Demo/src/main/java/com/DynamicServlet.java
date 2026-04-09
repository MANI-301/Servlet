package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.*;


public class DynamicServlet extends GenericServlet{
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       Date d = new Date();
        String html = "<html>"
        		+ "<body>"
        		+ "<h1>Hi Current Date is  "+d+"</h1>"
        		+ "</body>"
        		+ "</html>";
        PrintWriter out = res.getWriter();
        out.print(html);
	}
	}

