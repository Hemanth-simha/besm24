package com.jspiders.designpatterns.second;

public class Mainclass {

	public static void main(String[] args) {
		System.out.println("main() starts..........");
		
		PersonBuilder pb= new PersonBuilder();
	    PersonAddressBuilder lives = pb.lives();
		lives.stateIn("karnataka");
		lives.cityIn("Mandya");
	    lives.pincodeIs(571401);
		
	    PersonJobBuilder works = pb.works();
	    works.companyIs("Microsoft");
	    works.positionIs("VP");
	    works.salaryIs(233.0000);
	    
	    Person person= pb.build();
		System.out.println(person);
		System.out.println("main() ends............");
	}

}
