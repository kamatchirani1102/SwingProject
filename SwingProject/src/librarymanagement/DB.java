package librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class load successfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rani","root","Seenivasan@25");
		}catch(Exception e){System.out.println("class load successfully");}
		return con;
	}

}
