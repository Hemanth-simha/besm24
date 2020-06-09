package com.jspiders.solidprinciples.ocp;

public class Mainclass {

	public static void main(String[] args) {
		
		InsurancePremiumCalculator calculator = null;
		calculator = new InsurancePremiumCalculator();
		
		CustomerProfile home  = new HomeInsuranceProfile();
		double homeDiscount = calculator.calculate(home);
		System.out.println("According to your loyalty home discount is :  "+homeDiscount);
		
		
		CustomerProfile vehical  = new VehicalInsuranceProfile();
		double vehicalDiscount = calculator.calculate(vehical);
		System.out.println("According to your loyalty vehical discount is :  "+vehicalDiscount);
	}

}
