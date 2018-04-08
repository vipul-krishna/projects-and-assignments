<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SmartShoppers</title>
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
    <a href="" class="btn btn-info navbar-btn navbar-right">Create Account</a>

  </div>
</nav>


	<!-- <a href="user/register.htm">Register a new User</a><br/>
	
	<a href="user/vendorhome.htm">Are You A Vendor?</a>-->

	<!-- <h2>Login</h2>
	<form action="user/login" method="post">
	
		<table>
		<tr>
		    <td>Email ID:</td>
		    <td><input type="email" name="emailid" size="30" required="required" /></td>
		</tr>
		
		<tr>
		    <td>Password:</td>
		    <td><input type="password" name="password" size="30" required="required"/></td>
		</tr>
		
		<tr>
		    <td colspan="2"><input type="submit" value="Login" /></td>
		</tr>
				
		</table>

	</form>-->
	
	
	
	<!-- ----------------------------------------------------------------------------- -->
	
	<div class="jumbotron">
		<div class="container">
				
			<div class="panel panel-info">
			
					<div class="panel-heading">
						<h2>Please Sign in to get started</h2>
								<ul class="nav navbar-nav navbar-right">
										<li><a href="user/register.htm">Register a new User</a></li>
										<li><a href="user/vendorhome.htm">Are You A Vendor?</a></li>
								</ul>
					</div>
					
					<div class="panel-body">
								<form action="user/login" method="post">
	
									<table>
									<tr>
									    <td>Email ID:</td>
									    <td><input type="email" name="emailid" size="30" required="required" /></td>
									</tr>
									
									<tr>
									    <td>Password:</td>
									    <td><input type="password" name="password" size="30" required="required"/></td>
									</tr>
									
									<tr>
									    <td colspan="2"><input type="submit" value="Login" /></td>
									</tr>
											
									</table>

								</form>
						
					</div>
			</div>
		</div>
	</div>


</body>
</html>