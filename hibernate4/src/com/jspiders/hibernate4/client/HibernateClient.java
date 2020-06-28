package com.jspiders.hibernate4.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate4.entity.Person;

public class HibernateClient {

	public static void main(String[] args) {
			
		EntityManager em = null; 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate4");
		em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();
		
	    tx.begin();
		
	    Person person = new Person();
	    person.setName("king");
	    person.setContact(9887624566l);
	    person.setCompany("MicroSoft");
	    
	    em.persist(person);
	    tx.commit();
	    
	    if(em!=null) {
	    	em.close();
	    }
	}

}
