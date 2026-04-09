package Http_Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Mani") // used to map RURL with Servlet class
public class HttpDemo extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		
		PrintWriter out = res.getWriter();
		out.print("<h1> Hi this is Post Method</h1>");
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		
		PrintWriter out = res.getWriter();
		out.print("<h1> Hi this is Get Method</h1>");
	}

}
