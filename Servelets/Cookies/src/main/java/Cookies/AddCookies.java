package Cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/addCookies")
public class AddCookies  extends HttpServlet{
	
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// create cookies
 Cookie c1=new Cookie("email","mani@gmail.com");
 c1.setMaxAge(60*5);
 Cookie c2=new Cookie ("pass","123");
// help us to save cookie in browser
resp.addCookie(c1);
resp.addCookie(c2);
PrintWriter out=resp.getWriter();
out.print("<h1>cookies saved </h1>");
}
}
