package com.califo.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil
{
	private static SessionFactory sessionFaxtory;

	static
	{

		Configuration configuation = new Configuration().configure();
		ServiceRegistry serviceRegistry = new 
				ServiceRegistryBuilder().applySettings(configuation.getProperties())
								.buildServiceRegistry();
		sessionFaxtory = new Configuration().configure().buildSessionFactory(
				serviceRegistry);

	}

	/*
	 * session�����������������Ҳ����̰߳�ȫ��
	 */
	public static Session openSession()
	{
		Session session = sessionFaxtory.openSession();
		return session;
	}

	public static void closeSession(Session session)
	{

		if (null != session)
		{
			session.close();
		}

	}
}
