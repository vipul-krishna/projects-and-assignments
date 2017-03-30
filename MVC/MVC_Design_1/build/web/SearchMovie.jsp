<%-- 
    Document   : SearchMovie
    Created on : Feb 10, 2017, 1:11:30 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                
                background-color: yellow;
            }
        </style>
        
    </head>
    <body>
        <h1>Search Movies</h1>
        <form action="SearchMovieServlet" method="get">
          
                                
                Search Keyword <input type="text" name="searchWord" required/> <br/><br/>
                <input type="radio" name="searchType" value="title" checked=""/> Search By Title<br>
                <input type="radio" name="searchType" value="actor"/> Search By Actor<br>
                <input type="radio" name="searchType" value="actress"/> Search By Actress<br>
                <br/><input type="submit" value="SEARCH"/>
            
            
        </form>
        
    </body>
</html>
