package com.jspiders.designpatterns.second;

public class Person {

	//address
	String state;
	String city;
    int pincode;	
	
    //work
    String company;
    String position;
    double salary;
	@Override
	public String toString() {
		return "Person [state=" + state + ", city=" + city + ", pincode=" + pincode + ", company=" + company
				+ ", position=" + position + ", salary=" + salary + "]";
	}
}
