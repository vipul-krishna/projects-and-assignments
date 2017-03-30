<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <body>
        <h2>How May Books You Want To Add?</h2>
        <form action="addnew.htm" method="post">
            
            <input type="number" name="count" min="1" max="10" required>
            <input type="submit" value="Proceed">
            
        </form>
    </body>
    </body>
</html>
