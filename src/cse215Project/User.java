package cse215Project;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import javax.swing.JOptionPane;

public class User {
    protected int id;
    protected String password;
    ArrayList <Product> products=new ArrayList<Product>();;
    
    User()
    {
        
    }
    User(int id, String password)
    {
        this.id=id;
        this.password=password;

    }
    public void clearArrayList()
    {
        products.clear();
    }
    public void populateArrayList()
    {
        try{
            FileInputStream file=new FileInputStream("Products.dat");
            ObjectInputStream inputFile=new ObjectInputStream(file);
            
            boolean endOfFile=false;
     
            while(!endOfFile)
            {
                try{
                    products.add((Product)inputFile.readObject());
                }catch(EOFException e)
                {
                     endOfFile=true;
                }catch(Exception f)
                {
                      JOptionPane.showMessageDialog(null, f.getMessage());
                }             
                
            }
            inputFile.close();
        }catch(IOException e)
        {
            
        }
    }
    public void seeProducts(User e)
    { 
        new seeProductsFrame(e).setVisible(true);
    }
    
    public void searchProducts(int id)
    {
        // need to change ig
        for(Product x: products)
        {
            if(x.getId()==id)
            {
                System.out.println("Product Found");
                System.out.println(x.toString());
                break;
            }
        }
    }
    
    public void logout()
    {
        //this.dispose or smth kore main minue ke call
    }
    
    
}
