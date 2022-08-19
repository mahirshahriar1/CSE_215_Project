/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse215Project;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Admin  extends User{
    
     ArrayList<Employee> employees=new ArrayList<Employee>();
    Admin()
    {
        
    }
    Admin(int id, String password, String name) {
        super(id, password, name);
    }
    public void populateArrayListEmployee()
    {
         try{
            FileInputStream file=new FileInputStream("emp.dat");
            ObjectInputStream inputFile=new ObjectInputStream(file);
            
            boolean endOfFile=false;
     
            while(!endOfFile)
            {
                try{
                    employees.add((Employee)inputFile.readObject());
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
            e.printStackTrace();
        }
    }
    
    public boolean checkUniqueID(int id) {
        for (int i = 0; i < employees.size(); i++) {
              if (id == employees.get(i).getId()) {
                return false;
            }
        }
        return true;

    }
    
      public boolean checkUniqueID_edit(int id,int ind) {
        for (int i = 0; i < employees.size(); i++) {
            if(i==ind)
                continue;
              if (id == employees.get(i).getId()) {
                return false;
            }
        }
        return true;

    }

    public void addEmployees(int id, String password, String name) {
        populateArrayListEmployee();
        Employee emp = new Employee(id, password,name);
        
        if (!checkUniqueID(id)) {
 
            JOptionPane.showMessageDialog(null, "Copy Id");
        } else {
             employees.add(emp);
             if(saveEmpToFile())
                JOptionPane.showMessageDialog(null, "Succesfully Added");
             else
                 JOptionPane.showMessageDialog(null, "An Error Occured while adding employee");
        }
        employees.clear();

    }
      public boolean saveEmpToFile() {
        try {
            FileOutputStream file = new FileOutputStream("emp.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);

            for (int i = 0; i < employees.size(); i++) {
                outputFile.writeObject(employees.get(i));
            }

            outputFile.close();
            
   
        } catch (IOException e) {
            e.printStackTrace();
            return false;      
                  
        }
        return true;
            
    }
       
    
    
}
