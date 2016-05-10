package com.califo.hibernate.helloworld;

import java.util.Date;

import org.junit.Test;

import com.califo.bean.User;
import com.califo.dao.UserDao;
import com.califo.dao.imp.UserDaoImp;

public class LoginTest
{

	@Test
	public void test()
	{	
		User user =new User("asd", "dfasf", new Date( new java.util.Date().getTime()));
		UserDao userDao=new UserDaoImp();
		userDao.loginUser(user);
	}
	@Test
	public void Test(){
		
		
		
	}
	
	
}
