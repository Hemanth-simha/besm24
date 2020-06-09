package com.jspiders.solidprinciples.ocp;

public class InsurancePremiumCalculator {

	double discount = 20;
	
	public double calculate(CustomerProfile customer) {
		
		if(customer.isLoyalCustomer()) {
			return discount = discount * 1.5;
		}
		return discount;
	}
	
}
