package com.jspiders.hibernate2.client;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate2.entity.Mentor;
import com.jspiders.hibernate2.entity.Student;
import com.jspiders.hibernate2.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {

		Session session = null;
		SessionFactory sessionFactroy = HibernateUtil.getSessionFactroy();
		session = sessionFactroy.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();
		
		Mentor mentor = new Mentor();
		mentor.setName("Hemanth");
		mentor.setSalary(10000.00);
		mentor.setContact(7676866202l);
		
		Student student = new Student();
		student.setName("sagar");
		student.setEmail("sagar@jspiders.com");
		student.setContact(7878968611l);
		student.setMentor(mentor);
		
		Student student1 = new Student();
		student1.setName("satyajit");
		student1.setEmail("satyajit@jspiders.com");
		student1.setContact(8878968611l);
		student.setMentor(mentor);
		
		Set<Student> students = mentor.getStudents();
		students.add(student1);
		students.add(student);
		
		session.persist(mentor);
		
		tx.commit();
		
		if(session!=null) {
			session.close();
		}
	}

}
