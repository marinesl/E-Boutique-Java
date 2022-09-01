/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import java.util.ArrayList;

/**
 *
 * @author Marine
 */
public class CollectionUser {
    
    static ArrayList<User> users = new ArrayList<User>();
    
    private static void init() {
        User u1 = new User(1, "Michel", "Dupont", "michel.dupont@gmail.com", "azerty");
        User u2 = new User(2, "Marine", "Lancelin", "lancelinmarine@gmail.com", "azerty");
        User u3 = new User(3, "Séverine", "Vincent", "sevrine-vincent@hotmail.fr", "azerty");
        
        users.add(u1);
        users.add(u2);
        users.add(u3);
    }
    
    public static ArrayList<User> example() {
        if(users.isEmpty()) {
            init();
        }
        return users;
    }
    
    
}
