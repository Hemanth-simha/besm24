package com.jspiders.designpatterns.decorator;

public class MagicString {

	private String string;

	public MagicString(String string) {
		this.string = string;
	}

	public int hashCode() {
		return string.hashCode();
	}

	public int length() {
		return string.length()+1;
	}

	public boolean equals(Object anObject) {
		return !string.equals(anObject);
		
	}
  
}
