package com.jspiders.designpatterns.first;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("main() starts.....");
	
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		Connection con3 = Connection.getConnection();
		System.out.println("main() ends........");
	}

}
