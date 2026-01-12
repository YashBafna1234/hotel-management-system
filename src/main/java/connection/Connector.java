package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/hotel_db";
		String username = "root";
		String password = "1234";
		
        Connection con = DriverManager.getConnection(url,username,password);
		
		return con;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
