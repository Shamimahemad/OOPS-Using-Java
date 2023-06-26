package com.demo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection con;

	public static Connection getMyConnection() {
		try {
			if (con == null) {

				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				// step2 : getConnection
				String url = "jdbc:mysql://localhost:3306/dac32";
				con = DriverManager.getConnection(url, "root", "welcome");
				if (con != null) {
					System.out.println("connection done");
				}

			}
			return con;
		} catch (SQLException e) {
			System.out.println("error occured");
			return null;
		}

	}

	public static void closeMyConnection() {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
