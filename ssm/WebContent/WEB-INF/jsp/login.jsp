<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
    <%
    	String basePath=request.getScheme()+"://"+
    	request.getServerName()+":"+
    	request.getServerPort()+	
    	request.getContextPath()+"/";
     %>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath %>">
<meta charset="UTF-8">
<title>系统登陆</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/login.action" method="post">
用户账号：<input type="text" name="username" /><br/>
用户密码 ：<input type="password" name="password" /><br/>
<input type="submit" value="登陆"/>
</form>
</body>
</html>