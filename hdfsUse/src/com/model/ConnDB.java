package com.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnDB {
	private Connection ct = null;
	public Connection getConn(){
		
	try {
	//鍔犺浇椹卞姩
	Class.forName("com.mysql.jdbc.Driver");
			
	//寰楀埌杩炴帴
	ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/hadoop?user=root&password=root");
	} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
		
		
	return ct;
	}
}
