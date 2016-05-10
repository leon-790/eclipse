package com.califo.dao;

import java.util.List;

import com.califo.bean.User;

public interface UserDao
{
		public void saveUser(User user );
		
		public void loginUser(User user);
		
		public List<User> ListAllUser();
}
