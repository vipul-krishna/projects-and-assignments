<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order List</title>
</head>
<body>

<h1>Orders List</h1>

<h2>Below is the List of all orders placed</h2>
	
	<table border="1">
            
            <thead>
                <tr>
                    <th>OrderID</th>
                    <th>Customer Name</th>
                    <th>Customer Email</th>
                    <th>Customer Phone</th>
                    <th>Customer Address</th>
                    <th>Delivery Date</th>
                    <th>Order Worth</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach  var="order" items="${sessionScope.allOrderList}">
                    <tr>
                        
                        <td>${order.orderId}</td>
                        <td>${order.buyerName}</td>
                        <td>${order.buyerEmail}</td>
                        <td>${order.buyerPhone}</td>
                        <td>${order.deliveryAddress1}</td>
                        <td>${order.deliveryDate}</td>
                        <td>${order.orderTotalValue}</td>
                        
        
                    </tr>
                </c:forEach>
            </tbody>
        </table>


</body>
</html>