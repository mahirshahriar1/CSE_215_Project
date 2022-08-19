package cse215Project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Employee extends User implements Serializable{

    Employee()
    {
        
    }
    Employee(int id, String password,String name) {
        super(id, password,name);
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
            if(saveProductsToFile())
                JOptionPane.showMessageDialog(null, "Successfully Added");
            else
                JOptionPane.showMessageDialog(null, "An Error Occured. Could not Add");
        }

        clearArrayList();

    }
      public boolean saveProductsToFile() {
        try {
            FileOutputStream file = new FileOutputStream("products.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);

            for (int i = 0; i < products.size(); i++) {
                outputFile.writeObject(products.get(i));
            }

            outputFile.close();
            return true;
            
   
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    

}
