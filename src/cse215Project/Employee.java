package cse215Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Employee extends User {

    Employee()
    {
        
    }
    Employee(int id, String password) {
        super(id, password);
    }

    public boolean checkUniqueID(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                return false;
            }
        }
        return true;

    }

    public void addProducts(int id, int quantity, String name, double price, String type) {
        populateArrayList();
        Product product = new Product(id, quantity, name, price, type);
        if (!checkUniqueID(id)) {
            JOptionPane.showMessageDialog(null, "Copy Id");
        } else {
            products.add(product);
             saveProductsToFile();
        }

        clearArrayList();

    }
      public void saveProductsToFile() {
        try {
            FileOutputStream file = new FileOutputStream("products.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);

            for (int i = 0; i < products.size(); i++) {
                outputFile.writeObject(products.get(i));
            }

            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Saved");
            
   
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    

}
