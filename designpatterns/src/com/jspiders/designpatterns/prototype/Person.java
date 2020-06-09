package com.jspiders.designpatterns.prototype;

public class Person implements Cloneable {

	String name;
	int age;
	Address address;

	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return new Person(name, age,(Address)address.clone());

	}

}
