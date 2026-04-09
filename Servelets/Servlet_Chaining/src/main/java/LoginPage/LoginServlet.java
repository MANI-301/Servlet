package LoginPage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String email = req.getParameter("email");
	String pass = req.getParameter("pass");
	
	PrintWriter out = resp.getWriter(); 
	
	if (email.equals("mani@gmail.com")) {
		if (pass.equals("123")) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("demo.html");
		dispatcher.forward(req, resp);
	}
	
	else {
		out.print("<h1 style='color:red' >Incorect Password</h1> ");
		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
				dispatcher.include(req, resp);
	}
}
	else {
		out.print("<h1 style='color:red' >Email Not Found</h1> ");
		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
				dispatcher.include(req, resp);

}
}
}
