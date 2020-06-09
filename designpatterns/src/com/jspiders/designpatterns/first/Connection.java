package com.jspiders.designpatterns.first;

public class Connection {

	public static Connection con = null;
	private Connection() {
		System.out.println("Object Created.....");
	}
	public static Connection getConnection() {
		if(con==null) {
			con= new Connection();
			return con;
		}
		return con;
	}
}
