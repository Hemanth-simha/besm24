package com.jspiders.hibernate2.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactroy();
	
	private static SessionFactory buildSessionFactroy()
	{
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		serviceRegistryBuilder.configure("hibernate.cfg.xml");
		StandardServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		
		MetadataSources metadataSources = new MetadataSources(serviceRegistry);
		MetadataBuilder metadataBuilder = metadataSources.getMetadataBuilder();
		Metadata metadata = metadataBuilder.build();
	
	
		SessionFactoryBuilder factoryBuilder = metadata.getSessionFactoryBuilder();
		SessionFactory sessionFactory = factoryBuilder.build();
		return sessionFactory;
	}
	public static SessionFactory getSessionFactroy() {
		return sessionFactory;
	}
}
