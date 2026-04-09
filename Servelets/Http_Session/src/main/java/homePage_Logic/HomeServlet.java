package homePage_Logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		 
		PrintWriter out = resp.getWriter();
		
		if (session != null) {
			String html = "<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "    <title>Student Table</title>\r\n"
					+ "    <style>\r\n"
					+ "        table {\r\n"
					+ "            border-collapse: collapse;\r\n"
					+ "            width: 60%;\r\n"
					+ "            margin: 20px auto;\r\n"
					+ "        }\r\n"
					+ "        th, td {\r\n"
					+ "            border: 1px solid #333;\r\n"
					+ "            padding: 8px 12px;\r\n"
					+ "            text-align: center;\r\n"
					+ "        }\r\n"
					+ "        th {\r\n"
					+ "            background-color: #f2f2f2;\r\n"
					+ "        }\r\n"
					+ "        caption {\r\n"
					+ "            font-size: 1.5em;\r\n"
					+ "            margin-bottom: 10px;\r\n"
					+ "        }\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <table>\r\n"
					+ "        <caption>Student Information</caption>\r\n"
					+ "        <thead>\r\n"
					+ "            <tr>\r\n"
					+ "                <th>Student ID</th>\r\n"
					+ "                <th>Name</th>\r\n"
					+ "                <th>Age</th>\r\n"
					+ "                <th>Grade</th>\r\n"
					+ "            </tr>\r\n"
					+ "        </thead>\r\n"
					+ "        <tbody>\r\n"
					+ "            <tr>\r\n"
					+ "                <td>101</td>\r\n"
					+ "                <td>John Doe</td>\r\n"
					+ "                <td>18</td>\r\n"
					+ "                <td>A</td>\r\n"
					+ "            </tr>\r\n"
					+ "            <tr>\r\n"
					+ "                <td>102</td>\r\n"
					+ "                <td>Jane Smith</td>\r\n"
					+ "                <td>19</td>\r\n"
					+ "                <td>B+</td>\r\n"
					+ "            </tr>\r\n"
					+ "            <tr>\r\n"
					+ "                <td>103</td>\r\n"
					+ "                <td>Michael Lee</td>\r\n"
					+ "                <td>20</td>\r\n"
					+ "                <td>A-</td>\r\n"
					+ "            </tr>\r\n"
					+ "        </tbody>\r\n"
					+ "    </table>\r\n"
					+ "<a href='logout' style='text-align:center'>Logout</a>"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "";
			
			out.print(html);
		}
		else {
			out.print("<h1>First Login </h1>");
		}
		
		
	}

}
