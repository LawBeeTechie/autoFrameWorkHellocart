package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static DBConnector connector;
	private static Connection connection;
//2	
	private DBConnector() {

		try {
			connection = DriverManager.getConnection("jdbc:mysql://139.59.91.96:3306/SR_DEV",
					"produser", "qweQWe123!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (connector == null) {
		connector = new DBConnector();
		}
		return connection;
	}
	
	
}
