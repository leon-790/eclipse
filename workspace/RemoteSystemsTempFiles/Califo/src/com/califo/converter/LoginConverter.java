package com.califo.converter;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.califo.bean.User;

public class LoginConverter extends StrutsTypeConverter
{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2)
	{
		
		
		
		String username=arg1[0];
		String password=arg1[1];
		
		User user =new User();
		user.setUsername(username);
		user.setPassword(password);
	
		
		
		return user;
	}

	@Override
	public String convertToString(Map arg0, Object arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
