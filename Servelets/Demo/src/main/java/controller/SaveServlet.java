package controller;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import Product.Product;
import Product.ProductDao;

public class SaveServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	 int id = Integer.parseInt(req.getParameter("id"));
	 String type = req.getParameter("type");
	 String brand = req.getParameter("brand");
	 String category = req.getParameter("category");
//	 Double price = Double.parseDouble("price");
	 Double price = Double.parseDouble(req.getParameter("price"));
	 Double rating = Double.parseDouble(req.getParameter("rating"));
	 
	 Product p = new Product();
	 
	 p.setId(id);
	 p.setType(type);
	 p.setBrand(brand);
	 p.setCategory(category);
	 p.setPrice(price);
	 p.setRating(rating);
	 
	 
	 ProductDao dao = new ProductDao();
	 
	 PrintWriter out = res.getWriter();
	 
	 try {
		 dao.saveProduct(p);
		 out.print("<h1>Data Saved</h1>");
	 }
	 catch(Exception e) {
		 out.print("<h1>"+e+"</h1>");
		 e.printStackTrace();
	 }
	 
	}
}
