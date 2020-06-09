package com.jspiders.solidprinciples.isp;

public class Epson implements Printer, Scanner, Faxxer {

	@Override
	public void fax() {
		System.out.println("Fax implementaion by Epson");
	}

	@Override
	public void scan() {
		System.out.println("Scan implementaion by Epson");

	}

	@Override
	public void print() {
		System.out.println("Print implementaion by Epson");

	}

}
