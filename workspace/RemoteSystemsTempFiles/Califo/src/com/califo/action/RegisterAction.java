package com.califo.action;

import java.util.Date;

import com.califo.bean.User;
import com.califo.service.UserService;
import com.califo.service.imp.UserServiceImp;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport
{
		String username;
		String password;
		public String getUsername()
		{
			return username;
		}
		public void setUsername(String username)
		{
			this.username = username;
		}
		public String getPassword()
		{
			return password;
		}
		public void setPassword(String password)
		{
			this.password = password;
		}
		@Override
		public String execute() throws Exception
		{
			User user=new User();	
			user.setUsername(username);
			user.setPassword(password);
			user.setDate(new Date(new java.util.Date().getTime()));//new Date(new java.util.Date().getTime())
			UserService userService =new UserServiceImp();
			
			userService.saveUser(user);
			return SUCCESS;
			
		
		}
}
