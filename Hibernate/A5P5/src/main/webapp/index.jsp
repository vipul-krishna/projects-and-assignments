<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
            body{
                
                background-color: pink;
            }
        </style>
    </head>
    <body>
        <h2>How May Books Do You Want To Add?</h2>
        <form action="booksform.htm" method="get">
            
            <input type="number" name="count" min="1" max="10" required>
            <input type="submit" value="Proceed">
            
        </form>
        <!--  <% if (request.isUserInRole("customer")) { %>
			<h4>**If You Are A Customer, Please Visit Our Book Store To See Our Collection</h4>
		<% } %>-->
	<!--<c:set var="role" scope="session" value="${2000*2}"/>
	<c:if test="${salary > 2000}">
   			<p>My salary is: <c:out value="${salary}"/><p>
	</c:if>-->
    </body>
    
</html>