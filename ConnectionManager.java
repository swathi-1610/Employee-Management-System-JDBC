package com.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionManager {
   public static Connection getConnection() throws SQLException , ClassNotFoundException {
	    Connection connection;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jfs293031";
		String username = "root";
		String password = "Swathi@1602";
		
		//Load Driver Software
		Class.forName(driver);
		
		//Establish the connection
		connection = DriverManager.getConnection(url,username,password);
	   
		connection.setAutoCommit(false);
		
		return connection;
   }
}
