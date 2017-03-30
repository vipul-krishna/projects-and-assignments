<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <c:if test="${requestScope.action == null}">
            <form action="process.htm" method="post">
                <p>Please Enter the File Name:</p>
                <p><input type="text" name="filename" required="required"></p>
                <p><input type="submit" value="Get Details"/></p>
                <input type="hidden" name="action" value="stepone">
            </form>
        </c:if>
        
        <c:if test="${!empty requestScope.error}">
            <p>No such CSV file found.</p>
        </c:if>
        
        <c:if test="${requestScope.action == 'stepone'}">
            <form action="process.htm" method="post">
            
                    <table border="1">

                    <thead>
                        <tr>
                            <th>Sales Order ID</th>
                            <th>Revision Date</th>
                            <th>Order Date</th>
                            <th>Due Date</th>
                            <th>Ship Date</th>
                            <th>Status</th>
                            <th>Online Order Flag</th>
                            <th>Sales Order Number</th>
                            <th>Purchase Order Number</th>
                            <th>Account Number</th>
                            <th>Customer ID</th>
                            <th>SalesPerson ID</th>
                            <th>Territory ID</th>
                            <th>Bill To Address ID</th>
                            <th>Ship To Address ID</th>
                            <th>Ship Method ID</th>
                            <th>Credit Card ID</th>
                            <th>Credit Card Approval Code</th>
                            <th>Currency Rate ID</th>
                            <th>SubTotal</th>
                            <th>Tax Amount</th>
                            <th>Freight</th>
                            <th>Total Due</th>
                            <th>Comment</th>
                            <th>Modified Date</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                            <c:set var="i" value="1" scope="page" />
                            <c:forEach items="${sessionScope.orderList}" var="order">
                                
                                    <tr> 
                                        
                                        <td><input type="text" name="orderID${i}" value="${order.salesOrderID}" required></td>
                                        <td><input type="text" name="revisionNumber${i}"  value="${order.revisionNumber}" required></td>
                                        <td><input type="text" name="orderDate${i}"  value="${order.orderDate}" required></td>
                                        <td><input type="text" name="dueDate${i}"  value="${order.dueDate}" required></td>
                                        <td><input type="text" name="shipDate${i}"  value="${order.shipDate}" required></td>
                                        <td><input type="text" name="status${i}"  value="${order.status}" required></td>
                                        <td><input type="text" name="onlineOrderFlag${i}"  value="${order.onlineOrderFlag}" required></td>
                                        <td><input type="text" name="salesOrderNumber${i}"  value="${order.salesOrderNumber}" required></td>
                                        <td><input type="text" name="purchaseOrderNumber${i}"  value="${order.purchaseOrderNumber}" required></td>
                                        <td><input type="text" name="accountNumber${i}"  value="${order.accountNumber}" required></td>
                                        <td><input type="text" name="customerID${i}"  value="${order.customerID}" required></td>
                                        <td><input type="text" name="salesPersonID${i}"  value="${order.salesPersonID}" required></td>
                                        <td><input type="text" name="territoryID${i}"  value="${order.territoryID}" required></td>
                                        <td><input type="text" name="billToAddressID${i}"  value="${order.billToAddressID}" required></td>
                                        <td><input type="text" name="shipToAddressID${i}"  value="${order.shipToAddressID}" required></td>
                                        <td><input type="text" name="shipMethodID${i}"  value="${order.shipMethodID}" required></td>
                                        <td><input type="text" name="creditCardID${i}"  value="${order.creditCardID}" required></td>
                                        <td><input type="text" name="creditCardApprovalCode${i}"  value="${order.creditCardApprovalCode}" required></td>
                                        <td><input type="text" name="currencyRateID${i}"  value="${order.currencyRateID}" required></td>
                                        <td><input type="text" name="subTotal${i}"  value="${order.subTotal}" required></td>
                                        <td><input type="text" name="taxAmt${i}"  value="${order.taxAmt}" required></td>
                                        <td><input type="text" name="freight${i}"  value="${order.freight}" required></td>
                                        <td><input type="text" name="totalDue${i}"  value="${order.totalDue}" required></td>
                                        <td><input type="text" name="comment${i}"  value="${order.comment}" required></td>
                                        <td><input type="text" name="modifiedDate${i}"  value="${order.modifiedDate}" required></td>
                                        
                                    </tr>
                                  
                                  <c:set var="i" value="${i + 1}" scope="page"/>  
                            </c:forEach>
                                
                                  

                    </tbody>
                </table>
              <p><input type="submit" value="Add Details Into DB"/></p> 
              <input type="hidden" name="action" value="steptwo">
            </form>  
        </c:if>
        
        <c:if test="${requestScope.action == 'steptwo'}">
            <h1><c:out value="${sessionScope.rows}"/> Rows Inserted</h1>
        </c:if>
       
        
    </body>
</html>
