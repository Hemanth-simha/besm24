package com.jspiders.designpatterns.copyconstructor;

public class Address {

	String city;
	String street;
	int pincode;

	public Address(String city, String street, int pincode) {
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}

	public Address(Address address) {
		this(address.city,address.street,address.pincode);
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
}
