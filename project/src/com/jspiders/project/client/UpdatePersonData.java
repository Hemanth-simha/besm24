package com.jspiders.project.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.project.entity.Person;
import com.jspiders.project.util.HibernateUtil;

public class UpdatePersonData {

	public static void main(String[] args) {

		Session session = null;
		SessionFactory sessionFactroy = HibernateUtil.getSessionFactroy();
		session = sessionFactroy.openSession();

		Transaction tx = session.getTransaction();
		tx.begin();

		Person person = session.get(Person.class,7);
		person.setAge(21);

		tx.commit();
		if (session != null) {
			session.close();
		}
	}

}
