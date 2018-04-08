<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delivery Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">

.jumbotron{
	background-color: ;
}

.error_form{
		
		font-size:12px;
		font-weight:bold;
		padding-left : 120px;
		color: red;
	  }

</style>
<script type = "text/javascript" src = "http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type = "text/javascript" language = "javascript">
  
		$(document).ready(function(){
				
			$(".error_form").hide();	
				
			var error_name = false;
			var error_add1 = false;
			var error_add2 = false;
			var error_zip = false;
			var error_city = false;
			var error_state = false;
			
			
			///////////////////////////////////////////////////////EVENT HANDLERS////////////////////////////////////////
			
	
			//////////////////////////////////////////////VALIDATION METHODS////////////////////////////////////////////////	
			function validateName(){
				var name  = new RegExp(/^[a-zA-Z ]*$/);
				if(name.test($(".namefield").val())){
					$(".name_error").hide();
			
				}
				else{
						$(".name_error").html("Enter Valid name between 3-25 characters. No special characters and digits allowed");
						$(".name_error").show();
						error_name = true;
				}
			}
			
			
			function validateAddress1(){
				var name  = new RegExp(/^[a-zA-Z0-9\-\s]+$/);
				if(name.test($(".add1").val())){
					$(".add1error").hide();
			
				}
				else{
						$(".add1error").html("Invalid Address. Only Alphanumeric Entries Allowed");
						$(".add1error").show();
						error_add1 = true;
				}
			}
			
			function validateAddress2(){
				var name  = new RegExp(/^[a-zA-Z0-9\-\s]+$/);
				if(name.test($(".add2").val())){
					$(".add2error").hide();
			
				}
				else{
						$(".add2error").html("Invalid Address. Only Alphanumeric Entries Allowed");
						$(".add2error").show();
						error_add2 = true;
				}
			}
			
			function validateCity(){
				var name  = new RegExp(/^[a-zA-Z]{2,25}$/);
				if(name.test($(".city").val())){
					$(".cityerror").hide();
			
				}
				else{
						$(".cityerror").html("Invalid City Name");
						$(".cityerror").show();
						error_city = true;
				}
			}
			
			function validateState(){
				var name  = new RegExp(/^[a-zA-Z]{3,25}$/);
				if(name.test($(".state").val())){
					$(".stateerror").hide();
			
				}
				else{
						$(".stateerror").html("Invalid State Name. Enter Full Name");
						$(".stateerror").show();
						error_state = true;
				}
			}
			
			function validateZip(){
				var name  = new RegExp(/^[0-9]{4,5}$/);
				if(name.test($(".zip").val())){
					$(".ziperror").hide();
			
				}
				else{
						$(".ziperror").html("Invalid Zip Code");
						$(".ziperror").show();
						error_zip = true;
				}
			}
			
			
			
			
			///////////////////////////////////////////////////////SUBMIT BUTTON VALIDATION///////////////////////////////////
			$(".deliveryForm").submit(function(){
				
				
				error_name = false;
				error_add1 = false;
				error_add2 = false;
				error_zip = false;
				error_city = false;
				var error_state = false;
			
				validateName();
				validateAddress1();
				validateAddress2();
				validateCity();
				validateState();
				validateZip();
				
				if(error_name == false && error_zip == false && error_state == false && error_city == false
						&& error_add1 == false && error_add2 == false){
					return true;
				}
				else{
					return false;
				}
				
			});
			
		});
  
		
  
  </script>




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
						<h3>Fill In Your Delivery Details</h3>
					</div>
					<div class="panel-body">
						<form action="payment.htm" method="POST" class="deliveryForm">

							
						<div class="form-group">
						<label for="fullname">Name:</label>
						<input type="text" class="form-control namefield" name="fullname" value="${sessionScope.customer.firstName} ${sessionScope.customer.lastName}" required="required"><br>
						<span class = "error_form name_error"></span><br>
						<label for="usr">Email ID:</label>
						<input type="email" class="form-control emailfield" name = "email" value="${sessionScope.customer.emailId}" required="required"><br>
						<span class = "error_form emailerror"></span><br>
						<label for="usr">Contact Number :</label>
						<input type="text" class="form-control" name = "contact" value="${sessionScope.customer.phoneNumber}" readonly = "true"><br>
						<span class = "error_form" id = "title_error"></span>
						<label for="usr">Shipping Address :</label>
						<input type="text" class="form-control add1" name = "address1" placeholder = "Address Line 1" required="required"><br>
						<span class = "error_form add1error"></span>
						<input type="text" class="form-control add2" name = "address2" placeholder = "Address Line 2" required="required"><br>
						<span class = "error_form add2error"></span><br>
						<input type="text" class="form-control city" name = "city" placeholder = "City" required="required"><br>
						<span class = "error_form cityerror"></span><br>
						<input type="text" class="form-control zip" name = "zip" placeholder = "Zip" required="required"><br>
						<span class = "error_form ziperror" id = "title_error"></span><br>
						<input type="text" class="form-control state" name = "state" placeholder = "State" required="required"><br>
						<span class = "error_form stateerror" id = "title_error"></span><br>
						</div>
									
							<input type="submit" value=" Proceed To Payment" class="btn btn-primary btn-block">
						</form>

					</div>
			</div>
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h3>Order Summary</h3>
					</div>
					
					<div class="panel-body">
						
					</div>
			</div>
		</div>
	</div>
	
</body>
</html>