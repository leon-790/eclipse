package com.califo.converter;

import java.util.Map;
import java.util.StringTokenizer;

import com.califo.bean.User;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter
{
	@Override
	public Object convertValue(Map context, Object value, Class toType)
	{
		System.out.println("converter do do do");
		
		if (User.class==toType)
		{
			String [] str=(String[]) value;
			String firstValue=str[0];
			
			StringTokenizer ST=new StringTokenizer(firstValue, ";");
			String username=ST.nextToken();
			String password=ST.nextToken();
			User user =new User();
			user.setUsername(username);
			user.setPassword(password);
			System.out.println("converter invoked");
			return user;
		}
		else if (String.class==toType)
		{
			User user=(User) value;
			String username=user.getUsername();
			String password=user.getPassword();
			String uesrinfo="username:"+username+"<br>password:"+password;
			return uesrinfo;
			
		}
		return null;
	}
}
