<%-- 
    Document   : detail
    Created on : 15 avr. 2016, 12:22:14
    Author     : Marine
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="boutique.Product,boutique.CollectionProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Détail de la chaussure</h1>
        <%            
            Product product = CollectionProduct.getProductById(Integer.parseInt(request.getParameter("id")));
        %>
        <h2><%= product.toStringName() %></h2>
        <p>Description : <%= product.toStringDescription() %></p>
        <p>Prix : <%= product.toStringPrice() %>€</p>
        <p>Marque : <%= product.toStringBrand() %></p>
        <p>Image : <img src="img/<%= product.getId() %>.jpg" alt="image" /></p>
    </body>
</html>
