<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Confirmation</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<style type="text/css">
	
		.jumbotron{
			background-color: ;
		}
	
	</style>
</head>
<body>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- action="${contextPath}/user/logout.htm" -->

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <h3>ShopSmart</h3>
    </div>
    <a href="${contextPath}/user/logout.htm" class="btn btn-info navbar-btn navbar-right">Sign Out</a>

  </div>
</nav>

<h1>Product Added Successfully: ${product.productName}</h1>


</body>
</html>