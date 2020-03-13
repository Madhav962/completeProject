package com.simplewebapp.conn;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletRequest;

import java.sql.Connection;


public class MySQLConnUtils {
	public static Connection getMySQLConnection()
	{
		String dbName="HomeWork";
		String hostName="localhost";
		String userName="root";
		String password="root";
		return getMySQLConnection(hostName,dbName,userName,password);
	}

	private static Connection getMySQLConnection(String hostName, String dbName, String userName, String password) {
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url= "jdbc:mysql://" + hostName + ":3306/" + dbName;
		
		try {
			con = DriverManager.getConnection(url, userName, password);
			return con;
		} catch (SQLException e) {
			return null;
		}
		
			
			
		 
		
	}

	public static void storeConnection(ServletRequest request, Connection con) {
		// TODO Auto-generated method stub
		
	}

}
