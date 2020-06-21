package com.jspiders.company.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.company.entity.Employee;
import com.jspiders.company.util.HibernateUtil;

public class ReadEmployeeDetails {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
	
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Employee emp= session.get(Employee.class,2);
		System.out.println(emp);
		
		tx.commit();
		if(session!=null) {
			session.close();
		}
	}

}
