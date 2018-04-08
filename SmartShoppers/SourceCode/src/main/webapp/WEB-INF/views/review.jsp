<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Order Review</title>
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

<!-- <h2>Your Order Details:</h2>

<h4>Items In Order:</h4>
				<c:forEach  var="orderItem" items="${sessionScope.orderItemList}">
                    
                       <b>Item Name: </b> ${orderItem.itemName}<br>
                       <b>Price per Unit: </b> ${orderItem.itemPrice}<br>
                       <b>Quantity Ordered: </b> ${orderItem.purchaseQuantity}<br>
                       <b>Sub total: </b>${orderItem.purchaseQuantity*orderItem.itemPrice} <br>
                        <hr>
                    
                </c:forEach>
<h4>Order total:</h4>
${sessionScope.orderItemList[0].order.orderTotalValue}<br>

<h4>Delivery Address:</h4>
${sessionScope.customer.firstName} ${sessionScope.customer.lastName}<br>
${sessionScope.customer.emailId}<br>
${sessionScope.customer.phoneNumber}<br>
${sessionScope.orderItemList[0].order.deliveryAddress1}<br>
${sessionScope.orderItemList[0].order.deliveryAddress2}<br>
${sessionScope.orderItemList[0].order.city}<br>
${sessionScope.orderItemList[0].order.zip}<br>
${sessionScope.orderItemList[0].order.state}<br>

<h4>Expected Delivery Date:</h4>
${sessionScope.orderItemList[0].order.deliveryDate}<br>

<h4>Payment Details:</h4>
${sessionScope.orderItemList[0].order.cardnumber}<br>
${sessionScope.orderItemList[0].order.expmonth}<br>
${sessionScope.orderItemList[0].order.expyear}<br>


<form action="confirmation.htm" method="GET">

		<input type="submit" value="Submit" class="btn btn-primary btn-block">

</form>-->

<div class="jumbotron">
		<div class="container">
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h3>Please Review Your Order Details:</h3>
					</div>
					
					<div class="panel-body">
					
									<c:forEach  var="orderItem" items="${sessionScope.orderItemList}">
				                    
				                       <b>Item Name: </b> ${orderItem.itemName}<br>
				                       <b>Price per Unit: </b> ${orderItem.itemPrice}<br>
				                       <b>Quantity Ordered: </b> ${orderItem.purchaseQuantity}<br>
				                       <b>Sub total: </b>${orderItem.purchaseQuantity*orderItem.itemPrice} <br>
				                       <hr>
				                    
				                </c:forEach>
				            <h4>Order total:</h4>
							${sessionScope.orderItemList[0].order.orderTotalValue}<br>    
						
					</div>
			</div>
			
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h3>Delivery Address:</h3>
					</div>
					
					<div class="panel-body">
						<b>Customer Name:</b>${sessionScope.customer.firstName} ${sessionScope.customer.lastName}<br>
						<b>Email Id:</b>${sessionScope.customer.emailId}<br>
						<b>Phone Number:</b>${sessionScope.customer.phoneNumber}<br>
						<b>Address Information:</b>${sessionScope.orderItemList[0].order.deliveryAddress1}, 
						${sessionScope.orderItemList[0].order.deliveryAddress2}<br>
						<b>City:</b>${sessionScope.orderItemList[0].order.city}<br>
						<b>Zip:</b>${sessionScope.orderItemList[0].order.zip}<br>
						<b>State:</b>${sessionScope.orderItemList[0].order.state}<br><hr>
						<h4>Expected Delivery Date:</h4>
						${sessionScope.orderItemList[0].order.deliveryDate}<br>
					</div>
			</div>
			
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h3>Payment Details:</h3>
					</div>
					
					<div class="panel-body">
					
					<b>Card Number: </b>${sessionScope.orderItemList[0].order.cardnumber}<br>
					<b>Expiry Month: </b>${sessionScope.orderItemList[0].order.expmonth}<br>
					<b>Expiry Year: </b>${sessionScope.orderItemList[0].order.expyear}<br>
						
					</div>
			</div>
				<form action="confirmation.htm" method="POST">

					<input type="submit" value="Submit Your Order" class="btn btn-primary btn-block">

				</form>
		</div>
	</div>
</body>
</html>