package com.jspiders.solidprinciples.srp;

public class Mainclass {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(101);
		student.setName("King");
		student.setContact(7676866101l);
		
		SaveStudentDetails studentDetails = new SaveStudentDetails();
		
		studentDetails.save(student);
	}

}
