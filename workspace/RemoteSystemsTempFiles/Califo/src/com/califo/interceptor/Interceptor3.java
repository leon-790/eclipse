package com.califo.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class Interceptor3 extends MethodFilterInterceptor
{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception
	{
		
		
		
		String result=arg0.invoke();
		
		return result;
	}

}
