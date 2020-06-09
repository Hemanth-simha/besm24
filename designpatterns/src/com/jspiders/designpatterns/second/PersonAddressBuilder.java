package com.jspiders.designpatterns.second;

public class PersonAddressBuilder extends PersonBuilder{
	
	public PersonAddressBuilder(Person person)
	{
		this.person=person;
	}
	public PersonAddressBuilder stateIn(String state)
	{
		person.state=state;
		return this;
	}
	public PersonAddressBuilder cityIn(String city)
	{
		person.city=city;
		return this;
	}
	public PersonAddressBuilder pincodeIs(int pincode)
	{
		person.pincode=pincode;
		return this;
	}
}
