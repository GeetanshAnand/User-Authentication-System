package com.geetansh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    
	 public static Connection getConnection() throws SQLException {
		 
		 	System.out.println("Connection Established");
	        return DriverManager.getConnection("jdbc:mysql://localhost:3306/login?user=root&password=********");
	    }
}
