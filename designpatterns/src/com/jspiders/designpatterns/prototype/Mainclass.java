package com.jspiders.designpatterns.prototype;

public class Mainclass {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main() starts........");
		
		Address address = new Address("Bangalore","JPnagar",5600006);
		Person person= new Person("smith",20, address);
		
		Person pers=person;//Shallow cloning
		
		Person pers1=(Person)person.clone();//deep cloning
		
		pers1.age=22;
		pers1.address.pincode=5600004;
		System.out.println(person);
		System.out.println(pers);
		System.out.println(pers1);
		System.out.println("main() ends..........");
	}

}
