package com.califo.service.imp;

import java.util.List;

import com.califo.bean.User;
import com.califo.dao.UserDao;
import com.califo.dao.imp.UserDaoImp;
import com.califo.service.UserService;

public class UserServiceImp implements UserService
{

	@Override
	public void saveUser(User user)
	{
		UserDao userDao=new UserDaoImp();
		userDao.saveUser(user);

	}

	@Override
	public void loginUser(User user)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> ListAllUser()
	{
		UserDao userDao = new UserDaoImp();
		return userDao.ListAllUser();
	}
	
	

}
