package com.jspiders.solidprinciples.isp;

public class Canon implements Printer, Scanner {

	@Override
	public void scan() {
		System.out.println("Scan Implementation by Canon");
	}

	@Override
	public void print() {
		System.out.println("Print Implementation by Canon ");
	}

}
