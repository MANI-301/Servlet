package User_Dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
    import Private_data.User;

	public class User_Dao {
		
		static final String Driver = "com.mysql.cj.jdbc.Driver";
		static final String url = "jdbc:mysql://localhost:3306/Product_db";
		static final String userName = "root";
		static final String password = "root";
		
	public static Connection establishConnection() throws Exception{
		Class.forName(Driver);
		return DriverManager.getConnection(url, userName, password);
	}
	public void saveUser(User u) throws Exception{
		
		Connection c = establishConnection();
		
		PreparedStatement ps = c.prepareStatement("insert into user values(?,?,?,?,?,?)");
		ps.setInt(1,u.getId());
		ps.setString(2, u.getName());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getPassword());
		ps.setInt(5, u.getPhone());
		ps.setString(6, u.getGender());
		
		ps.executeUpdate();
		
		System.out.println("Data Saved");
	}
	}


