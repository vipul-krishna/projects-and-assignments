<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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


<div class="jumbotron">
		<div class="container">
			
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h3>Order Details:</h3>
					</div>
					
					<div class="panel-body">
						<b>Customer Name:</b>${order.buyerName}<br>
						<b>Email Id:</b>${order.buyerEmail}<br>
						<b>Phone Number:</b>${order.buyerPhone}<br>
						<b>Address Information:</b>${order.deliveryAddress1}, 
						${order.deliveryAddress2}<br>
						<b>City:</b>${order.city}<br>
						<b>Zip:</b>${order.zip}<br>
						<b>State:</b>${order.state}<br><hr>
						<h4>Delivery Date:</h4>
						${order.deliveryDate}<br>
						<h4>Order Value</h4>${order.orderTotalValue}<br> 
					</div>
			</div>
			
	</div>
</div>	
</body>
</html>








