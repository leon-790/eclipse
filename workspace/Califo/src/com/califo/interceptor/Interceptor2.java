package com.califo.interceptor;

import java.util.Map;

import com.califo.action.LoginAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Interceptor2 extends AbstractInterceptor
{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception
	{
		/*if(arg0.getAction().getClass()==LoginAction.class)
		{
			
			return arg0.invoke();
			
		}*/
	/*	Map map= arg0.getInvocationContext().getSession();
		System.out.println("do interceptor");
		if (null==map.get("userInfo"))
		{
			return Action.LOGIN;
		}*/
		
		
		
		System.out.println("i---2  :    "+arg0.getAction().getClass());
		String result= arg0.invoke();
		return result;
	}

}
