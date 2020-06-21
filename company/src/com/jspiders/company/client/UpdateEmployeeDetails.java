package com.jspiders.company.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.company.entity.Employee;
import com.jspiders.company.util.HibernateUtil;

public class UpdateEmployeeDetails {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
	
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Employee emp= session.get(Employee.class,2);
		emp.setJob("tead lead");
		
		tx.commit();
		if(session!=null) {
			session.close();
		}
	}

}
