package com.califo.action;

import com.califo.bean.User;
import com.califo.exception.UsernameException;
import com.califo.service.UserService;
import com.califo.service.imp.UserServiceImp;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{
	User user;
	


	
	public User getUser()
	{
		return user;
	}




	public void setUser(User user)
	{
		this.user = user;
	}


	
	@Override
	public String execute() throws Exception
	{
		
		if (user.getUsername().length()<6)
		{
			throw new UsernameException("cuowu");
		}
		
		
		
		System.out.println("username="+user.getUsername());
		System.out.println("password="+user.getPassword());
		return SUCCESS;
		
		
			
	}
		
		
	
		
		
		
		
	}
	

