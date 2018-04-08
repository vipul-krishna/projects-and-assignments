<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add User Form</title>
</head>
<body>

	
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />

	<a href="${contextPath}">Go Back</a><br/>

	<h2>New Customer Registration Page</h2>
		
	<form:form action="register" commandName="customer"
		method="post">
		
		<!-- action="register" -->
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" size="30"/>
					<font color="red"><form:errors path="firstName" /></font></td>
			</tr>

			<tr>
				<td>Last Name:</td> 
				<td><form:input path="lastName" size="30"/>
					<font color="red"><form:errors path="lastName" /></font></td>
			</tr>
			
			<tr>
				<td>Email Id:</td>
				<td><form:input path="emailId" size="30"
						type="email"/> <font color="red"><form:errors
							path="emailId" /></font></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><form:password path="password" size="30"/> <font color="red"><form:errors
							path="password" /></font></td>
			</tr>
			
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phoneNumber" size="30"/> <font color="red"><form:errors
							path="phoneNumber" /></font></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Register User" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>