package com.jspiders.company.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.company.entity.Employee;
import com.jspiders.company.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Employee emp1 = new Employee();
		emp1.setEname("smith");
		emp1.setSalary(3000.33);
		emp1.setJob("developer");
		emp1.setContact(7676866101l);
		
		Employee emp2 = new Employee();
		emp2.setEname("blake");
		emp2.setSalary(4000.44);
		emp2.setJob("tester");
		emp2.setContact(7676866202l);
		
		Employee emp3 = new Employee();
		emp3.setEname("king");
		emp3.setSalary(6000.66);
		emp3.setJob("analyst");
		emp3.setContact(7676866303l);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		tx.commit();
		
		if(session!=null) {
			session.close();
		}
	}

}
