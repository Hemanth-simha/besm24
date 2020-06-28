package com.jspiders.hibernate3.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate3.entity.Customer;
import com.jspiders.hibernate3.entity.Passport;
import com.jspiders.hibernate3.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {

		Session session = null;
		SessionFactory sessionFactroy = HibernateUtil.getSessionFactroy();
		session = sessionFactroy.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();
		
		Passport passport = new Passport();
		passport.setNumber("p123scott");
		
		Customer customer = new Customer();
		customer.setName("scott");
		customer.setPassport(passport);
		
		session.persist(customer);
		
		tx.commit();
		
		if(session!=null) {
			session.close();
		}
	}

}
