package com.jspiders.hibernate1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate1.entity.Address;
import com.jspiders.hibernate1.entity.Person;
import com.jspiders.hibernate1.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {

		Session session = null;
		SessionFactory sessionFactroy = HibernateUtil.getSessionFactroy();
		session = sessionFactroy.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();
		
		Address address = new Address();
		address.setCity("Mandya");
		address.setStreet("Subhash nagar");
		address.setPincode(571401);
		
		Person person = new Person();
		person.setName("King");
		person.setContact(768676202l);
		person.setAddress(address);
		
		session.save(person);
		tx.commit();
		
		if(session!=null) {
			session.close();
		}
	}

}
