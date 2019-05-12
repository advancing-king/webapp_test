<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>用户登录</title>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>

<body>
	<c:out value="${user.username }"></c:out>
	<%
	/*java注释*/
	Date date = new Date();
		out.print(date);
	%>
	
	<!-- html注释 -->
	
	<%-- jsp注释 --%>
	
</body>


</html>