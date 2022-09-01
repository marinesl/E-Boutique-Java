<%-- 
    Document   : formconnection
    Created on : 15 avr. 2016, 14:48:43
    Author     : Marine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion</title>
    </head>
    <body>
        <h1>Se connecter</h1>
        <form action="Connect" method="post">
            <label for="email">E-mail</label>
            <input type="text" name="email" id="email">
            <label for="password">Mot de passe</label>
            <input type="password" name="password" id="password">
            <input type="submit" name="connection" value="Connexion">
        </form>
        <div class="error">
            <%
               if(null != session.getAttribute("errors")) {
            %>
                Votre e-mail ou votre mot de passe est incorrect. Veuillez vous reconnecter.
            <%
                }
               
            %>
 
        </div>
    </body>
</html>
