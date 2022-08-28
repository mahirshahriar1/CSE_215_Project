package cse215Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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


public class Cart {

    public static ArrayList<Product> cart = new ArrayList<Product>();

    Employee e = new Employee();
    Cart()
    {
     Collections.sort(cart, new PComparator());
    }

    Cart(ArrayList<Product> products) {
        cart = products;
          Collections.sort(cart, new pComparator());
    }

    public void clearCart() {
        cart.clear();
    }

    public void editProducts() {
        e.populateArrayList();
        for (int i = 0; i < e.products.size(); i++) {
            for (int j = 0; j < cart.size(); j++) {

                if (e.products.get(i).getId() == cart.get(j).getId()) {
                    e.products.get(i).setQuantity(e.products.get(i).getQuantity()-cart.get(j).getQuantity());
                    break;

                }
            }
        }
        e.saveProductsToFile();
        e.clearArrayList();
        clearCart();

    }
    

}
