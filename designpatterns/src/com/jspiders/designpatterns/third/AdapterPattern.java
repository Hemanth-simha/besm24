package com.jspiders.designpatterns.third;

public class AdapterPattern {

	public static void main(String[] args) {
		
		int num = 10;
		
		String res = String.valueOf(num);
		System.out.println(res);
		
		String str = "100";
		int res1= Integer.parseInt(str);
		System.out.println(res1);
	}

}
