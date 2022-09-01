/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marine
 */
public class Connection {
    
    private static Connection conn;
    
    // Connexion à la base de données
    static
    {	
        // Chargement du Driver
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch (Exception ex) {
            System.out.println("Erreur du chargement de Driver");
        }

        //Connexion à la Base de Données	       
        try {
            String bdd = "java_e_boutique"; //nom base de données
            String url = "jdbc:mysql://localhost/phpmyadmin/"+bdd; //URL de connexion à la base de données
            String user = "root"; // identifiant MySQL
            String passwd = ""; //mot de passe MySQL

            conn = (Connection) DriverManager.getConnection(url, user, passwd);   
        } 
        catch (Exception e) {
            System.out.println("Erreur de connexion à la BDD");
        }
    }
        
}
