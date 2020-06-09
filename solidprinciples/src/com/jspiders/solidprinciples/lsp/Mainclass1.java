package com.jspiders.solidprinciples.lsp;

import java.util.ArrayList;

public class Mainclass1 {

	public static void main(String[] args) {
		
			Amazon p1 = new Product();
		    Amazon p2 = new Product();
		    Amazon p3= new InHouseProduct();
		    
		    ArrayList<Amazon> products=new ArrayList<Amazon>();
		    products.add(p1);
		    products.add(p2);
		    products.add(p3);
		    for (int i = 0; i <products.size(); i++) {
			 double discount	= products.get(i).giveDiscount();
			 System.out.println(discount);
			}
	}

}
