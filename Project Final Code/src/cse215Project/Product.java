package cse215Project;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private int quantity;
    private String name;
    private double price;
    private String type;

    public Product(int id, int quantity, String name, double price, String type) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", quantity=" + quantity + ", name=" + name + ", price=" + price + ", type=" + type + '}';
    }      
    
    
}