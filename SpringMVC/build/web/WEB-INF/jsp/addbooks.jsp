<%-- 
    Document   : AddBooks
    Created on : Feb 12, 2017, 3:36:59 PM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Books</title>
        <style>

                table{
                        margin:auto;
                        border: 5px solid #000066;
                        width:600px;
                        border-spacing: 0;
                }

                th, td{
                        padding: 5px;
                        font-family: Arial, sans-serif;
                        border-style:none;
                }
                thead{
                    background-color: aqua;
                }
        
        </style>
        
    </head>
    
    <body>
        <h1>Please Add Details And Submit</h1>
      <form action="submitdetails.htm" method="post">  
        <table frame="box">
            <thead>
                <tr>
                    <th>ISBN</th>
                    <th>Book Title</th>
                    <th>Authors</th>
                    <th>Price</th>
                    
                </tr>
            </thead>
            
            <tbody>
                    <c:forEach var="i" begin="1" end="${sessionScope.count}">
                        <tr>
                            <!--<c:out value="isbn${i}"/><p>-->
                            <td><input type="text" name="isbn${i}" required></td>
                            <td><input type="text" name="title${i}" required></td>
                            <td><input type="text" name="author${i}" required></td>
                            <td><input type="text" name="price${i}" required></td>
			</tr>
                    </c:forEach>
            </tbody>
            <tfoot>
                <tr colspan="4">
                    <td><input type="submit" value="Submit Entries"></td> 
                </tr>
            </tfoot>
        </table>  
      </form>

    </body>
</html>
