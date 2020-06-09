package com.jspiders.solidprinciples.lsp;

public class InHouseProduct extends Amazon{

	public double giveExtraDiscount()
	{
		System.out.println("Extra discount is giving only for InHouseProduct");
		return discount = discount + 2;
	}
	@Override
	public double giveDiscount() {
		
		return giveExtraDiscount();
	}
}
