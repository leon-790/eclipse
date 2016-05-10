package com.califo.action;


import java.util.Date;

import com.califo.bean.User;
import com.califo.hibernate.helloworld.HiberSql;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction_test extends ActionSupport
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
			user.setDate(new Date(new java.util.Date().getTime()));
			HiberSql.RegisterSave(user);
			
			
			
		
			return SUCCESS;
			
			
		}
}
