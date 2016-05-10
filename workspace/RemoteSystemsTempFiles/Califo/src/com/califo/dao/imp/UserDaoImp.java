package com.califo.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.califo.bean.User;
import com.califo.dao.UserDao;
import com.califo.hibernate.util.HibernateUtil;

public class UserDaoImp implements UserDao
{

	@Override
	public void saveUser(User user)
	{
		Session session=HibernateUtil.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		System.out.println("do save");
		tx.commit();
		HibernateUtil.closeSession(session);
		

	}

	@Override
	public void loginUser(User user)
	{
		Session session=HibernateUtil.openSession();
		Transaction tx=session.beginTransaction();
		
		
		
		
		
		tx.commit();
		session.close();
	
	
		
		
		
	}

	@Override
	public List<User> ListAllUser()
	{
		Session session=HibernateUtil.openSession();
		Transaction tx=session.beginTransaction();
		List<User>  list=null;
		
		
		
		
		Query query=session.createQuery(" from User");//select *可以省  User是类名不是表名,多个同名要加包名
		
		list=	(List<User>)query.list();
		
		tx.commit();
		System.out.println(list);
		
		HibernateUtil.closeSession(session);
		return list;
	}
	
	
}
