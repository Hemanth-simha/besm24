package com.jspiders.project.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.project.entity.Person;
import com.jspiders.project.util.HibernateUtil;

public class HibernateClient {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sessionFactroy = HibernateUtil.getSessionFactroy();
		session = sessionFactroy.openSession();
		
		Transaction tx = session.getTransaction();
		tx.begin();
		
		Person person = new Person();
		person.setName("King");
		person.setAge(22);
		person.setContact(7676866101l);
		
		 Person p1 = new Person();
		 p1.setName("smith");
		 p1.setAge(20);
		 p1.setContact(7889231243l);
		 
		 Person p2 = new Person();
		 p2.setName("scott");
		 p2.setAge(18);
		 p2.setContact(7889231242l);
		
		 session.save(person);
		 session.save(p1);
		 session.save(p2);
		 
		 tx.commit();
		
		if(session!=null)
		{
			session.close();
		}
		
	}

}
