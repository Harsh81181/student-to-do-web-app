package com.ccs.student_to_do_web_app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class MyConnection {
	public static Connection getStudentConnection() {
		
		try {
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", 
												"root",
												"Ha@210903");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
