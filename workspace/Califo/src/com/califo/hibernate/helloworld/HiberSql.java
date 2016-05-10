package com.califo.hibernate.helloworld;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.califo.bean.User;

public class HiberSql
{
	
	
	
	
	
	public static   void RegisterSave( User user ){
	
	
	SessionFactory sessionFactory ;
	Session session;
	 Transaction transaction;
	Configuration configuation=new Configuration().configure();
	ServiceRegistry serviceRegistry=
			new ServiceRegistryBuilder().applySettings(configuation.getProperties())
							.buildServiceRegistry();
	
							
							
	sessionFactory=configuation.buildSessionFactory(serviceRegistry);
	
	
	session=sessionFactory.openSession();

	 transaction=session.beginTransaction();
	
	
	
		session.save(user);
		//session.createQuery(arg0)
	 
	 
	 transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	
	
	public static boolean LoginQuery(User user ){
		
		
		SessionFactory sessionFactory ;
		Session session;
		 Transaction transaction;
		Configuration configuation=new Configuration().configure();
		ServiceRegistry serviceRegistry=
				new ServiceRegistryBuilder().applySettings(configuation.getProperties())
								.buildServiceRegistry();
		
								
								
		sessionFactory=configuation.buildSessionFactory(serviceRegistry);
		
		
		session=sessionFactory.openSession();

		 transaction=session.beginTransaction();
		
		
		 User myuser=	(User) session.get(User.class, 1);
		//	User myuser= (User) (session.createQuery(user.getUsername()).list()).get(0);
			//session.createQuery(arg0)
		 System.out.println("查得的密码是"+myuser.getPassword());
		 
		 transaction.commit();
			session.close();
			sessionFactory.close();
		
		if (myuser.getPassword().equals(user.getPassword()))
		{
			return true;
		}
		return false; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
