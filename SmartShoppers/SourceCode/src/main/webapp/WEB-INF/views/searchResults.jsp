<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
</head>
<body>


<c:if test="${fn:length(sessionScope.myPurchaseItemList) > 0}">

	<!-- <form action="cartupdate.htm" method="POST">-->

		<h2>Here are your search results</h2>
	
		<table border="1">
	            
	            <thead>
	                <tr>
	                	<th>Product Image</th>
	                    <th>Company Name</th>
	                    <th>Product Name</th>
	                    <th>Product Description</th>
	                    <th>Available Quantity</th>
	                    <th>Price Per unit</th>
	                    <th>Quantity to Purchase</th>
	                </tr>
	            </thead>
	            <tbody>
	                <c:forEach  var="product" items="${sessionScope.myPurchaseItemList}">
	                <form action="cartupdate.htm" method="POST">
	                    <tr>
	                        <td><img height="150" width="150" src="/images/${product.fileAccessName}" /></td>
	                        <td>${product.productBrand}</td>
	                        <td>${product.productName}</td>
	                        <td>${product.productDescription}</td>
	                        <td>${product.avlQuantity}</td>
	                        <td>${product.price}</td>
	                        <td><input type="number" name="purchaseQty${product.productID}" placeholder = "Enter Quantity to purchase" min="1" max="10" required = "required"></td>
	                        <td><button name="productID" type="submit" value="${product.productID}">Add Item To Cart</button></td>
	                    </tr>
	                  </form>
	                </c:forEach>
	            </tbody>
	        </table>


	<!--  </form> -->

	<form action="cart.htm" method="POST">
		<input type="submit" value="Checkout">
	</form>
</c:if>



<c:if test="${fn:length(sessionScope.myPurchaseItemList) == 0}">
	<h2>No Results Found. Please re-enter the keyword.</h2>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />

	<a href="${contextPath}">Go Back</a><br/>
</c:if>


</body>
</html>