package com.jspiders.designpatterns.prototype;

public class Address implements Cloneable{
	
	String city;
	String street;
	int pincode;
	
	public Address(String city, String street, int pincode) {
		super();
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Address(city, street, pincode);
	}
}
