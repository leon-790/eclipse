package com.califo.hibernate.helloworld;

import static org.junit.Assert.*;

import java.sql.Date;

import javax.security.auth.Destroyable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.califo.bean.User;
import com.sun.org.apache.xml.internal.security.Init;

public class HiberTest
{
	SessionFactory sessionFactory =null;
	Session session;
	 Transaction transaction;
	
	@Before
	public void init(){
		System.out.println("init");
		
		
		Configuration configuation=new Configuration().configure();
		ServiceRegistry serviceRegistry=
				new ServiceRegistryBuilder().applySettings(configuation.getProperties())
								.buildServiceRegistry();
		sessionFactory=configuation.buildSessionFactory(serviceRegistry);
		 session=sessionFactory.openSession();
	
		 transaction=session.beginTransaction();
	}
	
	@After
	public void destroy()
	{
		
		System.out.println("destroy");
		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void savetest()
	{
		System.out.println("test");
		
	User user=new User("java", "µÚÒ»´Î³¢ÊÔ", new Date(new java.util.Date().getTime()));
	session.save(user);
	
	
	}
	
	
}
