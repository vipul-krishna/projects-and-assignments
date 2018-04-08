<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
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

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <h3>ShopSmart</h3>
    </div>

  </div>
</nav>

<c:if test="${fn:length(sessionScope.orderItemList) == 0}">
	<div class="jumbotron">
		<div class="container">
				
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h2>Cart Page</h2>
					</div>
					
					<div class="panel-body">
					
						<h4>Your cart is empty.<br>Its time to start shopping</h4>
					</div>
			</div>
		</div>
	</div>
</c:if>



<c:if test="${fn:length(sessionScope.orderItemList) > 0}">

				<!--<c:forEach  var="orderItem" items="${sessionScope.orderItemList}">
                    
                        
                       <b>Brand: </b> ${orderItem.itemBrand}<br>
                       <b>Item Name: </b> ${orderItem.itemName}<br>
                       <b>Description: </b> ${orderItem.itemDescription}<br>
                       <b>Price per Unit: </b> ${orderItem.itemPrice}<br>
                       <b>Quantity Ordered: </b> ${orderItem.purchaseQuantity}<br>
                       <hr>
                    
                </c:forEach>-->
                
                
<!--<h3>Your Order Contains</h3>
<p><b>Brand: </b>${sessionScope.item.itemBrand}</p>
<p><b>Item Name: </b>${sessionScope.item.itemName}</p>
<p><b>Description: </b>${sessionScope.item.itemDescription}</p>
<p><b>Price per Unit: </b>${sessionScope.item.itemPrice}</p>
<p><b>Quantity Ordered: </b>${sessionScope.item.purchaseQuantity}</p>-->

<!-- <form action="delivery.htm" method="POST">

		
		
		<input type="submit" value="Checkout">

</form> -->





<!-- ----------------------------------------------------------------------------- -->


<div class="jumbotron">
		<div class="container">
				
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h2>Cart Page</h2>
					</div>
					
					<div class="panel-body">
					
								<c:forEach  var="orderItem" items="${sessionScope.orderItemList}">
                    
                        
				                       <b>Brand: </b> ${orderItem.itemBrand}<br>
				                       <b>Item Name: </b> ${orderItem.itemName}<br>
				                       <b>Description: </b> ${orderItem.itemDescription}<br>
				                       <b>Price per Unit: </b> ${orderItem.itemPrice}<br>
				                       <b>Quantity Ordered: </b> ${orderItem.purchaseQuantity}<br>
				                       <hr>
                    
                				</c:forEach>
                				
                				<form action="delivery.htm" method="POST">

										<input type="submit" value="Proceed to Checkout" class="btn btn-primary btn-block">

								</form>
						
					</div>
			</div>
		</div>
	</div>

</c:if>


</body>
</html>