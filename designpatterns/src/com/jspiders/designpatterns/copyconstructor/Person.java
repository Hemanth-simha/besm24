package com.jspiders.designpatterns.copyconstructor;

public class Person {

	String name;
	int age;
	Address address;

	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Person(Person person) {
		name=person.name;
		age=person.age;
		address=new Address(person.address);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
