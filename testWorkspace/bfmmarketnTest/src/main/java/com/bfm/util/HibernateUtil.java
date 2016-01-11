package com.bfm.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	//单例模式创建SessionFactory
	  private static SessionFactory sessionFactory = buildSessionFactory();
	 
	  private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration().configure();
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
	        .buildServiceRegistry();
	    return configuration.buildSessionFactory(serviceRegistry);
	  }
	 
	  public static SessionFactory getSessionFactory() {
	    return sessionFactory;
	  }
	 
	  public static Session openSession() {
	    return sessionFactory.openSession();
	  }
	 
	  public static void close(Session session) {
	    if (session != null) {
	      session.close();
	    }
	  }
	  
	  public static void main(String args[]){
		  System.out.println(HibernateUtil.getSessionFactory());
	  }
	}