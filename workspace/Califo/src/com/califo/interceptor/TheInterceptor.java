package com.califo.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TheInterceptor implements Interceptor
{
	private String test;
	
	
	public String getTest()
	{
		return test;
	}

	public void setTest(String test)
	{
		System.out.println("set");
		this.test = test;
	}

	
	
	
	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init()
	{
		System.out.println("test"+this.test);
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception
	{
		System.out.println(invocation.getAction().getClass());
		String result=invocation.invoke();
		
		return result;
	}

	

}
