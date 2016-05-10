package com.califo.service;

import java.util.List;

import com.califo.bean.User;

public interface UserService
{

	public void saveUser(User user);
	
	public void loginUser(User user);
	
	public List<User> ListAllUser();
	
	
}
