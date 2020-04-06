<%-- 
    Document   : hello
    Created on : 2020-03-31, 13:09:20
    Author     : pb41483
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <h1> Wyswietlanie cout</h1>
        <h1>Witaj, <c:out value="${obiekt.firstName}"/>  <c:out value="${obiekt.lastName}"/><br> Twój adres e-mail to  <a href="mailto:${obiekt.emailAddress}"> <c:out value="Mail"/></a></h1>
        
        <h1> Nie cout</h1>
        <h1>Witaj, ${obiekt.firstName} ${obiekt.lastName}<br> Twój adres e-mail to   <a href="mailto:${obiekt.emailAddress}">Mail</a></h1>
        

   
    </body>
</html>