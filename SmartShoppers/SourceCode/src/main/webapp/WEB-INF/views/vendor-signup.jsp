<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Vendor</title>
</head>
<body>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

	<a href="${contextPath}">Go Back</a><br/>

	<h2>New Vendor Registration Page</h2>
	
	<!--<form action="vendorsignup" method="post">
	
	<p>First Name: <input type="text" name = "firstName" required></p>
	<p>Last Name: <input type="text" name = "lastName" required></p>
	<p>EmailID: <input type="text" name = "emailId" required></p>
	<p>Password: <input type="password" name = "password" required></p>
	<p>Company Name: <input type="text" name = "companyName" required></p>
	
	<input type = "submit" value ="register">
	
	</form>-->
	
	<!-- ----------------------------------------------------------------------------------------- -->
	
	
	<form:form action="vendorsignup" commandName="vendor"
		method="post">
		
		<!-- action="register" -->
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" size="30"/>
					<font color="red"><form:errors path="firstName"/></font></td>
			</tr>

			<tr>
				<td>Last Name:</td> 
				<td><form:input path="lastName" size="30"/>
					<font color="red"><form:errors path="lastName" /></font></td>
			</tr>
			
			<tr>
				<td>Email Id:</td>
				<td><form:input path="emailId" size="30" type="email"/> <font color="red">
					<form:errors path="emailId" /></font></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><form:password path="password" size="30"/> <font color="red">
					<form:errors path="password" /></font></td>
			</tr>
			
			<tr>
				<td>Company Name:</td>
				<td><form:input path="companyName" size="30"/> <font color="red"><form:errors
							path="companyName" /></font></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Register Vendor" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>