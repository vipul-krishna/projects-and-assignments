<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

	<a href="vendorsignup.htm">New Vendor</a><br/>

	<h2>Login</h2>
	<form action="vendoraction" method="post">
	
		<table>
		<tr>
		    <td>Email ID:</td>
		    <td><input type = "text" name="emailid" size="30" required="required" /></td>
		</tr>
		
		<tr>
		    <td>Password:</td>
		    <td><input type="password" name="password" size="30" required="required"/></td>
		</tr>
		
		<tr>
		    <td colspan="2"><input type="submit" value="Login" /></td>
		</tr>
				
		</table>

	</form>	
	
	<h4>Want To See All Orders:</h4>
	<form action="${contextPath}/item/vieworders.htm" method="post">
		
		
		<input type="submit" value="View Customer Orders">
	
	</form>

</body>
</html>