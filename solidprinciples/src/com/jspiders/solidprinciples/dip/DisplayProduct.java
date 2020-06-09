package com.jspiders.solidprinciples.dip;

public class DisplayProduct {

	
	public void display() {
		Product product = ProductFactory.create();
		product.readItems();
	}
}
