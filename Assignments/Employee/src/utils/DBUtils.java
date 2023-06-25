package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	public static Connection openConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/dac32";
			Connection conn=DriverManager.getConnection(url,"root","welcome");
			if(conn!=null) {
				System.out.println("connection done..");
			}else {
				System.out.println("connection failed..");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
