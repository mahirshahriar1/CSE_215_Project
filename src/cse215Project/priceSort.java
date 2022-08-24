/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse215Project;

import java.util.Comparator;

/**
 *
 * @author Mahir
 */
 class priceSort implements Comparator<Product> {

    // override the compare() method
    public int compare(Product p1, Product p2) {
            if (p1.getPrice() == p2.getPrice()) {
                return 0;
            } else if (p1.getPrice() > p2.getPrice()) {
                return 1;
            } else {
                return -1;
            }
      

    }

}
