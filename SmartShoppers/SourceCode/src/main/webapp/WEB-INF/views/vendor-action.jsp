<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Hi, ${vendor.firstName}</h1>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<h1>
	Welcome To ShopSmart  
</h1>

<h2>Vendor Home: Add New Products Below: </h2>

	<!-- Use HTML Form Tags.... Redirect to Product Controller.....Annotate Product Pojo -->
	
	
	<form:form action="${contextPath}/product/add.htm" method="post"
		commandName="product" enctype="multipart/form-data">

		<table>

			<tr>
				<td>Product Brand:</td>
				<td><form:input type="text" path="productBrand" size="30" required="required" 
				value="${sessionScope.vendor.companyName}" readonly = "true"/></td>
			</tr>

			<tr>
				<td>Product Name:</td>
				<td><form:input type="text" path="productName" size="30" required="required"/>
				<font color="red"><form:errors path="productName" /></font></td>
			</tr>
			
			<tr>
				<td>Product Description:</td>
				<td><form:textarea path="productDescription" rows="10" cols="30" required="required"/>
				<font color="red"><form:errors path="productDescription" /></font></td>
			</tr>

			<tr>
				<td>Available Quantity:</td>
				<td><form:input type="number" path="avlQuantity" size="5" required="required" min="0"/>
				</td>
			</tr>
			
			<tr>
				<td>Price Per Unit:</td>
				<td><form:input type="text" path="price" size="30" required="required"/>
				<font color="red"><form:errors path="price" /></font></td>
			</tr>
			
			<tr>
				<td>Upload Image:</td>
				<td><form:input type="file" path="photo" name="photo" required="required"/></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Post Your Product Online" /></td>
			</tr>
		</table>

	</form:form>
	
	<form action="${contextPath}/product/view.htm" method="post">
		
		
		<input type="submit" value="View Your Existing Product Catalog">
	
	</form>
	
	<!--<form action="${contextPath}/item/vieworders.htm" method="post">
		
		
		<input type="submit" value="View Customer Orders">
	
	</form>-->

</body>
</html>