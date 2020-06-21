package com.jspiders.company.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
	    registryBuilder.configure("hibernate.cfg.xml");
	    StandardServiceRegistry registry = registryBuilder.build();
	
	    MetadataSources dataSources= new MetadataSources(registry);
	    MetadataBuilder metadataBuilder = dataSources.getMetadataBuilder();
	    Metadata metadata = metadataBuilder.build();
	
	   SessionFactoryBuilder factoryBuilder = metadata.getSessionFactoryBuilder();
	   SessionFactory sessionFactory = factoryBuilder.build();
	   return sessionFactory;
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
