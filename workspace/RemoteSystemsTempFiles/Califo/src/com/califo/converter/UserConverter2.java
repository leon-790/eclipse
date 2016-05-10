package com.califo.converter;

import java.util.Map;
import java.util.StringTokenizer;

import org.apache.struts2.util.StrutsTypeConverter;

import com.califo.bean.User;

public class UserConverter2 extends StrutsTypeConverter
{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2)
	{
		
		String [] str=arg1;
		String rv=str[0];
		StringTokenizer st=new StringTokenizer(rv, ";");
		String username=st.nextToken();
		String password=st.nextToken();
		
		User user =new User();
		user.setUsername(username);
		user.setPassword(password);
		
		System.out.println("convertFromString what? invoked!");
		return user;
	}

	@Override
	public String convertToString(Map arg0, Object arg1)
	{
		User user =(User) arg1;
		String username =user.getUsername();
		String password=user.getPassword();
		String userinfo="username="+username+";password="+password;
		return userinfo;
	}

}
