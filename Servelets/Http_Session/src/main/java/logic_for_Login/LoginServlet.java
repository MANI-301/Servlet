package logic_for_Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		if(email.equals("mani@gmail.com")) {
			if(password.equals("07")) {
				HttpSession session = req.getSession(true);
				
				resp.sendRedirect("home");			
				
				// RequestDispatcher dispatcher = req.getRequestDispatcher("home");
//				dispatcher.forward(req, resp);
				
			}
			else {
				out.print("<h1 style='color:red'>Incorrect Password</h1>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
				dispatcher.include(req, resp);
			}
			
		}
		else {
			out.print("<h1 style='color:red'>Email Not Found</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
		
		
		
	}

}
