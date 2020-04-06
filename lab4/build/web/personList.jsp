<%-- 
    Document   : personList
    Created on : 2020-03-31, 14:47:01
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
        <h1> Tabelka Osob</h1>
       <table border=1>
           
            <tr>
                <td> <h3>imie</h3></td> <td><h3> nazwisko</h3></td> <td><h3> e-mail</h3></td>
    </tr>
        <c:forEach items="${osoby}" var="osoba">
    <p>
   
       
        <tr>
            
            <td>${osoba.firstName}</td><td>${osoba.lastName}</td><td>${osoba.emailAddress}</td>
        </tr>
   
    </p>
</c:forEach>
         
    </table>
    </body>
</html>