<%-- 
    Document   : AddMovie
    Created on : Feb 10, 2017, 1:10:47 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add A New Movie</h1>
        <h2>Please Enter The Movie Details</h2>
        
        <form action="AddMovieServlet" method ="get">
            
            Movie Title: <input type ="text" name="title"><br><br>
            Lead Actor: <input type ="text" name="actor"><br><br>
            Lead Actress: <input type ="text" name="actress"><br><br>
            Genre: <input type ="text" name="genre"><br><br>
            Year: <input type ="text" name="year"><br><br>

            <input type="submit" value="Send">  
            
        </form> 
            
        
    </body>
</html>
