package com;
import javax.servlet.*;
import java.io.*;

public class StaticServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String html = "<html>"
				+ "<body>"
				+ "<h1>It is Static Resourse</h1>"
				+ "</body>"
				+ "</html>";
		// used to print on browser
		PrintWriter out = res.getWriter();
		out.print(html);

	}
}
