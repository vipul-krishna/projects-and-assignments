<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Hi, ${customer.firstName}</h1>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<h1>
	Welcome To ShopSmart  
</h1>

	<form action="${contextPath}/item/search.htm" method="POST">

		What Do you wish to buy: <input type="text" name = "category" required="required">
		
		<input type="submit" value="Find Products">

	</form>
	
	<form action="${contextPath}/item/search.htm" method="GET">

		Find Order Details: <input type="number" name = "orderid" required="required" min="1">
		
		<input type="submit" value="Track Your Order">

	</form>
</body>
</html>
