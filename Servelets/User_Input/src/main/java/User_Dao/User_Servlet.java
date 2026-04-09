package User_Dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Private_data.User;

public class User_Servlet extends GenericServlet{
	 
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	
		int id = Integer.parseInt(req.getParameter("id"));
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 String password = req.getParameter("password");
		 int phone = Integer.parseInt(req.getParameter("phone"));
		 String gender = req.getParameter("gender");
		 
		 User u = new User();
		 
		 u.setId(id);
		 u.setName(name);
		 u.setEmail(email);
		 u.setPassword(password);
		 u.setPhone(phone);
		 u.setGender(gender);
		 
		 
		 User_Dao dao = new User_Dao();
		 
		 PrintWriter out = resp.getWriter();
		 
		 try {
			 dao.saveUser(u);
			 out.print("<h1>Data Saved</h1>");
		 }
		 catch(Exception e) {
			 out.print("<h1>"+e+"</h1>");
			 e.printStackTrace();
		 }
	}

}
