package com.califo.junit;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.califo.model.Product;

public class ProductTest {
	Session session;
	SessionFactory sessionFactory;

	/**
	 * @param p
	 */
	@Test
	public void Testsave() {
		Transaction tx = session.beginTransaction();
	
		Product p1=new Product( "ds", "st", (float) 60.4, 3);
		session.save(p1);
		
		tx.commit();
		

	}

	@Before
	public void init() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		session=sessionFactory.openSession();
		
	}
	@After
	public void destroy() {
	
		session.close();

	}

}
