<%-- 
    Document   : index
    Created on : 15 avr. 2016, 11:37:42
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
        <h1>Les chaussures</h1>
        <ul>
            <% 
                ArrayList<Product> products = CollectionProduct.example();
                for(Product element: products) {
            %>
            <li>
                <a href="detail.jsp?id=<%= element.getId() %>"><%= element.toStringName() %></a>
            </li>
            <%
                }
            %>
        </ul>
        
        
        
        <%
            if(null !=  session.getAttribute("user")) {
        %>
            Bonjour, utilisateur <%= session.getAttribute("user")  %>
        <%
            }
            else {
        %>
            <form action="formconnection.jsp">
                <input type="submit" name="connect" value="Se connecter">
            </form>
        <%
            }
        %>
        
    </body>
</html>
