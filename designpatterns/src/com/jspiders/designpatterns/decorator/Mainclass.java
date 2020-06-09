package com.jspiders.designpatterns.decorator;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("main() starts.....");
	
		MagicString str1= new MagicString("java");
		MagicString str2 = new MagicString("java");
		
		int length= str1.length();
		boolean bool= str1.equals(str2);
		
		System.out.println(length);
		System.out.println(bool);
		System.out.println("main() ends.......");
	}

}
