package boutique;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marine
 */
public class Product {
    
    private int id;
    private String title;
    private String description;
    private double price;
    private Brand brand;
    
    public Product(int id, String title, String description, double price, Brand brand) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.brand = brand;
    }
    
    public String toStringName() {
        return this.title;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String toStringDescription() {
        return this.description;
    }
    
    public double toStringPrice() {
        return this.price;
    }
    
    public Brand toStringBrand() {
        return this.brand;
    }
    
}
