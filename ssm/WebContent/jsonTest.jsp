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
<title>json交互测试</title>
<script type="text/javascript">
	//请求json,输出是json
	function requestJson(){
				
	}
	
	//请求key/value,输出是json
	function responseJson(){
		
	}
</script>
</head>
<body>
	<input type="button" onclick="requestJson()" value="请求json,输出是json"/>
	<input type="button" onclick="responseJson()" value="请求key/value,输出是json"/>
</body>
</html>