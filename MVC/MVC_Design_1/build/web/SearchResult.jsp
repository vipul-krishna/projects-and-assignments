<%-- 
    Document   : SearchResult
    Created on : Feb 12, 2017, 2:39:59 AM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
        <style>
            thead{
                background-color:#E9967A;
            }
        </style>
    </head>
    <body>
        <h1>Your Search Results</h1>
        
        <p>Keyword: <c:out value="${sessionScope.searchWord}"/></p>
        <p>Search Type: <c:out value="${sessionScope.searchType}"/></p>
        
        <table border="1">
            
            <thead>
                <tr>
                    <th>Title</th>
                    <th>Actor</th>
                    <th>Actress</th>
                    <th>Genre</th>
                    <th>Year of Release</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${sessionScope.searchResult}" var="movie">
                    <tr>
                        
                        <td>${movie.name}</td>
                        <td>${movie.actor}</td>
                        <td>${movie.actress}</td>
                        <td>${movie.genre}</td>
                        <td>${movie.year}</td>
                        
        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <br>
        <a href='index.html'>Home Page</a><br><br>
            <a href='SearchMovie.jsp'>Search Movies</a>
        
    </body>
</html>
