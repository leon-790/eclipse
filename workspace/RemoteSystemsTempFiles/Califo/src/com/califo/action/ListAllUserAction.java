package com.califo.action;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

import com.califo.bean.User;
import com.califo.service.UserService;
import com.califo.service.imp.UserServiceImp;
import com.opensymphony.xwork2.ActionSupport;

public class ListAllUserAction extends ActionSupport
{
		
	
	
	@Override
	public String execute() throws Exception
	{
		
		UserService userService =new UserServiceImp();
		List<User> list=userService.ListAllUser();
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", list);
		
		
		return SUCCESS;
	}
}
