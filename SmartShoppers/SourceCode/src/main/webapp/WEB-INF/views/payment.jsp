<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Payment Information</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<style type="text/css">
	
		.jumbotron{
			background-color: ;
		}
	
	</style>
	<script type = "text/javascript" src = "http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script type = "text/javascript" language = "javascript">
  
		$(document).ready(function(){
				
			$(".error_form").hide();	
				
			var error_card = false;
			var error_pin = false;
			//var error_date = false;
			
			
			///////////////////////////////////////////////////////EVENT HANDLERS////////////////////////////////////////
			
	
			//////////////////////////////////////////////VALIDATION METHODS////////////////////////////////////////////////	
			function validateCard(){
				var name  = new RegExp(/^[0-9]{10,16}$/);
				if(name.test($(".cardfield").val())){
					$(".carderror").hide();
			
				}
				else{
						$(".carderror").html("Invalid Card Number. Card Number can be 10-16 digits.");
						$(".carderror").show();
						error_card = true;
				}
			}
			
			
			function validatePin(){
				var name  = new RegExp(/^[0-9]{3,4}$/);
				if(name.test($(".pinfield").val())){
					$(".pinerror").hide();
			
				}
				else{
						$(".pinerror").html("Invalid Pin. Pin can be 3-4 digits");
						$(".pinerror").show();
						error_pin = true;
				}
			}
			
			function validateDate(){
				var name  = new RegExp(/^[a-zA-Z0-9]{2,500}$/);
				
			}
			
			
			
			
			
			
			///////////////////////////////////////////////////////SUBMIT BUTTON VALIDATION///////////////////////////////////
			$(".paymentform").submit(function(){
			
				error_card = false;
				error_pin = false;
				
				
				
				validateCard();
				validatePin();
				validateDate();
				if(error_card == false && error_pin == false){
					return true;
				}else{
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

<!-- <form action="review.htm" method="GET">

		
		
		Card Number : <input type = "text" name = "cardnumber" required="required"><br>
		Pin : <input type = "text" name = "pin" required="required"><br>
		Exp Month : <input type = "text" name = "expmonth" required="required"><br>
		Exp Year : <input type = "text" name = "expyear" required="required"><br>
		
		
		<input type="submit" value="review">

</form>-->

<div class="jumbotron">
		<div class="container">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3>Payment Information</h3>
					</div>
					<div class="panel-body">
						<form action="review.htm" method="POST" class="paymentform">

							
						<div class="form-group">
			
						<label for="usr">Card Number :</label>
						<input type="text" class="form-control cardfield" name = "cardnumber" placeholder = "Card Number" required="required"><br>
						<span class = "error_form carderror"></span><br>
						
						<label for="usr">Pin :</label>
						<input type="text" class="form-control pinfield" name = "pin" placeholder = "pin/cvv" required="required"><br>
						<span class = "error_form pinerror"></span><br>
						
						<label for="usr">Expiry Month :</label>
						<input type="text" class="form-control" name = "expmonth" placeholder = "MMM" required="required"><br>
						<span class = "error_form"></span><br>
						
						<label for="usr">Expiry Year :</label>
						<input type="text" class="form-control" name = "expyear" placeholder = "Year" required="required"><br>
						<span class = "error_form"></span><br>
						</div>
									
							<input type="submit" value="Review Your Order Details" class="btn btn-primary btn-block">
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