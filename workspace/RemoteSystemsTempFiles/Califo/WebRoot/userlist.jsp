<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
function del(){
  if(confirm("确定删除？"))
  {
  		return true;
  
  }
		return false;

}



</script>
  </head>
  
  <body>
  <table width="80%" align="center" border="1">
  <tr>
  <th>id</th>
  <th>username</th>
  <th>password</th>
  <th>date</th>
  <th>更新</th>
  <th>删除</th>
  </tr>
  <s:iterator value="#request.list">
  <tr>
  <td><s:a href="getSingleUser.action?=%{#user.id}"><s:property value="id"/></s:a></td>
  <td><s:property value="username"/></td>
  <td><s:property value="password"/></td>
  <td><s:property value="date"/></td>
  <td><s:a href="updateUser.action?=%{#user.id}">更新</s:a></td>
  <td><s:a href="deleteUser.action?=%{#user.id}" onclick="return del();">删除</s:a></td>
   </tr>
  
  
  
  </s:iterator>
  
  </table>
    
  </body>
</html>
