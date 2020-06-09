package com.jspiders.designpatterns.copyconstructor;

public class Mainclass {

	public static void main(String[] args){
		System.out.println("main() starts........");
		
		Address address = new Address("Bangalore","JPnagar",5600006);
		Person person= new Person("smith",20, address);
		
		
		Person pers1= new Person(person);
		pers1.age=22;
		pers1.address.pincode=5600004;
		
		
		System.out.println(person);
		System.out.println(pers1);
		System.out.println("main() ends..........");
	}

}
