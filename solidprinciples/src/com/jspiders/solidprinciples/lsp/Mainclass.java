package com.jspiders.solidprinciples.lsp;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		
		Bird b1= new Parrot();
		Animal a1 = new Ostrich();
		
		ArrayList<Bird> birds = new ArrayList<Bird>();
		birds.add(b1);
		
		
		for (int i = 0; i <birds.size(); i++) {
			birds.get(i).fly();
		}
		
	}

}
