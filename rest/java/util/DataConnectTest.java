package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Class for testing DataConnect to establish a connection to embedded Java database;
//#disabled
public class DataConnectTest {
	public static Connection getConnection()
	{
		Connection c = null;
		
		try {
			String driver = "org.apache.derby.jdbc.ClientDriver";
			Class.forName(driver);
			String url = "jdbc:derby:sampleDB:create=true";
			c = DriverManager.getConnection(url);
		}
		catch (SQLException es){
			es.printStackTrace();
		}
		catch (ClassNotFoundException ec){
			ec.printStackTrace();
		}
		
		return c;
	}
	
	
	public void testConnection(){
		Connection c = getConnection();
		
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
