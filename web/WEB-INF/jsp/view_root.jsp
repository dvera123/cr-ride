<%-- 
    Document   : view_root
    Created on : 18/02/2013, 03:59:05 PM
    Author     : Vera
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>root Page</title>
    </head>
    <body>
        <c:forEach items="${rootList}" var="root" varStatus="status">
            <p>${root.startPoint}</p>
        </c:forEach>
    </body>
</html>
