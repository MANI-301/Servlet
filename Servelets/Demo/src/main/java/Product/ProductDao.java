package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDao {

	static final String Driver = "com.mysql.cj.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/Product_db";
	static final String userName = "root";
	static final String password = "root";
	
public static Connection establishConnection() throws Exception{
	Class.forName(Driver);
	return DriverManager.getConnection(url, userName, password);
}
public void saveProduct(Product p) throws Exception{
	
	Connection c = establishConnection();
	
	PreparedStatement ps = c.prepareStatement("insert into Product values(?,?,?,?,?,?)");
	ps.setInt(1,p.getId());
	ps.setString(2, p.getType());
	ps.setString(3, p.getBrand());
	ps.setString(4, p.getCategory());
	ps.setDouble(5, p.getPrice());
	ps.setDouble(6, p.getRating());
	
	ps.executeUpdate();
	
	System.out.println("Data Saved");
}
}