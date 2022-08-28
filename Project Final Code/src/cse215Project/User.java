package cse215Project;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

 class PComparator implements Comparator<Product> {

    // override the compare() method
    public int compare(Product p1, Product p2) {
        if (p1.getType().equals(p2.getType())) {
            if (p1.getId() == p2.getId()) {
                return 0;
            } else if (p1.getId() > p2.getId()) {
                return 1;
            } else {
                return -1;
            }

        } else {
            return p1.getType().compareTo(p2.getType());
        }

    }

}

public class User implements Serializable {

    protected int id;
    protected String password, name;
    ArrayList<Product> products = new ArrayList<Product>();

    ;
    
    User() {

    }

    User(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void clearArrayList() {
        products.clear();
    }

    public void populateArrayList() {
        try {
            FileInputStream file = new FileInputStream("Products.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            boolean endOfFile = false;

            while (!endOfFile) {
                try {
                    products.add((Product) inputFile.readObject());
                } catch (EOFException e) {
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }

            }
            inputFile.close();
        } catch (IOException e) {

        }
        Collections.sort(products, new PComparator());
    }

    public void seeProducts(User e) {
        seeProductsFrame temp = new seeProductsFrame(e);
        temp.setVisible(true);
        temp.setLocationRelativeTo(null);
    }

    public void searchProducts(int id) {
        // need to change ig
        for (Product x : products) {
            if (x.getId() == id) {
                System.out.println("Product Found");
                System.out.println(x.toString());
                break;
            }
        }
    }

    public void logout() {
        //this.dispose or smth kore main minue ke call
    }

}
