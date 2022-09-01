/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

/**
 *
 * @author Marine
 */
public class User {
    
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public User(int id, String firstname, String lastname, String email, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getPassword() {
        return this.password;
    }
    
}
