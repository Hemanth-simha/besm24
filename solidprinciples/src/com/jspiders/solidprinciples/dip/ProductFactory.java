package com.jspiders.solidprinciples.dip;

public class ProductFactory {
	
	public static Product create()
	{
		 Product product= new SqlRepositary();
		 return product;
	}
	
}
