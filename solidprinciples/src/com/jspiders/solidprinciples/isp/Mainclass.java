package com.jspiders.solidprinciples.isp;

public class Mainclass {

	public static void main(String[] args) {
		
		Hp m1 = new Hp();
		m1.print();
		Canon m2 = new Canon();
		m2.print();
		m2.scan();
		Epson m3 = new Epson();
		m3.print();
		m3.scan();
		m3.fax();
	}

}
